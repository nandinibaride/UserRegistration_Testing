package regex.com;
	
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	
public class UC_1FirstName 
{	
		/*
		 * @purpose:In registration system check first name is valid or invalid
		 * @return: No return value
		 * @input: First name
		 * @output: Check first name is valid or invalid
		 */
		
	   public static boolean checkValidFirstName(String firstName) 
	   {	
		    String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		    
			Pattern pattern = Pattern.compile(firstNameRegex);
			Matcher matcher = pattern.matcher(firstName);
			System.out.println(firstName + " is vaild " + matcher.matches());
             return matcher.matches();
		}
			
		public static void main(String[] args) 
		{	
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the first name:");
			 String firstName= sc.nextLine();
			 checkValidFirstName(firstName);
		}
}
	
	
	

