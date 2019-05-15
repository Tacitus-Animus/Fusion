package alexander.j.paul.fusion;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class Formative<E extends Formative<E>> {
	
	protected String name;
	protected float value;
	
	public float getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	private final String DEFAULT = "%s: %.2f";
	protected String formatString = DEFAULT;
	private Supplier<String> formatSupplier = null;
	private Function<E, String> formatFuction = null;
	private BiFunction<String, Float, String> formatBiFuction = null;
	
	protected abstract E getThis();
	
	public E formattedTo(String newFormat) {
		formatString = newFormat;
		formatSupplier = null;
		formatFuction = null;
		formatBiFuction = null;
		return getThis();
	}
	
	public E formattedTo(Supplier<String> newFormat) {
		formatString = null;
		formatSupplier = newFormat;
		formatFuction = null;
		formatBiFuction = null;
		return getThis();
	}
	
	public E formattedTo(Function<E, String> newFormat) {
		formatString = null;
		formatSupplier = null;
		formatFuction = newFormat;
		formatBiFuction = null;
		return getThis();
	}
	
	public E formattedTo(BiFunction<String, Float, String> newFormat) {
		formatString = null;
		formatSupplier = null;
		formatFuction = null;
		formatBiFuction = newFormat;
		return getThis();
	}
	
	public void defaultFormat() {
		formatString = DEFAULT;
		formatSupplier = null;
		formatFuction = null;
		formatBiFuction = null;
	}
	
	@Override
	public String toString() {
		return formatString != null ?
				String.format(formatString, name, value) : formatSupplier != null ? 
						String.format(formatSupplier.get(), name, value) : formatFuction != null ? 
								formatFuction.apply(getThis()) : formatBiFuction != null ?
										formatBiFuction.apply(name, value) : String.format(DEFAULT, name, value);
	}
}
