package com.developer.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {

	public static void main(String[] args) {
		// creating a list 
		List<String> strList = new ArrayList<String>(); 
		
		/*
		 * Why List <> and ArrayList <>
		 * coding to interfaces  - any implementation of List shares functionality (.add(), remove())
		 * all lists share these methods - they have their own implementation
		 * 
		 */
	 String[] strList1 = new String[5];
	 
	 strList1[0] = "Pan";
	 strList1[3] = "Tan";
	 strList1[4] = "kan";	
	 
	 System.out.println(strList1);
	 
	 
		strList.add("dan");
		strList.add("van");
		strList.add("man");

		System.out.println(strList);
		
		
		
		
	}
	
}
