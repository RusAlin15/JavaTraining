package javaself.minicalculator;

public interface Calculator {
	/**
	 * =nr sets current value to nr +nr adds nr to current value -nr subtracts nr
	 * from current value *nr multiplies nr with current value /nr divides current
	 * value with nr
	 * 
	 * @param operation
	 * @return the new current value
	 */
	public double doOperation(String operation);
}
