package alexander.j.paul.fusion;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class Formative<E extends Formative<?>> {
	
	protected String name;
	protected float value;
	
	public float getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void setValue(float newValue);
	
	public abstract void setName(String newName);
	
	private static final String DEFAULT = "%s: %.2f";
	private String printfStyle = DEFAULT;
	private Function<E, String> formatFuction = null;
	private BiFunction<String, Float, String> formatBiFuction = null;
	
	protected abstract E getThis();
	
	public E formattedTo(String newFormat) {
		clearFormat();
		printfStyle = newFormat;
		return getThis();
	}
	
	public E formattedTo(Function<E, String> newFormat) {
		clearFormat();		
		formatFuction = newFormat;
		return getThis();
	}
	
	public E formattedTo(BiFunction<String, Float, String> newFormat) {
		clearFormat();
		formatBiFuction = newFormat;
		return getThis();
	}
	
	public void defaultFormat() {
		clearFormat();
		printfStyle = DEFAULT;
	}
	
	protected void clearFormat() {
		printfStyle = null;
		formatFuction = null;
		formatBiFuction = null;
	}
	
	@Override
	public String toString() {
		return printfStyle != null ? 
						String.format(printfStyle, name, value) : formatFuction != null ? 
								formatFuction.apply(getThis()) : formatBiFuction != null ?
										formatBiFuction.apply(name, value) : String.format((printfStyle = DEFAULT), name, value);
	}
}
