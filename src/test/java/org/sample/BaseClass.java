package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static final String String = null;

	public static WebDriver driver;
	
	public static Select s;
	
	public static Actions a;
	
	public static Robot r;
	
	public static void launchBrowser() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prath\\eclipse-workspace\\MavenTesting\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
	}
	
	public static void chromebrowser() {
      
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
    public static void launchUrl(String url) {
	
	driver.get(url);
		
	}
    
    public static void maxWindow() {
		
    	driver.manage().window().maximize();

	}
    
    public static  void TakeSnapshot(String PageName) throws IOException {
    	
		TakesScreenshot  tk=(TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\prath\\eclipse-workspace\\MavenTesting\\ScreenShots\\" +PageName+".png");
		
		FileUtils.copyFile(src, des);
		
		
	}
    
    
    public static void Data() {
    	
    	Date d=new Date();
    	System.out.println(d);


	}

    public static void pageTitle() {
		
    	String titlename = driver.getTitle();
    	
    	System.out.println("Title Name =" +titlename);
	}
    
    public static void pageurl() {
		
    	String currentUrl = driver.getCurrentUrl();
    	
    	System.out.println("Page Current Url =" +currentUrl);

	}
    
    public static void closeCurrentPage() {
		
    	driver.close();

	}
    
    public static void closeCurrentBrowser() {
    	
		driver.quit();
	}
    
    public static void fillTextBox(WebElement element,String value) {
    
    	element.sendKeys(value);
  

    }
    public static  void Click(WebElement ref) {
    	
    	ref.click();
	}
    
     public static  void dropDown(WebElement loc,String txt) {
    	 
    	 s=new Select(loc);
    	 s.selectByVisibleText(txt);
     }
    
    public static void timeWait(int i) {

      driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);

	}
    
    
    public static String getattribute(WebElement attr) {
    	
    	String attribute = attr.getAttribute("value");
    	
    	System.out.println(attribute);
    	
		return attribute;
    	
    	
    	
    	
}
    
    public static String readFromExcel(String Sheet,int rowNo,int cellNo) throws IOException {
    	
    	File f=new File("C:\\Users\\prath\\eclipse-workspace\\MavenTesting\\ExcelData\\TestData.xlsx");
    	
    	FileInputStream Fin=new FileInputStream(f);
    	
    	Workbook book=new XSSFWorkbook(Fin);
    	
    	Sheet sh = book.getSheet(Sheet);
    	
    	Row r = sh.getRow(rowNo);
    	
    	Cell c = r.getCell(cellNo);
    	
    	int type = c.getCellType();
    	
    	String data;
    	
    	if (type==1) {
    		
    		 data = c.getStringCellValue();
			
		}
    	
    	else if (DateUtil.isCellDateFormatted(c)) {
    		
    		
    		Date date = c.getDateCellValue();
    		SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyyy");
    		 data = form.format(date);
			
		}

    	else {
    		
    		double d = c.getNumericCellValue();
    		
    		long l=(long)d;
    		
    		data = String.valueOf(l);
			
		}
    	return data;
	}
    
    public static  void clickDouble(WebElement ele) {
	 
	 a=new Actions(driver);
	 
	 a.doubleClick(ele);


    }
    public static  void clickRight(WebElement ele) {
    	
     a=new Actions(driver);
     a.contextClick(ele);

	}
    
    public static void moveToElement(WebElement ele) {
    	
    a=new Actions(driver);	
    a.moveToElement(ele);


	}
    
    public static void dragAndDrop(WebElement source,WebElement target) {
    	
    a=new Actions(driver);	

     a.dragAndDrop(source, target);
     
     
	}
    
    public static void copy() throws AWTException {

     Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_C);
    
	}
    
    public static void paste() throws AWTException {
    	
    	 Robot r=new Robot();
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	 r.keyPress(KeyEvent.VK_V);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
    	 r.keyRelease(KeyEvent.VK_V);
    	    
	}
    
    public static  void createNewExcel(String SheetName,int RowNo,int CellNo,String value) throws IOException {

      File f=new File("C:\\Users\\prath\\eclipse-workspace\\MavenTesting\\ExcelData\\TestData.xlsx");
      
      FileInputStream fis=new FileInputStream(f);
      
      Workbook book=new XSSFWorkbook();
      
      Sheet sh= book.getSheet(SheetName);
      
      Row r = sh.createRow(RowNo);
      
      Cell c = r.createCell(CellNo);
      
      c.setCellValue(value);
      
      FileOutputStream fin=new FileOutputStream(f);
      
      book.write(fin);

	}
    public static void WriteInExcitingFile(int RowNo,int CellNo,String object) throws IOException {
    	
    	File f=new File("C:\\Users\\prath\\eclipse-workspace\\MavenTesting\\ExcelData\\TestData.xlsx");
    	
    	FileInputStream Fis=new FileInputStream(f);
    	
    	Workbook book=new XSSFWorkbook(Fis);
    	
    	Sheet sh = book.getSheet("Data");
		
    	Row r = sh.createRow(RowNo);
    	
    	Cell c = r.createCell(CellNo);
    	
    	c.setCellValue(object);
    	
    	FileOutputStream fout=new FileOutputStream(f);
    	
    	book.write(fout);
    	
    	
    	
    	
    	
	}
    	
    }
    
    
           

             



	
    



