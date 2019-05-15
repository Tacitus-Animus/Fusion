package alexander.j.paul.fusion;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Reaction extends Expression implements Fusible {
	
	private final Set<Catalyst> catalysts = new HashSet<>();
	
	Function<Float,Float> reaction;
		
	Reaction(Catalyst initialCatalyst) {
		super(() -> initialCatalyst.toString());
		catalysts.add(initialCatalyst);
		reaction = noMatter -> initialCatalyst.value;
	}
	
	float fire() {
		changed = true;
		return reaction.apply(0f);
	}
	
	void infuse(Reactor reactor) {
		catalysts.forEach(catalyst -> catalyst.infuse(reactor));
	}
	
	void defuse(Reactor reactor) {
		catalysts.forEach(catalyst -> catalyst.defuse(reactor));
	}
	
	/******************************Utility Methods******************************/

	private Reaction fuse(Function<Float,Float> fuse) {
		reaction = reaction.andThen(fuse);
		return this;
	}
	
	private Reaction fuse(Catalyst newCatalyst, Function<Float,Float> fuse) {
		catalysts.add(newCatalyst);
		reaction = reaction.andThen(fuse);
		return this;
	}
	
	private Reaction fuse(Reaction newReaction, Function<Float,Float> fuse) {
		catalysts.addAll(newReaction.catalysts);
		reaction = reaction.andThen(fuse);
		return this;
	}

	/******************************Fusible Implementation******************************/

	
	/******************************Multiplication******************************/

	@Override
	public Reaction multiply(float factor) {
		super.multiply(() -> String.valueOf(factor));
		return fuse(prev -> prev * factor);
	}

	@Override
	public Reaction multiply(Catalyst factor) {
		super.multiply(() -> factor.toString());
		return fuse(factor, prev -> prev * factor.value);
	}

	@Override
	public Reaction multiply(Reaction factor) {
		super.multiply(() -> factor.toString());
		return fuse(factor, prev -> prev * factor.fire());
	}

	/******************************Division******************************/

	@Override
	public Reaction divideBy(float divisor) {
		super.divideBy(() -> String.valueOf(divisor));
		return fuse(prev -> prev / divisor);
	}

	@Override
	public Reaction divideBy(Catalyst divisor) {
		super.divideBy(() -> divisor.toString());
		return fuse(divisor, prev -> prev / divisor.value);
	}

	@Override
	public Reaction divideBy(Reaction divisor) {
		super.divideBy(() -> divisor.toString());
		return fuse(divisor, prev -> prev / divisor.fire());
	}
	
	/**
	 * Special use case.
	 * @param dividend - is divided by this.
	 * @return merged reaction.
	 */
	Reaction divideFrom(Catalyst dividend) {
		super.divideFrom(() -> dividend.toString());
		return fuse(dividend, prev -> dividend.value / prev);
	}

	/******************************Addition******************************/

	@Override
	public Reaction add(float addend) {
		super.add(() -> String.valueOf(addend));
		return fuse(prev -> prev + addend);
	}

	@Override
	public Reaction add(Catalyst addend) {
		super.add(() -> addend.toString());
		return fuse(addend, prev -> prev + addend.value);
	}

	@Override
	public Reaction add(Reaction addend) {
		super.add(() -> addend.toString());
		return fuse(addend, prev -> prev + addend.fire());
	}

	/******************************Subtraction******************************/

	@Override
	public Reaction subtractBy(float subtrahend) {
		super.subractby(() -> String.valueOf(subtrahend));
		return fuse(prev -> prev - subtrahend);
	}

	@Override
	public Reaction subtractBy(Catalyst subtrahend) {
		super.subractby(() -> subtrahend.toString());
		return fuse(subtrahend, prev -> prev - subtrahend.value);
	}

	@Override
	public Reaction subtractBy(Reaction subtrahend) {
		super.subractby(() -> subtrahend.toString());
		return fuse(subtrahend, prev -> prev - subtrahend.fire());
	}
	
	/**
	 * Special use case.
	 * @param minuend - subtracted by this.
	 * @return merged reaction.
	 */
	Reaction substractFrom(Catalyst minuend) {
		super.subractFrom(() -> minuend.toString());
		return fuse(minuend, prev -> minuend.value - prev);
	}
	
}
