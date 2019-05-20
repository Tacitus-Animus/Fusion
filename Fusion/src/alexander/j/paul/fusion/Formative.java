package alexander.j.paul.fusion;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Skeleton class for providing basic and advanced formatting capability for general name and value.
 * @author Alexander Paul
 *
 * @param <E>
 */
public abstract class Formative<E extends Formative<?>> {
	
	protected String name;
	protected float value;
	
	public float getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Allows extending classes to control support of these methods.
	 * @param newValue
	 */
	public abstract void setValue(float newValue);
	
	/**
	 * Allows extending classes to control support of these methods.
	 * @param newName
	 */
	public abstract void setName(String newName);
	
	private static final String DEFAULT = "%s: %.2f";
	private String printfStyle = DEFAULT;
	private Function<E, String> formatFuction = null;
	private BiFunction<String, Float, String> formatBiFuction = null;
	
	/**
	 * All extending class can return their rightful runtime types.
	 * @return E extends Formative<?>
	 */
	protected abstract E getThis();
	
	/**
	 * Used to return string value of {@code String.format(newFormat, name, value)}.
	 * <p> This clears any previous custom format calls.
	 * @param newFormat to be used. 
	 * @return itself.
	 * @see {@link java.lang.String#format(String, Object...)}
	 */
	public E formattedTo(String newFormat) {
		clearFormat();
		printfStyle = newFormat;
		return getThis();
	}
	
	/**
	 * Function to be applied to this to return a string as so: {@code newFormat.apply(getThis())}.
	 * <p> This clears any previous custom format calls.
	 * @param newFormat function to return a String.
	 * @return {@link #getThis()}
	 */
	public E formattedTo(Function<E, String> newFormat) {
		clearFormat();		
		formatFuction = newFormat;
		return getThis();
	}
	
	/**
	 * Bifunction to be applied to this name and value to return a String as so: {@code newFormat.apply(name, value).}
	 * <p> This clears any previous custom format calls.
	 * @param newFormat bifunction to return a string.
	 * @return
	 */
	public E formattedTo(BiFunction<String, Float, String> newFormat) {
		clearFormat();
		formatBiFuction = newFormat;
		return getThis();
	}
	
	/**
	 * Clears any custom formats like {@link #formattedTo(String)}, for example.
	 * Default format is: {@link #DEFAULT};
	 */
	public void defaultFormat() {
		clearFormat();
		printfStyle = DEFAULT;
	}
	
	/**
	 * Utility method for when extending classes need more formatting capability.
	 */
	protected void clearFormat() {
		printfStyle = null;
		formatFuction = null;
		formatBiFuction = null;
	}
	
	/**
	 * If custom format is provided through {@link #Formative()} methods, 
	 * <p> this will return corresponding formatted String.
	 */
	@Override
	public String toString() {
		return printfStyle != null ? 
						String.format(printfStyle, name, value) : formatFuction != null ? 
								formatFuction.apply(getThis()) : formatBiFuction != null ?
										formatBiFuction.apply(name, value) : String.format((printfStyle = DEFAULT), name, value);
	}
}
