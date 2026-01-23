package Utility;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass extends ListenersLogic
{
	//protected static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launchTheBrowser(@Optional("edge") String nameOfTheBrowser)
	{
		if(nameOfTheBrowser.equals("chrome"))
				{
					driver= new ChromeDriver();
				}
		if(nameOfTheBrowser.equals("edge"))
		{
			driver= new EdgeDriver();
			
		}
		if(nameOfTheBrowser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void quitTheBrowser()
	{
		driver.quit();
	}

}
