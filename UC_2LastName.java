package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_2LastName {
	/*
	 * @purpose:In registration system check last name is valid or invalid
	 * @return: No return value
	 * @input: last name
	 * @output: Check last name is valid or invalid
	 */

	 public static boolean checkValidLastName(String lastName) 
	 {
		    String lastnameRegex = "^[A-Z]{1}[a-z]{3,}$";
		    
			Pattern pattern = Pattern.compile(lastnameRegex);
	        Matcher matcher = pattern.matcher(lastName);
	        System.out.println( lastName + " is vaild "+ matcher.matches());
	        return  matcher.matches();	
	 }
		
		 public static void main(String[] args) 
		 {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the last name:");
			 String lastName= sc.nextLine();
			 checkValidLastName(lastName);
		  }
   }
	

