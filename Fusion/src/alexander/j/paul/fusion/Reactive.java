package alexander.j.paul.fusion;

import java.util.function.Consumer;
import java.util.function.Supplier;


public abstract class Reactive<E extends Reactive<?>> extends Formative<E> {
	
	protected Fusion fusion = null;
	
	private static final String DEFAULTFUSIONFORMAT = "%s: %s = %.2f";
	private String fusionFormat = DEFAULTFUSIONFORMAT;
	private boolean useFusionFormat = false;
	
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
	
	public void defuse() {
		if(isFused()) {
			fusion.defuse(this);
			fusion = null;
		}
	}
	
	public boolean isFused() {
		return fusion != null;
	}
	
	public E fuse(Supplier<Float> specialFusion, Catalyst...catalysts) {
		ifFusedThrowError();
		fusion = new Fusion(specialFusion, catalysts);
		fusion.infuse(this);
		react();
		return getThis();
	}
	
	public E fuse(Catalyst catalyst) {
		ifFusedThrowError();
		fusion = new Fusion(catalyst);
		fusion.infuse(this);
		react();
		return getThis();
	}
	
	public E fuse(Fusion newReaction) {
		ifFusedThrowError();
		fusion = newReaction;
		fusion.infuse(this);
		react();
		return getThis();

	}
	
	protected abstract void react();
	
	public E formatWithFusion(String newEquationFormat) {
		fusionFormat = newEquationFormat;
		useFusionFormat = true;
		return getThis();
	}
	
	public E useFusionFormat(boolean toggleFusionFormat) {
		useFusionFormat = toggleFusionFormat;
		return getThis();
	}
	
	public boolean isUsingFusionFormat() {
		return useFusionFormat;
	}
	
	public String getFusionString() {
		return isFused() ? fusion.toString() : super.toString();
	}
	
	@Override
	public String toString() {
		return isFused() && useFusionFormat ? String.format(fusionFormat, name, fusion, value) : super.toString();
	}
	
}
