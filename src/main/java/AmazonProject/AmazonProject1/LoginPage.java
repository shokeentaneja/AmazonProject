package AmazonProject.AmazonProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(id="ap_email_login")
	private WebElement Username;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuebutton;
	
	@FindBy(id="ap_password")
	private WebElement validpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement signin;
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement accountText;
	
	public void withValidEmailId()
	{
		Username.sendKeys("shokeentaneja06@gmail.com");
	}
	
	public void clickoncontinue()
	{
		continuebutton.click();
	}
	
	public void withValidPassword()
	{
		validpassword.sendKeys("Avir@12345");
	}
	
	public void clickOnsubmitButton()
	{
		signin.click();
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
