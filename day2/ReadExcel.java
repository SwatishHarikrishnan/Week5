package week5.day2;

import java.io.IOException;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] ExcelRead(String filename) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook("./Data/"+filename+".xlsx");
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		
		String data[][]= new String[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++)
		{
			//int lastCellnum = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<lastCellNum;j++)
			{
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(text + " ");
				data[i-1][j]=text;
			}
			System.out.println();
		}
		return data;
		
	}

}
