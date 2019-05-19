package alexander.j.paul.fusion;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import alexander.j.paul.fusion.Catalyst;
import alexander.j.paul.fusion.FloatCatalyst;
import alexander.j.paul.fusion.FloatReactor;
import alexander.j.paul.fusion.Fusion;

public class FusionTabDataTestModel {
	
	//******************************String Formatting******************************\\

	public static final String POUND_FORMAT = "%s: %,.0flbs";
	public static final String PERCENT_FORMAT = "%s: %.0f%%";
	public static final String INTEGER_FORMAT = "%s: %.0f";
	public static final String RATIO_FORMAT = "%s: %.1f";
	public static final BiFunction<String, Float, String> OGE_CAP_FORMAT = (name, value) -> String.format("%s: %,.0flbs %.1f%%", name, value, (value/200f));	
	
	public static final String FUSION_PERCENT_FORMAT = "%s: %s = %.0f%%";
	public static final String FUSION_WEIGHT_FORMAT = "%s: %s = %,.0flbs";
		
	//******************************Tab-Data Table IO******************************\\

	/**
	 * Changed by user. See {@link #setTemp(float)}.
	 */
	public final Catalyst temp = new FloatCatalyst("Temperature", 32f, -45f, 55f)
			.formattedTo(INTEGER_FORMAT);
	
	/**
	 * Changed by user. See {@link #setPA(float)}.
	 */
	public final Catalyst pa = new FloatCatalyst("PA", 1000f, 0f, 16_000f)
			.formattedTo(INTEGER_FORMAT);
	
	/**
	 * Changed by user. See {@link #setATF(float)}.
	 */
	public final Catalyst atf = new FloatCatalyst("ATF", 1f, 0.9f, 1.0f)
			.formattedTo(RATIO_FORMAT);

	//******************************Tab Data Suppliers******************************\\

	public final Supplier<Float> getIGE = () -> TabDataTables.get_q_ige_percent(atf.getValue(), pa.getValue(), temp.getValue());
	public final Supplier<Float> getOGE = () -> TabDataTables.get_q_oge_percent(atf.getValue(), pa.getValue(), temp.getValue());
	public final Supplier<Float> getMAX = () -> TabDataTables.get_max_q_percent(atf.getValue(), pa.getValue(), temp.getValue());
	public final Supplier<Float> getGW = () -> (TabDataTables.getGrossWeight(atf.getValue(), pa.getValue(), temp.getValue()) * 100f);
		
	//******************************Weights******************************\\

	/**
	 * Can be changed by user depending on {@link #findHover} boolean.
	 * <p> If true, then fusion based on {@link #findZFWeightReaction}. 
	 */
	public final Catalyst zfWieght = new FloatCatalyst("ZF Weight", 16000f, 0f, 22_000f)
			//.formatWithFusion(FUSION_WEIGHT_FORMAT)
			.formattedTo(POUND_FORMAT);

	/**
	 * Changed by user. Effects {@link #zfWieght} and {@link #totalWeight} depending on {@link #findHover} boolean.
	 */
	public final Catalyst fuelWeight = new FloatCatalyst("Fuel Weight", 0f, 0f, 2400f)
			.formattedTo(POUND_FORMAT);

	/**
	 * Fusion dependent on {@link #findHover} boolean.
	 * <p> If true, then fusion based on {@link #findWeightNormalReaction},
	 * <p> else based on {@link #findWeightWithHoverReaction}.
	 */
	public final Catalyst totalWeight = new FloatReactor("Total Weight")
			//.formatWithFusion(FUSION_WEIGHT_FORMAT)
			.formattedTo(POUND_FORMAT);
	
	/**
	 * Fusion dependent on {@link #atf}, {@link #temp}, and {@link #pa}.
	 * <p> Calculated by {@link #getGW}.
	 * @see TabDataTables
	 */
	public final Catalyst grossWeight = new FloatCatalyst("Gross Weight", 0f)
			.formattedTo(POUND_FORMAT)
			.fuse(getGW, atf, pa, temp);

