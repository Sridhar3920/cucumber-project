package org.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelpClass{
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Alert ar;
	public static Select s;
	
	
	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	public static void fireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	public static void url(String url) {
		
		driver.get(url);
	}
	
	
	
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	
	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	public static void toText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	
	public static void printGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void checkText(WebElement element,String s) {
		String text = element.getText();
		if (text==s) {
			System.out.println("Successfully login");
			
			
		}
		else {
			System.out.println("Login faild");
		}
	}
	
	
	
	public static void toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	
	public static void performMoverToElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	
	public static void performDragAndDrop(WebElement src,WebElement desc) {
		a.dragAndDrop(src, desc).perform();
	}
	
	
	public static void performDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}
	
	
	public static void rightClick(WebElement element) {
		a.contextClick(element).perform();
	}
	
	
	public static void toPerformEnter(WebElement element) throws AWTException {
		new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void toTakesScreenshot(String name) throws IOException {
		ts=(TakesScreenshot)driver;
		File f1=ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\eclipse\\BrowserLaunch\\ScreenShots\\"+name+".png");
		Files.copy(f1, f2);
		
	}
	
	
	public static void toScroll(WebElement element1,WebElement element2) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element1);
		js.executeScript("arguments[0].scrollIntoView(false)", element2);
	}
	
	
	public static void toScroll(WebElement elementIsTop) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementIsTop);
	}
	
	public static void toScrollUp(WebElement elementIsTop) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementIsTop);
	}
	
	
	
	
	public static void toAcceptAlert() {
			ar=driver.switchTo().alert();
			String string1 = ar.toString();
			System.out.println(string1);
			ar.accept();
	}
		
		
	public static void toDismissAlert() {
		ar=driver.switchTo().alert();
		String string2 = ar.toString();
		System.out.println(string2);
		ar.dismiss();
	}
	
	
	public static void toGetAllOptionsInDropDown(WebElement element) {
		new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}
	
	
	public static void toGetAllSelectedOptions(WebElement element) {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
	}
	
	
	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}
	
	
	public static void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	
	
	public static void selectByValue(String value) {
		s.selectByValue(value);
	} 
	public static void switchWindow() {
		String parWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String eachWindow : allWin) {
			if (!(eachWindow).equals(parWin)) {
				driver.switchTo().window(eachWindow);
				
			}
			
		}
				
			}
		
	public static void implicitlyWaitSeconds(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
	
	public static void implicitlyWaitSeconds() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void threadSleep (int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	public static void threadSleep () throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void toDragAndDrop(WebElement drag,WebElement drop,int frameIndexValue) {
		//driver.switchTo().frame(frameIndexValue);
		a.dragAndDrop(drag, drop).perform();
	}
	
	public static String toReadExl (String sheet,int row,int cell) throws IOException  {
		File file=new File("D:\\eclipse\\CucumberFramework\\ExcelSheets\\testing.xlsx");
		FileInputStream f=new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook=new XSSFWorkbook(f);
		 Sheet sheets = workbook.getSheetAt(0);
		Row rows = sheets.getRow(row);
			Cell cells = rows.getCell(cell);
			@SuppressWarnings("deprecation")
			int type = cells.getCellType();
			if (type==1) {
				sheet = cells.getStringCellValue();
				
			}else if (DateUtil.isCellDateFormatted(cells)) {
				Date d = cells.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy");
				sheet = s.format(d);
				
			}else {
				double value = cells.getNumericCellValue();
				long l=(long)value;
				sheet= String.valueOf(l);
			}
			return sheet;
			
		}
	
	public static void currentDate() {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String cd = s.format(d);
		System.out.println(cd);
	}
	
		
		
	
	
	
	
	
	
	
		}
