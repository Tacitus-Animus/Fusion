package alexander.j.paul.fusion;

public interface Fusible {

	/******************************Multiplication******************************/
	
	public Reaction multiply(float factor);
	public Reaction multiply(Catalyst factor);
	public Reaction multiply(Reaction factor);
	
	/******************************Division******************************/

	public Reaction divideBy(float divisor);
	public Reaction divideBy(Catalyst divisor);
	public Reaction divideBy(Reaction divisor);
	
	/******************************Addition******************************/

	public Reaction add(float addend);
	public Reaction add(Catalyst addend);
	public Reaction add(Reaction addend);
	
	/******************************Subtraction******************************/

	public Reaction subtractBy(float subtrahend);
	public Reaction subtractBy(Catalyst subtrahend);
	public Reaction subtractBy(Reaction subtrahend);
	
}
