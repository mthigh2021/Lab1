package dkboss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Exceptions:
 * Exceptions are objects, thrown whenever code executues along unhappy path 
 * -->. two kinds of exceptions 
 *  --- checked , compile time  and must be handled for code to compile 
 *   ---unchecked exceptions 
 *       Runtime 
 *       Are not required to be handled , but you should ....
 *       
 *       
 * Keyword>>
 * -try 
 * -catch
 * -Finally 
 * -Throws 
 * 
 * ###Exception Hiearcharchy
 * 
 * 
 * 
 *       
 *       
 * 
 * 
 * 
 * 
 */



public class ExceptionsPlaygrounds {
	

	public static void main(String[] args){
		
		
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(intArray[0]);
		
		System.out.println(intArray[5]);
/*Exception in thread "main" 6
		java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9*/
	//	at dkboss.ExceptionsPlaygrounds.main(ExceptionsPlaygrounds.java:45)  RUNTIME EXCEPTION
		
		try {
		
		System.out.println(intArray[9]);
		FileInputStream f = new FileInputStream("../applications.propertise");
		}
		catch(ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}finally {
			System.out.println("This will execute always --with or without an exception");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
