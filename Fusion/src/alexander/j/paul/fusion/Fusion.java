package alexander.j.paul.fusion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Fusion consists of Catalyst(s) in which are observed by Reactive(s).
 * <p> A Fusion returns a result of the expression composed by the Catalysts.
 * <p> A Fusion is similar to the Bridge Pattern since a Reactive delegates it's {@link Reactive#react()} to this {@link #fire()}.
 * <p> A Fusion is similar to the Mediator Pattern since Reactive and Catalyst 
 * communication is controlled though the Fusion for Fusing and Diffusing.
 * <p> A Fusion also simulates the Builder Pattern to compose into another Fusion using other Fusions and Catalysts.
 * @author Alexander Paul
 *
 */
public class Fusion extends Expression implements Fusible {
	
	/**
	 * Catalyst(s) involved in this Fusion. Used to {@link #infuse(Reactive)} and {@link #diffuse(Reactive)} Reactive(s).
	 */
	private final Set<Catalyst> catalysts = new HashSet<>();
	
	/**
	 * The reaction created by the Expression of the Catalysts. 
	 * Takes in any value and computes with most recent Catalyst values to return new result.
	 */
	Function<Float,Float> reaction;
		
	/**
	 * Fusion in which returns the Catalyst Identity value.
	 * @param initialCatalyst to observed.
	 */
	Fusion(Catalyst initialCatalyst) {
		super(() -> initialCatalyst.toString());
		catalysts.add(initialCatalyst);
		reaction = noMatter -> initialCatalyst.value;
	}
	
	/**
	 * A custom computation which is invoked to compute new value on observed changes in provided dependencies.
	 * @param fusionName name of computation.
	 * @param specialReaction to be used to return new value.
	 * @param dependencies to be observed for change.
	 */
	Fusion(String fusionName, Supplier<Float> specialReaction, Catalyst...dependencies) {
		super(() -> fusionName + ": " + Arrays.toString(dependencies));
		for (Catalyst catalyst : dependencies) {
			this.catalysts.add(catalyst);
		}
		reaction = noMatter -> specialReaction.get();
	}
	
	/**
	 * Lets expression know it has changed for future calls of {@link #toString()}.
	 * @return result of reaction.
	 */
	float fire() {
		changed = true;
		return reaction.apply(0f);
	}
	
	/**
	 * Connects all catalysts in this reaction to a new observer/Reactive,
	 * so the Reactive may {@link Reactive#react()} to any Catalyst changes.
	 * @param reactor to update it's value with this Fusion reaction.
	 */
	void infuse(Reactive<?> reactor) {
		catalysts.forEach(catalyst -> catalyst.infuse(reactor));
	}
	
	/**
	 * Disconnects Reactive from observing for changes involved in this Fusion.
	 * @param reactor to diffuse.
	 */
	void diffuse(Reactive<?> reactor) {
		catalysts.forEach(catalyst -> catalyst.defuse(reactor));
	}
	
	/******************************Utility Methods******************************/

	private Fusion fuse(Function<Float,Float> fuse) {
		reaction = reaction.andThen(fuse);
		return this;
	}
	
	private Fusion fuse(Catalyst newCatalyst, Function<Float,Float> fuse) {
		catalysts.add(newCatalyst);
		reaction = reaction.andThen(fuse);
		return this;
	}
	
	private Fusion fuse(Fusion newReaction, Function<Float,Float> fuse) {
		catalysts.addAll(newReaction.catalysts);
		reaction = reaction.andThen(fuse);
		return this;
	}

	/******************************Fusible Implementation******************************/

	
	/******************************Multiplication******************************/

	@Override
	public Fusion multiply(float factor) {
		super.multiply(() -> String.valueOf(factor));
		return fuse(prev -> prev * factor);
	}

	@Override
	public Fusion multiply(Catalyst factor) {
		super.multiply(() -> factor.toString());
		return fuse(factor, prev -> prev * factor.value);
	}

	@Override
	public Fusion multiply(Fusion factor) {
		super.multiply(() -> factor.toString());
		return fuse(factor, prev -> prev * factor.fire());
	}

	/******************************Division******************************/

	@Override
	public Fusion divideBy(float divisor) {
		super.divideBy(() -> String.valueOf(divisor));
		return fuse(prev -> prev / divisor);
	}

	@Override
	public Fusion divideBy(Catalyst divisor) {
		super.divideBy(() -> divisor.toString());
		return fuse(divisor, prev -> prev / divisor.value);
	}

	@Override
	public Fusion divideBy(Fusion divisor) {
		super.divideBy(() -> divisor.toString());
		return fuse(divisor, prev -> prev / divisor.fire());
	}
	
	/**
	 * Special use case.
	 * @param dividend - is divided by this.
	 * @return merged reaction.
	 */
	Fusion divideFrom(Catalyst dividend) {
		super.divideFrom(() -> dividend.toString());
		return fuse(dividend, prev -> dividend.value / prev);
	}

	/******************************Addition******************************/

	@Override
	public Fusion add(float addend) {
		super.add(() -> String.valueOf(addend));
		return fuse(prev -> prev + addend);
	}

	@Override
	public Fusion add(Catalyst addend) {
		super.add(() -> addend.toString());
		return fuse(addend, prev -> prev + addend.value);
	}

	@Override
	public Fusion add(Fusion addend) {
		super.add(() -> addend.toString());
		return fuse(addend, prev -> prev + addend.fire());
	}

	/******************************Subtraction******************************/

	@Override
	public Fusion subtractBy(float subtrahend) {
		super.subractby(() -> String.valueOf(subtrahend));
		return fuse(prev -> prev - subtrahend);
	}

	@Override
	public Fusion subtractBy(Catalyst subtrahend) {
		super.subractby(() -> subtrahend.toString());
		return fuse(subtrahend, prev -> prev - subtrahend.value);
	}

	@Override
	public Fusion subtractBy(Fusion subtrahend) {
		super.subractby(() -> subtrahend.toString());
		return fuse(subtrahend, prev -> prev - subtrahend.fire());
	}
	
	/**
	 * Special use case.
	 * @param minuend - subtracted by this.
	 * @return merged reaction.
	 */
	Fusion substractFrom(FloatCatalyst minuend) {
		super.subractFrom(() -> minuend.toString());
		return fuse(minuend, prev -> minuend.value - prev);
	}

	/******************************Other******************************/
	
	@Override
	public Fusion negate() {
		super.negate();
		return fuse(prev -> -(prev));
	}
	
}
