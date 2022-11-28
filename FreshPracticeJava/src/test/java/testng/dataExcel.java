package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\jyoti\\OneDrive\\Desktop\\data3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sh.getRow(i);
			
			for(int j=0;j<colcount;j++);
			{
				String val=currentrow.getCell(i).toString();
				System.out.print(val);
			}
			System.out.println();
		}
	}
 
}
