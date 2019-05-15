package alexander.j.paul.fusion;

import java.util.HashSet;
import java.util.Set;

public class Catalyst extends Reactive<Catalyst> implements Fusible {

	final Set<Reactor> reactions = new HashSet<>();
	
	public Catalyst(float initialValue) {
		name = "";
		value = initialValue;
	}
	
	public Catalyst(String initialName, float initialValue) {
		value = initialValue;
		name = initialName;
	}
	
	public void setValue(float newValue) {
		value = newValue;
		reactions.forEach(Reactor::react);
		react();
	}
	
	public void infuse(Reactor reactor) {
		reactions.add(reactor);
	}

	void defuse(Reactor reactor) {
		reactions.remove(reactor);
	}
	
	/******************************Multiplication******************************/
	
	@Override
	public Reaction multiply(float factor) {
		return new Reaction(this).multiply(factor);
	}

	@Override
	public Reaction multiply(Catalyst factor) {
		return new Reaction(this).multiply(factor);
	}

	@Override
	public Reaction multiply(Reaction factor) {
		return factor.multiply(this);
	}

	/******************************Division******************************/

	@Override
	public Reaction divideBy(float divisor) {
		return new Reaction(this).divideBy(divisor);
	}

	@Override
	public Reaction divideBy(Catalyst divisor) {
		return new Reaction(this).divideBy(divisor);
	}

	@Override
	public Reaction divideBy(Reaction divisor) {
 		return divisor.divideFrom(this);

	}

	/******************************Addition******************************/

	@Override
	public Reaction add(float addend) {
		return new Reaction(this).add(addend);
	}

	@Override
	public Reaction add(Catalyst addend) {
		return new Reaction(this).add(addend);
	}

	@Override
	public Reaction add(Reaction addend) {
		return new Reaction(this).add(addend);
	}

	/******************************Subtraction******************************/

	@Override
	public Reaction subtractBy(float subtrahend) {
		return new Reaction(this).subtractBy(subtrahend);
	}

	@Override
	public Reaction subtractBy(Catalyst subtrahend) {
		return new Reaction(this).subtractBy(subtrahend);
	}

	@Override
	public Reaction subtractBy(Reaction subtrahend) {
		return subtrahend.substractFrom(this);
	}

	@Override
	protected Catalyst getThis() {
		return this;
	}
	
}
