package regex.com;

import org.junit.Test;
import org.junit.Assert;

public class VaildTestCase
{
	//Test Case For First Name
	
	@Test
	   public void givenFirstName_whenfirstLetterCapital_ReturnsTrue()
	   {
		  boolean result = UC_1FirstName.checkValidFirstName("Nandini");
		  Assert.assertEquals(true, result);
        }	
		@Test
		public void givenFirstName_whenfirstLetterSmall_ReturnsFalse()
		{
			boolean result = UC_1FirstName.checkValidFirstName("nandini");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenFirstName_Whenincludenumber_ReturnsFalse()
		{
			boolean result = UC_1FirstName.checkValidFirstName("nandini10");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenFirstName_Whenincludcharacter_ReturnsFalse()
		{
			boolean result = UC_1FirstName.checkValidFirstName("nandini@");
			Assert.assertEquals(false, result);
		}
		
		//Test Case For last name
		
		@Test
		public void givenLastName_WhenFirstLetterCapital_ReturnsTrue()
		{
			boolean result = UC_2LastName.checkValidLastName("Baride");
			Assert.assertEquals(true, result);
		}
		
		@Test
		public void givenLastName_whenFirstLetterSmall_ReturnsFalse()
		{
			boolean result = UC_2LastName.checkValidLastName("baride");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenlastName_Whenincludenumber_ReturnsFalse()
		{
			boolean result = UC_2LastName.checkValidLastName("baride11");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void givenlastName_Whenincludcharacter_ReturnsFalse()
		{
			boolean result = UC_2LastName.checkValidLastName("baride@");
			Assert.assertEquals(false, result);
		}
		
	    //Test Case For email
		
		@Test
		public void email_WhenFirstLetterCapital_ReturnsFalse()
		{
			boolean result = UC_3VaildEmail.checkValidemail("Nandinibaride1234@gmail.com");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void email_WhenFirstLettersmall_ReturnsTrue()
		{
			boolean result = UC_3VaildEmail.checkValidemail("nandinibaride1234@gmail.com");
			Assert.assertEquals(true, result);
		}
		
		@Test
		public void email_WhenDotAndChracterIsNotPresent_ReturnsFalse()
		{
			boolean result = UC_3VaildEmail.checkValidemail("nandinibaride1234gmailcom");
			Assert.assertEquals(false, result);
		}
		
		// Test Case For MobileNumber
		@Test
		public void _WhenIncludeChracter_ReturnsFalse()
		{
			boolean result = UC_4CheckVaildMobileNumber. checkValidMobileNumber("996@5742578");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void _WhenCountriCodeIsPresent_ReturnsTrue()
		{
			boolean result = UC_4CheckVaildMobileNumber.checkValidMobileNumber("91 9965742578");
			Assert.assertEquals(true, result);
		}
		
		// Test Case For Password
		
		@Test
		public void _WhenMinimumEightAlphabet_ReturnsTrue()
		{
			boolean result = UC_5PasswordMinimum8Char.checkValidpassword("passward");
			Assert.assertEquals(true, result);
		}
		
		@Test
		public void _WhenFirstLetterCapital_ReturnsTrue()
		{
			boolean result = UC_6OneUpperCase.checkValidpassword("Passwardn");
			Assert.assertEquals(true, result);
		}
		
		@Test
		public void _WhenAddOneNumbericValue_ReturnsTrue()
		{
			boolean result = UC_7OneNumericValue.checkValidpassword("Passwardn1");
			Assert.assertEquals(true, result);
		}
		
		@Test
		public void _WhenAddOneSpecialCharacter_ReturnsTrue()
		{
			boolean result = UC_8OneSpecialCharacter.checkValidpassword("Passward@12");
			Assert.assertEquals(true, result);
		}
}

