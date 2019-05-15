package alexander.j.paul.fusion;

import java.util.function.Consumer;

public abstract class Reactive<E extends Reactive<E>> extends Formative<E> {
		
	private boolean reactive = false;
	private Consumer<E> onChangeConsumeThis = null;
	private Consumer<Float> onChangeConsumeValue = null;
	private Runnable onChangeRun = null;
	
	public E onChangeConsume(Consumer<E> consumeThis) {
		reactive = true;
		onChangeConsumeThis = consumeThis;
		onChangeConsumeValue = null;
		onChangeRun = null;
		return getThis();
	}

	public E onChangeConsumeValue(Consumer<Float> consumeThisValue) {
		reactive = true;
		onChangeConsumeThis = null;
		onChangeConsumeValue = consumeThisValue;
		onChangeRun = null;
		return getThis();

	}

	public E onChangeRun(Runnable doSomething) {
		reactive = true;
		onChangeConsumeThis = null;
		onChangeConsumeValue = null;
		onChangeRun = doSomething;
		return getThis();

	}
	
	public void clearOnChangeActions() {
		reactive = false;
		onChangeConsumeThis = null;
		onChangeConsumeValue = null;
		onChangeRun = null;
	}
	
	protected void react() {
		if(reactive) {
			if(onChangeConsumeThis != null) onChangeConsumeThis.accept(getThis());
			else if(onChangeConsumeValue != null) onChangeConsumeValue.accept(value);
			else if(onChangeRun != null) onChangeRun.run();
		}
	}
	
}
