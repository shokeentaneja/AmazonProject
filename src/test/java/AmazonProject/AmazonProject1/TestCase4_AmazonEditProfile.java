package AmazonProject.AmazonProject1;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Utility.BaseClass;
import Utility.DDT;
import Utility.ListenersLogic;
import Utility.RetryLogic;


//@Listeners(ListenersLogic.class)
public class TestCase4_AmazonEditProfile extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void editProfile() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoverover(driver);
		homepage.clickToSignin();
		//Fetch excel data
		 DDT ddt = new DDT();
	     ddt.data_Fetching();
	     
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
		
		homepage.hoverover(driver);
		EditProfile viewprofile= new EditProfile(driver);
		viewprofile.editProfile();
		String profileName=viewprofile.accountHolderName();
		Assert.assertEquals(profileName.contains("shokeen"),true,"Profile name does not matching");

		viewprofile.clickOnViewProfile();
		
		
	}
	
}
