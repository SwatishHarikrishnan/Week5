package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import week5.day1.testcase.CreateLead;

public class ReadExcelInput {
	public static void main(String[] args) throws IOException {

		//1.set up excel document path
		XSSFWorkbook readinput = new XSSFWorkbook("./data/Createlead.xlsx");
		
		//2.set up worksheet
		XSSFSheet sheet=readinput.getSheet("Sheet1");
		
		//3.getting total row count
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total number of rows count " +(rowcount+1));
		
		//4.getting total column count
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of columns count " +sheet.getPhysicalNumberOfRows());
		
		//iterating all datas inside row and column
		for (int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
				String Output = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(Output);
			}
		}
		
		//6.close
		readinput.close();
	}

}
