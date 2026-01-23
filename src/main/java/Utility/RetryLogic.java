package Utility;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class RetryLogic implements IRetryAnalyzer
{
	int initialcount=0;
	int retrycount=1;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		Reporter.log("Since the testcase got failed it has to be Retried 1 times");

		if(initialcount<retrycount)
		{
			initialcount++;
			return true;	
		}
		return false;
	}
}