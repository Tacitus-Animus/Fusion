package alexander.j.paul.fusion;

public interface Fusible {

	/******************************Multiplication******************************/
	
	public Fusion multiply(float factor);
	public Fusion multiply(Catalyst factor);
	public Fusion multiply(Fusion factor);
	
	/******************************Division******************************/

	public Fusion divideBy(float divisor);
	public Fusion divideBy(Catalyst divisor);
	public Fusion divideBy(Fusion divisor);
	
	/******************************Addition******************************/

	public Fusion add(float addend);
	public Fusion add(Catalyst addend);
	public Fusion add(Fusion addend);
	
	/******************************Subtraction******************************/

	public Fusion subtractBy(float subtrahend);
	public Fusion subtractBy(Catalyst subtrahend);
	public Fusion subtractBy(Fusion subtrahend);
	
	/******************************Other******************************/
	
	public Fusion negate();
	
}
