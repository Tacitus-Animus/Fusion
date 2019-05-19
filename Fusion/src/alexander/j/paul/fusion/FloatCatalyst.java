package alexander.j.paul.fusion;

public class FloatCatalyst extends Catalyst implements Fusible {

	private static final String NO_NAME = "";
	
	final boolean limited;
	final float min, max;
	
	public FloatCatalyst(float initialValue) {
		limited = false;
		min = max = 0f;
		name = NO_NAME;
		value = initialValue;
	}
	
	public FloatCatalyst(String initialName, float initialValue) {
		limited = false;
		min = max = 0f;
		value = initialValue;
		name = initialName;
	}
	
	public FloatCatalyst(float initialValue, float min,  float max) {
		limited = true;
		this.min = min;
		this.max = max;
		name = NO_NAME;
		value = initialValue;
	}

	public FloatCatalyst(String initialName, float initialValue, float min,  float max) {
		limited = true;
		this.min = min;
		this.max = max;
		name = initialName;
		value = initialValue;
	}
	
	/******************************Multiplication******************************/
	
	@Override
	public Fusion multiply(float factor) {
		return new Fusion(this).multiply(factor);
	}

	@Override
	public Fusion multiply(Catalyst factor) {
		return new Fusion(this).multiply(factor);
	}

	@Override
	public Fusion multiply(Fusion factor) {
		return factor.multiply(this);
	}

	/******************************Division******************************/

	@Override
	public Fusion divideBy(float divisor) {
		return new Fusion(this).divideBy(divisor);
	}

	@Override
	public Fusion divideBy(Catalyst divisor) {
		return new Fusion(this).divideBy(divisor);
	}

	@Override
	public Fusion divideBy(Fusion divisor) {
 		return divisor.divideFrom(this);

	}

	/******************************Addition******************************/

	@Override
	public Fusion add(float addend) {
		return new Fusion(this).add(addend);
	}

	@Override
	public Fusion add(Catalyst addend) {
		return new Fusion(this).add(addend);
	}

	@Override
	public Fusion add(Fusion addend) {
		return new Fusion(this).add(addend);
	}

	/******************************Subtraction******************************/

	@Override
	public Fusion subtractBy(float subtrahend) {
		return new Fusion(this).subtractBy(subtrahend);
	}

	@Override
	public Fusion subtractBy(Catalyst subtrahend) {
		return new Fusion(this).subtractBy(subtrahend);
	}

	@Override
	public Fusion subtractBy(Fusion subtrahend) {
		return subtrahend.substractFrom(this);
	}

	@Override
	public Fusion negate() {
		return new Fusion(this).negate();
	}

	@Override
	protected FloatCatalyst getThis() {
		return this;
	}

}
