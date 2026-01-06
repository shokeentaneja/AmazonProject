package AmazonProject.AmazonProject1;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TestCase2_LoginToAmazonWithValidEmailPassword extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void loginWithValidCreds()
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoverover(driver);
		homepage.clickToSignin();
		
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.withValidEmailId();
		loginpage.clickoncontinue();
		loginpage.withValidPassword();
		loginpage.clickOnsubmitButton();	
		String actualText=loginpage.getLoggedInUserText();
		
		//Assertion to validate successful login
        Assertion a1= new Assertion();
        a1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        Assert.assertTrue(actualText.contains("Hello, shokeen"),"User is not logged in");
	}
	
}
