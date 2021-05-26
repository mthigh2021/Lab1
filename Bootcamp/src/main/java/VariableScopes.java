/*
 * When a variable is declared in a hjava program, it is attached to a specific scope within program
 * this scope is determined by wher the varaible resides( where it is declared)
 * the diffrent variable scopes  in java are :
 * 
 * Class (or Static ) scope
 * Instance (or object ) scope
 * 
 * method scope
 * Block scope
 * 
 * 
 * 
 */

public class VariableScopes {

	/*
	 * Class scope variables resides in the class definition themselves this means
	 * that when an object updates a class scoped variable, that change is reflected
	 * across all instances of the class class scope is declared with the static
	 * keyword Methods can also declared as class scope when we declare a variable
	 * as class scope when we declare a variable as class scope, we should refrence
	 * it through the call (not an instance) VariableScoope.classscope
	 *
	 */
	public static String classScope;

	/*
	 * Instance scope means that variable is attached to an individual object
	 * created from class when an instance- scoped variable is modified, it has no
	 * effect on other, distinct instance of the class
	 */
	public static void methodScopeExamplemethod(String methodScopeParameter) {
		// this variable only exists for the duration of this method
		String methodScope = "I have method scope";
	}
	/*
	 * Block Scope - variables only exists within the specific control block for, if
	 * /else, while, do while, switch statements/cases ....._> {} After the block
	 * ends, the variable declared with in it are no longer available
	 * 
	 * 
	 */

	public static void main(String[] args) {
		if (true) {
			String str = "hello";
		}
		// str - we are outside of the block where it was declared
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// str - we are outside of the block where it was declared.
		// i - not available outside of its for loop declaration.

	}

}
