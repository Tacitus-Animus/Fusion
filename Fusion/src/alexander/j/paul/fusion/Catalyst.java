package alexander.j.paul.fusion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Catalyst extends Reactive<Catalyst> implements Fusible {
	
	final Set<Reactive<?>> reactives = new HashSet<>();
		
	void infuse(Reactive<?> reactor) {
		reactives.add(reactor);
	}

	void defuse(Reactive<?> reactor) {
		reactives.remove(reactor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof String) return toString().equals(obj);
		else if(obj instanceof Float) return Objects.equals(value, (Float)obj);
		else if(obj instanceof Catalyst) return toString().equals(((Catalyst)obj).toString());
		return false;
	}
	
	/******************************Reactive Implementation******************************/

	@Override
	protected void react() {
		this.value = fusion.fire();
		reactives.forEach(Reactive::react);
		fireOnChangeEvent();
	}
	
	/******************************Formative Implementation******************************/
	
	@Override
	public void setValue(float newValue) {
		ifFusedThrowError();
		value = newValue;
		reactives.forEach(Reactive::react);
		fireOnChangeEvent();
	}
	
	@Override
	public void setName(String newName) {
		name = newName;
	}
		
}
