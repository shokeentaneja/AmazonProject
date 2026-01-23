package AmazonProject.AmazonProject1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.WaitUtil;

public class Amazon_SearchingProduct 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement id;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	private WebElement sorting;
	
	// Sort option example: Price Low to High
		@FindBy(xpath="//a[text()='Price: Low to High']")
		private WebElement lowToHighOption;
	
	public void searchProduct()
	{
		id.sendKeys("shoes"+Keys.ENTER);
	}
	public void sortTheProduct() throws InterruptedException
	{
		//sorting.click();
		
			WaitUtil.waitForElementClickable(driver, sorting, 10).click();
			WaitUtil.waitForElementClickable(driver, lowToHighOption, 10).click();
			Thread.sleep(2000);
		
		/*sorting.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sorting.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		sorting.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		sorting.sendKeys(Keys.ENTER);*/
	}
	
	
	
	public Amazon_SearchingProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
