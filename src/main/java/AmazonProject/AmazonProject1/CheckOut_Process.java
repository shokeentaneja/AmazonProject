package AmazonProject.AmazonProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Process
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement clickOnCheckoutButton;
	
	@FindBy(xpath="(//span[@class='pmts-indiv-issuer-image'])[2]")
	private WebElement creditCardIcon;
	
	@FindBy(xpath="(//a[text()='Add a new credit or debit card'])[1]")
	private WebElement addCardDetails; 
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement cardNumber;
	
	@FindBy(xpath="//input[@name='ppw-accountHolderName']")
	private WebElement nickName;
	
	@FindBy(id="pp-BiJ6sP-23")
	private WebElement selectDate;
	
	@FindBy(id="pp-BiJ6sP-22")
	private WebElement selectYear;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement continueButtonforAccountDetails;
	
	public void checkoutButtonClick()
	{
		clickOnCheckoutButton.click();	
	}
	
	public void creditDebitCard()
	{
		creditCardIcon.click();	
	}
	
	public void cardDetails()
	{
		addCardDetails.click();
	}
	
	public void masterCardDetails()
	{
		cardNumber.sendKeys("788367668787");
	}
	
	public void nickNameOfCardHolder()
	{
		nickName.sendKeys("elve");
	}
	
	public void dateSelection()
	{
		selectDate.sendKeys("10");
	}
	
	public void yearSelection()
	{
		selectYear.sendKeys("2027");
	}
	
	public void cardDetailsContinueButton()
	{
		continueButtonforAccountDetails.click();
	}
	
	public CheckOut_Process(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
