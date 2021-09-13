package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_5PasswordMinimum8Char 
{	
	/*
	 * @purpose:In registration system check password is valid or invalid
	 * @return: No return value
	 */
	public static boolean checkValidpassword(String password) 
	 {	
            String passwordRegex = "^[a-z]{8,}$";
            
			Pattern pattern = Pattern.compile(passwordRegex);
			Matcher matcher = pattern.matcher(password);
			System.out.println( password + " is vaild "+ matcher.matches());
			return matcher.matches();
	 }
    public static void main(String[] args) 
     {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the password:");
			String password= sc.nextLine();
			 checkValidpassword(password);
	  }
}
	


