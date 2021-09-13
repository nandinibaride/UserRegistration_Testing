package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_3VaildEmail
{
         /*
		 * @purpose:In registration system check email-id is valid or invalid
		 * @return: No return value
		 * @input: email-id
		 * @output: Check email-id is valid or invalid
		 */
		
		 public static boolean checkValidemail(String email) 
		 {	
			String emailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
				Pattern pattern = Pattern.compile(emailRegex);
				Matcher matcher = pattern.matcher(email);
				System.out.println( email + " is vaild "+ matcher.matches());
				 return matcher.matches();
		 }
		 public static void main(String[] args) 
		 {     
			    Scanner sc= new Scanner(System.in); 
				System.out.println("Enter the email-id name:");
				String email= sc.nextLine();
				 checkValidemail(email);
		 }
}
		



