package utilities;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public  XSSFSheet sh;
	public  FileInputStream f;
	public  XSSFWorkbook w;
	public  ExcelRead(String sheet) throws IOException
	{
		//f=new FileInputStream("D:\\newWorkspace\\ExcelRead\\src\\main\\resources\\ExcelRead1.xlsx");
		String path = System.getProperty("user.dir");
//		//System.out.println(path);
		f=new FileInputStream(path+"\\src\\main\\resources\\ExcelRead1.xlsx");
	w=new XSSFWorkbook(f); 	
	sh=w.getSheet(sheet); 
}
	
public String readData(int row, int column) 	
{ 	
	XSSFRow r=sh.getRow(row); 	
	XSSFCell c =r.getCell(column); 		
	CellType type =c.getCellType(); 	
	switch(type) 		
	{ 	
case STRING: 	
{ 	
	return c.getStringCellValue(); 	
	} 	
case NUMERIC: 
	{ 			
		int a=(int) c.getNumericCellValue(); 	
		return String.valueOf(a); 	
		}
	default:
		return " "; 	
	}
	
	}
}

