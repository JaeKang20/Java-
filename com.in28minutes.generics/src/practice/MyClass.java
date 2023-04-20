package practice;

public class MyClass<T extends Number> {
	/*
	 * in this example, the 'MyClass' class is a generic class with a type parameter
	 * 'T'. the 'T' parameter is bounded by the upper bound 'Number',which means
	 * that any type that extends 'Number', such as 'Integer' or 'Double', can be
	 * used as a type argument for 'T'.
	 */
	private T value;

	public MyClass(T value) {
		this.value = value;
	}

	public double getValueAsDouble() {
		return value.doubleValue();
	}
	/*
	 * The class has a constructor that takes an argument of type'T', and a method
	 * 'getValueAsDouble()' that returns the value of 'T' as a 'double'.
	 * 
	 * By using an Upper bound, we ensure that 'T'is a subtype of 'Number' and
	 * therefore has a 'doubleValue()'method.
	 */

}

