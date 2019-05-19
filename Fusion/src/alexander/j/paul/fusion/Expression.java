package alexander.j.paul.fusion;

import java.util.LinkedList;
import java.util.function.Supplier;

public abstract class Expression {
	
	private final LinkedList<Supplier<String>> expression = new LinkedList<>();
	
	private static final Supplier<String> OPEN = () -> "(";
	private static final Supplier<String> CLOSE = () -> ")";
	private static final Supplier<String> ADD = () -> " + ";
	private static final Supplier<String> SUBTRACT = () -> " - ";
	private static final Supplier<String> MULTIPLY = () -> " * ";
	private static final Supplier<String> DIVIDE = () -> " / ";
	
	private String representation;
	protected boolean changed;
	
	public Expression(Supplier<String> initialValue) {
		changed = true;
		representation = toString();
		expression.add(initialValue);
	}
	
	@Override
	public String toString() {
		if(changed) {
			StringBuilder sb = new StringBuilder();
			expression.forEach((supplier) -> sb.append(supplier.get()));
			changed = false;
			return representation = sb.toString();
		} else return representation;
	}
	
	public Expression add(Supplier<String> addend) {
		expression.addFirst(OPEN);
		expression.add(ADD);
		expression.add(addend);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
	
	public Expression subractby(Supplier<String> subtrahend) {
		expression.addFirst(OPEN);
		expression.add(SUBTRACT);
		expression.add(subtrahend);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
	
	public Expression subractFrom(Supplier<String> minuend) {
		expression.addFirst(SUBTRACT);
		expression.addFirst(minuend);
		expression.addFirst(OPEN);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
	
	public Expression multiply(Supplier<String> factor) {
		expression.addFirst(OPEN);
		expression.add(MULTIPLY);
		expression.add(factor);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
	
	public Expression divideBy(Supplier<String> divisor) {
		expression.addFirst(OPEN);
		expression.add(DIVIDE);
		expression.add(divisor);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
	
	public Expression divideFrom(Supplier<String> dividend) {
		expression.addFirst(DIVIDE);
		expression.addFirst(dividend);
		expression.addFirst(OPEN);
		expression.add(CLOSE);
		changed = true;
		return this;
	}

	public Expression negate() {
		expression.addFirst(OPEN);
		expression.addFirst(SUBTRACT);
		expression.add(CLOSE);
		changed = true;
		return this;
	}
}
