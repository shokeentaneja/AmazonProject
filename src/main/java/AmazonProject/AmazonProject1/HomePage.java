package AmazonProject.AmazonProject1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.WaitUtil;


public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountslist;
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement  signin;
	
	public void hoverover(WebDriver driver)
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(accountslist).perform();
		
		}
	
	public void clickToSignin()
	{
		/*WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
		//signin.click();	*/
		WaitUtil.waitForElementClickable(driver, signin, 10).click();;
		
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
