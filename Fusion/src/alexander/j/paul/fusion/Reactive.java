package alexander.j.paul.fusion;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Skeleton class for basic and advanced creation of reactive objects 
 * based on the subject-observer and mediator design patterns.
 * @author Alexander Paul
 *
 * @param <E> The reactive subtype of itself.
 */
public abstract class Reactive<E extends Reactive<?>> extends Formative<E> {
	
	/**
	 * To be used to compute a new value based on Catalyst(s) involved in Fusion.
	 */
	protected Fusion fusion = null;
	
	private static final String DEFAULTFUSIONFORMAT = "%s: %s = %.2f";
	private String fusionFormat = DEFAULTFUSIONFORMAT;
	private boolean useFusionFormat = false;
	
	private boolean reactive = false;
	private Consumer<E> onChangeConsumeThis = null;
	private Consumer<Float> onChangeConsumeValue = null;
	private Runnable onChangeRun = null;
	
	/**
	 * Invoked when this reactive's value changes.
	 * @param consumeThis - consumer that excepts this on change.
	 * @return this
	 */
	public E onChangeConsume(Consumer<E> consumeThis) {
		reactive = true;
		onChangeConsumeThis = consumeThis;
		onChangeConsumeValue = null;
		onChangeRun = null;
		return getThis();
	}

	/**
	 * Invoked when this reactive's value changes.
	 * @param consumeThisValue - consumer that excepts this reactive's value.
	 * @return this
	 */
	public E onChangeConsumeValue(Consumer<Float> consumeThisValue) {
		reactive = true;
		onChangeConsumeThis = null;
		onChangeConsumeValue = consumeThisValue;
		onChangeRun = null;
		return getThis();

	}

	/**
	 * Invoked when this reactive's value changes.
	 * @param doSomething - runnable that runs on change.
	 * @return this
	 */
	public E onChangeRun(Runnable doSomething) {
		reactive = true;
		onChangeConsumeThis = null;
		onChangeConsumeValue = null;
		onChangeRun = doSomething;
		return getThis();

	}
	
	/**
	 * Clears all onChange Runnable or Consumer set by {@link #onChangeRun(Runnable)}
	 * and {@link #onChangeConsume(Consumer)}.
	 */
	public void clearOnChangeActions() {
		reactive = false;
		onChangeConsumeThis = null;
		onChangeConsumeValue = null;
		onChangeRun = null;
	}
	
	/**
	 * Invokes any Consumer or Runnable.
	 */
	protected void fireOnChangeEvent() {
		if(reactive) {
			if(onChangeConsumeThis != null) onChangeConsumeThis.accept(getThis());
			else if(onChangeConsumeValue != null) onChangeConsumeValue.accept(value);
			else if(onChangeRun != null) onChangeRun.run();
			else throw new RuntimeException("Reactive entity reached end of onChange actions in react() method despite reative boolean == true.");
		}
	}
		
	void ifFusedThrowError() {
		if(isFused()) throw new RuntimeException("Reactor is already fused, must unfuse first");
	}
	
	/**
	 * Disconnects from any Reactive involved in the {@link #fusion}
	 */
	public void diffuse() {
		if(isFused()) {
			fusion.diffuse(this);
			fusion = null;
		}
	}
	
	public boolean isFused() {
		return fusion != null;
	}
	
	/**
	 * Will compute new value based on Supplier, if provided Catalysts change.
	 * @param specialFusion to be computed on change.
	 * @param catalysts to be observed for change.
	 * @return itself.
	 * @see Fusion
	 * @see Catalyst
	 */
	public E fuse(String fusionName, Supplier<Float> specialFusion, Catalyst...catalysts) {
		ifFusedThrowError();
		fusion = new Fusion(fusionName, specialFusion, catalysts);
		fusion.infuse(this);
		react();
		return getThis();
	}
	
	/**
	 * Will compute value based on provided Catalyst value.
	 * @param catalyst to observe for change.
	 * @return itself
	 * @see Catalyst
	 */
	public E fuse(Catalyst catalyst) {
		ifFusedThrowError();
		fusion = new Fusion(catalyst);
		fusion.infuse(this);
		react();
		return getThis();
	}
	
	/**
	 * Will compute value based on Fusion of catalysts.
	 * @param newFusion to get computed value from based on catalysts involved in fusion.
	 * @return itself
	 * @see Fusion
	 * @see Catalyst
	 */
	public E fuse(Fusion newFusion) {
		ifFusedThrowError();
		fusion = newFusion;
		fusion.infuse(this);
		react();
		return getThis();

	}
	
	/**
	 * Extended classes will implement this in which gets called on change of a reactive value.
	 */
	protected abstract void react();
	
	/**
	 * If {@link #useFusionFormat(boolean)} set to true and {@link #isFused()},
	 * <p> {@link #toString()} will return this as {@code String.format(fusionFormat, name, fusion, value)}.
	 * @param newFusionFormat
	 * @return itself.
	 */
	public E formattedWithFusion(String newFusionFormat) {
		fusionFormat = newFusionFormat;
		useFusionFormat = true;
		return getThis();
	}
	
	/**
	 * Enables the use of {@code String.format(fusionFormat, name, fusion, value)} for the 
	 * <p> {@link #toString()} method.
	 * @param enableFusionFormat 
	 * @return itself
	 */
	public E useFusionFormat(boolean enableFusionFormat) {
		useFusionFormat = enableFusionFormat;
		return getThis();
	}
	
	public boolean isUsingFusionFormat() {
		return useFusionFormat;
	}
	
	/**
	 * @return the String representation of the {@link #Fusion} that is fused,
	 * <p> else the {@link Formative#toString()} is used.
	 */
	public String getFusionString() {
		return isFused() ? fusion.toString() : super.toString();
	}
	
	/**
	 * @return the String with fusion format if fused,
	 * <p> {@link #formattedWithFusion(String)} is set and if {@link #useFusionFormat} is true,
	 * else {@link Formative#toString()} is used.
	 */
	@Override
	public String toString() {
		return isFused() && useFusionFormat ? String.format(fusionFormat, name, fusion, value) : super.toString();
	}
	
}