	/**
	 * Fusion dependent on {@link #grossWeight} - {@link #totalWeight}.
	 */
	public final Catalyst ogeCapability = new FloatReactor("OGE Capability")
			//.formatWithFusion(FUSION_WEIGHT_FORMAT)
			.formattedTo(OGE_CAP_FORMAT)
			.fuse(grossWeight.subtractBy(totalWeight));
	
	//******************************Percents******************************\\

	/**
	 * Fusion dependent on {@link #atf}, {@link #temp}, and {@link #pa}.
	 * <p> Calculated by {@link #getIGE}.
	 * @see TabDataTables
	 */
	public final Catalyst q_ige_percent = new FloatReactor("Q ~ IGE")
			.formattedTo(PERCENT_FORMAT)
			.fuse(getIGE, atf, pa, temp);
	
	/**
	 * Fusion dependent on {@link #atf}, {@link #temp}, and {@link #pa}.
	 * <p> Calculated by {@link #getOGE}.
	 * @see TabDataTables
	 */
	public final Catalyst q_oge_percent = new FloatReactor("Q ~ OGE")
			.formattedTo(PERCENT_FORMAT)
			.fuse(getOGE, atf, pa, temp);
	
	/**
	 * Fusion dependent on {@link #atf}, {@link #temp}, and {@link #pa}.
	 * <p> Calculated by {@link #getMAX}.
	 * @see TabDataTables
	 */
	public final Catalyst max_q_percent = new FloatReactor("Max TRQ")
			.formattedTo(PERCENT_FORMAT)
			.fuse(getMAX, atf, pa, temp);

	/**
	 * Can be changed by user depending on {@link #findHover} boolean. 
	 * <p> If true, then fusion based on {@link #findHoverReaction}.
	 */
	public final Catalyst hoverPercent = new FloatCatalyst("Hover", 50f)
			//.formatWithFusion(FUSION_PERCENT_FORMAT)
			.formattedTo(PERCENT_FORMAT);

	//******************************Dynamic Fusions******************************\\

	/**
	 * Fusion consisting of: {@link #q_ige_percent} - ({@link #ogeCapability} / 200)
	 * <p> Used to find {@link #hoverPercent} if {@link #findHover} set to true.
	 */
	public final Fusion findHoverReaction = q_ige_percent.subtractBy(ogeCapability.divideBy(200f));
	
	/**
	 * Fusion consisting of: -(({@link #q_ige_percent} * 200 - {@link #grossWeight}) - ({@link #hoverPercent} * 200))
	 * <p> Used to find {@link #totalWeight} if {@link #findHover} set to false.
	 */
	public final Fusion findWeightWithHoverReaction = q_ige_percent.multiply(200f)
													.subtractBy(grossWeight)
													.subtractBy(hoverPercent.multiply(200f))
													.negate();

	/**
	 * Fusion consisting of: {@link #zfWieght} + {@link #fuelWeight}
	 * <p> Used to find {@link #totalWeight} if {@link #findHover} set to true.
	 */
	public final Fusion findWeightNormalReaction = zfWieght.add(fuelWeight);

	/**
	 * Fusion consisting of: {@link #totalWeight} - {@link #fuelWeight}
	 * <p> Used to find {@link #zfWieght} if {@link #findHover} set to false;
	 */
	public final Fusion findZFWeightReaction = totalWeight.subtractBy(fuelWeight);
	
	//******************************Setters******************************\\

	/**
	 * Dictates fusion of {@link #hoverPercent}, {@link #totalWeight}, and {@link #zfWieght}.
	 * <p> See {@link #setHoverPercent(float)} and {@link #setZFWeight(float)}.
	 * <p> Initialized on first use by {@link #initialize()}. 
	 */
	public boolean findHover;
	
