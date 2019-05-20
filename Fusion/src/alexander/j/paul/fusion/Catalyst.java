package alexander.j.paul.fusion;

import java.util.HashSet;
import java.util.Set;

/**
 * Top Most Skeleton class to be extended. Should be an abstract class for Number Fusions,
 * <p> but would be time staking and painful to change the API.
 * <p> This also implements Fusible which implies expression like behavior found in numbers.
 * @author Alexander Paul
 */
public abstract class Catalyst extends Reactive<Catalyst> implements Fusible {
	
	/**
	 * Observers of this Catalyst to react to change of this Catalyst.
	 */
	final Set<Reactive<?>> reactives = new HashSet<>();
	
	/**
	 * Adds observer or Reactive that will be notified 
	 * by this Catalyst so the Reactive may {@link Reactive#react()}.
	 * @param reactor
	 */
	void infuse(Reactive<?> reactor) {
		reactives.add(reactor);
	}

	/**
	 * Remove observer or Reactive from listening to this Catalyst.
	 * @param reactor
	 */
	void defuse(Reactive<?> reactor) {
		reactives.remove(reactor);
	}
	
	/******************************Reactive Implementation******************************/

	/**
	 * Called when an observed Catalyst changes and will update it's value using {@link Fusion#fire()}.
	 * <p> This also means it's own value changes, 
	 * <p> so it notifies observing {@link Catalyst#reactives} to update or react to this.
	 * <p> Lastly, invokes {@link #fireOnChangeEvent()}.
	 */
	@Override
	protected void react() {
		this.value = fusion.fire();
		reactives.forEach(Reactive::react);
		fireOnChangeEvent();
	}
		
}
