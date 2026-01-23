package Utility;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersLogic implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		//WebDriver driver= driver;
//		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Case is pass");
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\shokeen.taneja\\eclipse-workspace\\AmazonProject1\\Screenshot\\Pass\\1.png");
		 try {
			FileHandler.copy(source,destination);
		} 
		catch (IOException e)
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Case is fail");
		//TakesScreenshot driver = null;
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\shokeen.taneja\\eclipse-workspace\\AmazonProject1\\Screenshot\\Fail\\fail.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
