package GarbageCollection;

/*
 * we can define our one classes with generic types 
 * Naming conventions 
 * technically, type parameters can be named anything you want 
 * The convention is to use single, upperclass letters to make it obivous that they are not real class name 
 * E ==> Element
 * k==> Map key
 * v==> map value
 * T ==>. Generic Data type
 * s, U , V etc ==> multiple generic types 
 * 
 * we use angle brackets to specify the parameter type 
 * 
 * 
 */
public class Generic<T>// the data of this class member will be whatever is specified at object instantiation
{

	private  T value;
	
	public T getValue() {
		return this.value;
	}
	public void setValue(T t) {
		this.value = t;
	}
	
}
