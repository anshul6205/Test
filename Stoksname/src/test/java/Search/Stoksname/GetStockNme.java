package Search.Stoksname;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetStockNme {
	public static void main(String[] args) throws Exception {
		getdata();
	}
	  public static void getdata() throws IOException
	  {
		FileInputStream fis = new FileInputStream("G:\\Selenium\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet2=wb.getSheet("Sheet1");
		int rowcount=sheet2.getLastRowNum();
//		int colNum = rowcount.getcell();
		wb.close();
		for(int i=0;i<=rowcount;i++) {
			for(int j=0;j<=9;j++) {
				if(rowcount==0) {
					System.out.println("no value");
					
				}else{
				String rows=sheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.println(rows);
				}
			}
		}
		
	  }
}
