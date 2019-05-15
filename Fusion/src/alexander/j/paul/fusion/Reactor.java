package alexander.j.paul.fusion;

public class Reactor extends Reactive<Reactor> {

	Reaction reaction = null;	
	
	public Reactor(String initialName) {
		name = initialName;
	}
	
	@Override
	protected void react() {
		value = reaction.fire();
		super.react();
	}
	
	public boolean isFused() {
		return reaction != null;
	}
	
	void ifFusedThrowError() {
		if(isFused()) throw new RuntimeException("Reactor is already fused, must unfuse first");
	}
	
	public Reactor fuse(Catalyst catalyst) {
		ifFusedThrowError();
		reaction = new Reaction(catalyst);
		reaction.infuse(this);
		react();
		return this;
	}
	
	public Reactor fuse(Reaction newReaction) {
		ifFusedThrowError();
		reaction = newReaction;
		reaction.infuse(this);
		react();
		return this;
	}
	
	public void defuse() {
		reaction.defuse(this);
		reaction = null;
	}

	@Override
	protected Reactor getThis() {
		return this;
	}
	
}
