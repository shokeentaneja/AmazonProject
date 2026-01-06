package AmazonProject.AmazonProject1;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Utility.BaseClass;
import Utility.ListenersLogic;
import Utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class TestCase9_verifyProductAddedToCart extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void ProductDetails() throws InterruptedException
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
		
		
		Amazon_SearchingProduct searchProduct= new Amazon_SearchingProduct(driver);
		searchProduct.searchProduct();
		
		ProductDetailsDisplay productdetails= new ProductDetailsDisplay(driver);
		productdetails.listOfElement();
		productdetails.parentChildID();
		productdetails.clickONAddToCart();
		Assert.assertTrue(productdetails.IsproductAddedInTheCart(),"Product was NOT added to cart");
		
		
		productdetails.scrollXY();
		
		
		
		
	}
	
}