	/**
	 * Sets proper fusions for {@link #setHoverPercent(float)}, {@link #totalWeight}, and {@link #zfWieght}
	 * <p> based on {@link #findHover} set to true.
	 * <p> Fusions involved are {@link #findWeightNormalReaction} and {@link #findHoverReaction}.
	 */
	public void setFindHover() {
		if(!findHover) {
			findHover = true;
			zfWieght.defuse();
			totalWeight.defuse();

			totalWeight.fuse(findWeightNormalReaction);
			hoverPercent.fuse(findHoverReaction);
		}
	}
	
	/**
	 * Sets proper fusions for {@link #setHoverPercent(float)}, {@link #totalWeight}, and {@link #zfWieght}
	 * <p> based on {@link #findHover} set to false.
	 * <p> Fusions involved are {@link #findWeightWithHoverReaction} and {@link #findZFWeightReaction}.
	 */
	public void setFindWeight() {
		if(findHover) {
			findHover = false;
			hoverPercent.defuse();
			totalWeight.defuse();
			
			totalWeight.fuse(findWeightWithHoverReaction);
			zfWieght.fuse(findZFWeightReaction);
		}
	}
	
	/**
	 * Automatically sets proper fusions based on {@link #setFindWeight()}.
	 * @param newHoverPercent - to be set within a percentage of 0 to 100.
	 */
	public void setHoverPercent(final float newHoverPercent) {
		setFindWeight();
		hoverPercent.setValue(newHoverPercent);
	}
	
	/**
	 * Automatically sets proper fusions based on {@link #setFindHover()}.
	 * @param newZfWeight - to be set within 0 to 22,000 lbs.
	 */
	public void setZFWeight(final float newZfWeight) {
		setFindHover();
		zfWieght.setValue(newZfWeight);
	}
	
	/**
	 * @param fuel - to be set within 0 to 2,400 pounds.
	 */
	public void setFuelWeight(final float fuel) {
		fuelWeight.setValue(fuel);
	}
	
	/**
	 * @param newATF - to be set within a ratio of 0.9 to 1.0 
	 */
	public void setATF(final float newATF) {
		atf.setValue(newATF);
	}
	
	/**
	 * @param newTemp - to be set within -45 to 55 degrees C
	 */
	public void setTemp(final float newTemp) {
		temp.setValue(newTemp);
	}
	
	/**
	 * @param newPA - to be set within 0 to 16,000 feet.
	 */
	public void setPA(final float newPA) {
		pa.setValue(newPA);
	}
	
	//******************************Initialization******************************\\

	private enum TabDataSingleton{
		INSTANCE;
		private FusionTabDataTestModel onlyInstance = new FusionTabDataTestModel();
	}
	
	private FusionTabDataTestModel() {
		initialize();
	}

	/**
	 * Sets {@link #findHover} to true and sets up proper fusions.
	 * <p> See {@link #setFindHover()}.
	 */
	private void initialize() {
		findHover = true;
		totalWeight.fuse(findWeightNormalReaction);
		hoverPercent.fuse(findHoverReaction);
	}
	public static FusionTabDataTestModel get() {
		return TabDataSingleton.INSTANCE.onlyInstance;
	}
	
	//******************************Basic Output******************************\\
	
	@Override
	public String toString() {
		String ln = "\n";
		StringBuilder data = new StringBuilder("Tab Data: Find ");
		data.append(findHover == true ? "Hover\n" : "Weight\n");
		data.append(atf);
		data.append(ln);
		data.append(temp);
		data.append(ln);
		data.append(pa);
		data.append(ln);
		data.append(totalWeight);
		data.append(ln);
		data.append(grossWeight);
		data.append(ln);
		data.append(q_ige_percent);
		data.append(ln);
		data.append(q_oge_percent);
		data.append(ln);
		data.append(max_q_percent);
		data.append(ln);
		data.append(hoverPercent);
		data.append(ln);
		data.append(zfWieght);
		data.append(ln);
		data.append(ogeCapability);
		

		return data.toString();
	}
	
}