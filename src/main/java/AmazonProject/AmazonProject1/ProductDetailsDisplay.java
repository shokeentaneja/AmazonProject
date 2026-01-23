package AmazonProject.AmazonProject1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsDisplay 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[contains(@class,'a-fixed-left-grid-col a-col-left')]/i[@data-hook='average-star-rating']/span")
	private WebElement content;
	
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement itemAddedInTheCart;
	
	public void listOfElement()
	{
		List<WebElement>list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		list.get(0).click();
			
	}
	
	public void parentChildID() throws InterruptedException
	{
		Set<String>pcid=driver.getWindowHandles();
		Iterator<String> id=pcid.iterator();
		id.next();
		String childid =id.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
	}
	
	public void clickONAddToCart()
	{
		addToCart.click();
		
	}
	
	public boolean IsproductAddedInTheCart() throws InterruptedException
	{
//		Set<String>pcid=driver.getWindowHandles();
//		Iterator<String> id=pcid.iterator();
//		id.next();
//		String childid =id.next();
//		driver.switchTo().window(childid);
//		Thread.sleep(3000);
		try
		{
			return itemAddedInTheCart.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}  
	}
	
	public void scrollXY() throws InterruptedException
	{
		Point p1=content.getLocation();
		p1.getX();
		int y=p1.getY();
		
		JavascriptExecutor  js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
	}
	public ProductDetailsDisplay(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
