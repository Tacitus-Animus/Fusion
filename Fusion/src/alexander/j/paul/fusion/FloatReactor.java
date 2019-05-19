package alexander.j.paul.fusion;

public class FloatReactor extends FloatCatalyst {

	public FloatReactor(String initialName) {
		super(initialName, 0f);
	}
	
	/******************************Formative Implementation******************************/

	@Override
	public void setValue(float newValue) {
		throw new UnsupportedOperationException(getClass().getName() + " doesn't support setting it's value.");
	}
	
	@Override
	protected FloatReactor getThis() {
		return this;
	}

}
