package Utility;
//fetch the value from excel sheet
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT 
{
	public static String username1;
	public static String password1;
	public static String username2;
	public static String password2;
	
	public void data_Fetching() throws EncryptedDocumentException, IOException
	{

	FileInputStream fis=new  FileInputStream("C:\\Users\\shokeen.taneja\\eclipse-workspace\\AmazonProject1\\ExcelSheet\\Creds.xlsx");
	        //step 2
	                Workbook wb=WorkbookFactory.create(fis);
	                username1=        wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	                password1=        wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	               
	               username2=        NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
	                password2=        wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	                wb.close();
	        			fis.close();
					

	}       
}