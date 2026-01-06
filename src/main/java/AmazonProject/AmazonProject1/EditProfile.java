package AmazonProject.AmazonProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountslist;
	
	@FindBy(xpath="//button[text()='Manage Profiles']")
	private WebElement editProfile;
	
	@FindBy(linkText="View")
	private WebElement viewLink;
	
	@FindBy(xpath="//div[@class='sc-dLMFU sc-ikkxIA EZIgf kpsBEL profile-detail-primary']")
	private WebElement accountHolder;
	
	public void hoverover(WebDriver driver)
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(accountslist).perform();
		
		}
	
	public void editProfile()
	{
		editProfile.click();
	}
	
	public void clickOnViewProfile() throws InterruptedException
	{
		viewLink.click();
		Thread.sleep(2000);
	}
	public String accountHolderName()
	{
		return accountHolder.getText();	
	}
	
	public EditProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
