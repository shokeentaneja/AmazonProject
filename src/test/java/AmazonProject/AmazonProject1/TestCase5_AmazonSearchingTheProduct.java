package AmazonProject.AmazonProject1;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.DDT;
import Utility.ListenersLogic;
import Utility.RetryLogic;

//@Listeners(ListenersLogic.class)
public class TestCase5_AmazonSearchingTheProduct extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void SearchingTheProduct() throws EncryptedDocumentException, IOException
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
		
		Assert.assertEquals(actualText.contains("Hello, shokeen"),true,"User not logged-in");
		
		Amazon_SearchingProduct searchProduct= new Amazon_SearchingProduct(driver);
		searchProduct.searchProduct();
		
		
	}
	
}
