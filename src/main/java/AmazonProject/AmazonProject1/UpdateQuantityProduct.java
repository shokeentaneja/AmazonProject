package AmazonProject.AmazonProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class UpdateQuantityProduct 
{
	WebDriver driver;
	@FindBy(xpath="//span[@id='sw-gtc']")
	private WebElement goToCart;
	
	@FindBy(xpath="//span[@data-a-selector='value']")
	private WebElement updateQuantity;
	
	@FindBy(id="sc-active-items-header")
	private WebElement isMoveToCartPage;

	@FindBy(xpath="//span[@data-a-selector='value']")
	private WebElement isQuantityUpdated;


	public void clickOngoToCart()
	{
		goToCart.click();
	}
	
	public void updateProduct() throws InterruptedException
	{
		int quantity = Integer.parseInt(updateQuantity.getText());
		
		if(quantity>0)
		{
			quantity++;
			System.out.println("Items count in the cart: "+quantity);
			Thread.sleep(1000);
		}
	}
	
	public boolean isMoveToCart()
	{
		return isMoveToCartPage.isDisplayed();
		
	}
	public boolean isCountIncreasingOfTheCart ()
	{
		int quantity = Integer.parseInt(updateQuantity.getText());
		
		if(quantity>0)
		{
			quantity++;
			System.out.println("Items count in the cart: "+quantity);
	}
		return isQuantityUpdated.isDisplayed();
	}
	
	public UpdateQuantityProduct(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
}
