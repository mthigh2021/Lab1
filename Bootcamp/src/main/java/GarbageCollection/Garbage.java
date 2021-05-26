package GarbageCollection;

/*Garbage Collection:
 * -> is up to java -> and its whne an object gets removed from memory 
 * ->finalize(): method invokeed by the jvm when it realizes an object should be garbage collected.
 * its main purpose is to release used by objects before they're removed from memory
 * 
 * - gc() : the garbage collection method 
 * >>. Never use these !!! use thsese the time at which garbage colletor calls finalzers is dependent on the JVM's implementation and the system
 * 
 * ###generics###
 *  - All java collections use generics -> <Type>
 *  generics act as a specifier (and limiter) for a type of data to be used within a class or interfaces. 
 *  - generics can be used when writing classes, interfaces, and methods 
 *  ---- to use generics in a method the containing class or interfaces must use generics/ be generic
 *  -- generics types must be an object (primitives are not allowed -->> Wrapper classes)
 *  -- I don't know what type this will be, but when this calss is sinstantiated, a type will be provided"
 *  `List<String>  stringList = new ArrayList<String>();`
 *  
 *  
 * 
 * 
 * 
 * 
 */

public class Garbage {

	
	public static void main(String[] args) {
		
		System.out.println("Instantating annew Garbage Driver");
				
		Garbage garbge1= new Garbage();
		System.nanoTime();
		System.out.println("Garbage Driver object sucessfully created!!");
		System.out.println("some amount of time passes");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("Assign the variable garbage to null");
		garbge1 = null;
		 System.gc();
		 
		for(;;) {
			System.out.println(".....");
		}
	
		
		
	}
	@Override
	protected void finalize() {
		System.out.println("GarbageDriver's  finalize() method call");
		//System.nanoTime();

		System.out.println("Goodbye, cruel world");
			System.exit(0);
	}
	
	
	
}
