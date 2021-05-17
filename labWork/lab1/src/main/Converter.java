package main;
import  java.util.Scanner;

public class Converter {

	 public static void main(String[] args) {
		 int cups ;
		 int teaSpoon;
		 int results;
		 double mile;
		 double kiloMeter;
		 double test;
		 double gallon;
		 double ImpGallon;
		 double test1;
		 
		 int menuSelection;
		 Scanner myScanner = new Scanner(System.in);
		 //String line = myscanner.nextLine();
		 System.out.println("Please choose a number and hit Enter.");
		 System.out.println("1. Cups to Teaspoons");
		 System.out.println("2. Miles to Kilometers");
		 System.out.println("3. US Gallons to Imperial Gallons");
		 System.out.println("4. Quit");
	     

	     menuSelection = myScanner.nextInt();
	     System.out.println("You have typed: " + menuSelection);
	        
	        

	       // myScanner.close();
	     while(menuSelection != 0) {
				 
				// System.out.println("1. Cups to Teaspoons");
				// System.out.println("2. Miles to Kilometers");
				// System.out.println("3. US Gallons to Imperial Gallons");
				// System.out.println("4. Quit");
				 
				  switch(menuSelection) {
				  
				  case 1:
					  System.out.println("please enter the Cups amt you want to convert");
					  cups = myScanner.nextInt();
					  results = cups * 48;
					  System.out.println("The Cups to teaspoon conversion is " + results);
					  
					  break;
				  case 2:
					  System.out.println("please enter the  MIles you want to convert");
					  mile = myScanner.nextDouble();
					 test = mile * 1.609344;
					  System.out.println("The Mile to kilometer conversion is " + test);
					  break;
				  case 3:
					  System.out.println("please enter the  gallon amt you want to convert");
					  gallon = myScanner.nextDouble();
					  test1 = gallon * 0.83267;
					  System.out.println("USGALLON to imperialGallon conversion is " + test1);
			 
					  break;
				  case 4:
					  System.out.println("Thank you for quiting the seletion option");
					  break;
				 default :
					  System.out.println("Sorry you have selected the wrong list number");

						  
				  }
				  System.out.println("Please choose a number and hit Enter.");
				  menuSelection = myScanner.nextInt();
			 }   
	        
		 
	
		 
	 }
}
