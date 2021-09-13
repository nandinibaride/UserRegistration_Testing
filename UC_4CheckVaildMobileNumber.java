package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_4CheckVaildMobileNumber 
{
	/*
	 * @purpose:In registration system check mobile number is valid or invalid
	 * @return: No return value
	 * @input: mobile number
	 * @output: Check mobile number is valid or invalid
	 */
	 public static boolean checkValidMobileNumber(String mobilenumber)
	 {
	   String mobilenumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
	   
	   Pattern pattern = Pattern.compile(mobilenumberRegex);
	   Matcher matcher = pattern.matcher(mobilenumber);
	   System.out.println( mobilenumber + " is vaild "+ matcher.matches());
        return matcher.matches();
     }
	 
    public static void main(String[] args) 
    {
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter the mobilenumber name:");
	String mobilenumber= sc.nextLine();
	 checkValidMobileNumber(mobilenumber);
  }
}





