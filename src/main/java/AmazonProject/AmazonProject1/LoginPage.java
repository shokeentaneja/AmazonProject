package AmazonProject.AmazonProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DDT;
import Utility.WaitUtil;


public class LoginPage extends DDT
{
	WebDriver driver;
	@FindBy(id="ap_email_login")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuebutton;
	
	@FindBy(id="ap_password")
	private WebElement validpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement accountText;
	
	public void withValidEmailId()
	{
		username.sendKeys(username1);
	}
	
	public void clickoncontinue()
	{
		continuebutton.click();
	}
	
	public void withValidPassword()
	{
		validpassword.sendKeys(password1);
	}
	
	public void clickOnsubmitButton()
	{
		WaitUtil.waitForElementClickable(driver, submitButton, 10).click();
		//signin.click();
		
	}
	
	public String getLoggedInUserText() 
	{
	    return accountText.getText();
	}
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
