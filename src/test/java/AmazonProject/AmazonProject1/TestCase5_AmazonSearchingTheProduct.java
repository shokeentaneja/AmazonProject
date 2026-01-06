package AmazonProject.AmazonProject1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class TestCase5_AmazonSearchingTheProduct extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void SearchingTheProduct()
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
		
		Assert.assertEquals(actualText.contains("Hello, avir"),"User not logged-in");
		
		Amazon_SearchingProduct searchProduct= new Amazon_SearchingProduct(driver);
		searchProduct.searchProduct();
		
		
	}
	
}
