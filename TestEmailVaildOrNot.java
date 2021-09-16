package regex.com;

import org.junit.Assert;
import org.junit.Test;

public class TestEmailVaildOrNot 
{
	
	@Test
	public void email_WhenFirstLettersmall_ReturnsTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@bridgelabz.co.in");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void email_WhenAddDotFirstly_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail(".abc@abc.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenAddDubleDotCom_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@gmail.com.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenDoNoTAddSpecialCharcter_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenAddYahoo_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@yahoo.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenAddDotMyWord_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@.com.my");
				Assert.assertEquals(false,result);
	}
	

	@Test
	public void email_WhenAddNumericValue_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@1.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenAddDoubleSpecialChracter_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@abc@gmail.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenAddSubstractSign_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc-100@yahoo.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenAddsquarebracketandMultiplySymbol_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc()*@gmail.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenAddYahooAndDoubleDot_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc.100@yahoo.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenAddDotSpaceAndDot_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc..2002@gmail.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenAddNumericValueAndSpecialChracter_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail( "abc111@abc.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_WhenDotAddBeforeSpecialChracter_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc.@gmail.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_WhenSubstarctSignBeforeNumericValue_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc-100@abc.net");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_AddDoubleDotComAfterChracter_ReturneFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc123@.com.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_AfterComAddDotau_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc.100@abc.com.au");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_AddMultipleChracterBeforeDotCom_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@%*.com");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_AddPlusSign_ReturnTrue()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc+100@gmail.com");
				Assert.assertEquals(true,result);
	}
	
	@Test
	public void email_LastlyAddNumericVAlueandChracter_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@gmail.com.1a");
				Assert.assertEquals(false,result);
	}
	
	@Test
	public void email_LastAddThreeTimeDotAndalphabet_ReturnFalse()
	{
		boolean result = UC_9EmailCheck.checkValidemail("abc@gmail.com.aa.au");
				Assert.assertEquals(false,result);
	}
 }	

	
	
	
	
	
	
	


