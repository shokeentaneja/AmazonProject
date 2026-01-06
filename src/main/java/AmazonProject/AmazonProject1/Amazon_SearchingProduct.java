package AmazonProject.AmazonProject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SearchingProduct 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement id;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	private WebElement sorting;
	
	public void searchProduct()
	{
		id.sendKeys("shoes"+Keys.ENTER);
	}
	public void sortTheProduct()
	{
		sorting.click();
		Select s1=new Select(sorting);
		s1.selectByIndex(2);
	}
	
	public Amazon_SearchingProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
