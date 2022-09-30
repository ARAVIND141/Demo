package org.tcs;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass{

	   WebDriver driver;

	 //launch u r l
	public void browserLaunch(String url) {

	WebDriverManager.chromedriver().setup();


	driver=new ChromeDriver();

	driver.get(url);

	driver.manage().window().maximize();
	}
	//find locator
	//id
	public WebElement locatorId(String locator) {

	WebElement element = driver.findElement(By.id(locator));
	return element;
	}
	//name

	public WebElement locatorName(String locator) {

	WebElement element = driver.findElement(By.name(locator));
	return element;
	}
	//class
	public WebElement locatorClass(String locator) {

	WebElement element = driver.findElement(By.className(locator));
	return element;

	}
	//x path locator
	public WebElement  locatorXpath(String locator) {

	WebElement element = driver.findElement(By.xpath(locator));
	return element;
	}
	//send keys


	public void sendkey(WebElement element,String value) {

	element.sendKeys(value);

	}
	//quit

	public void quit() {


	driver.quit();

	}
	//get text

	public void gettext(WebElement element ) {

	String text = element.getText();
	System.out.println(text);

	}
	//get tag name

	private void tagName(WebElement element) {

	String tagName = element.getTagName();

	System.out.println(tagName);

	}
	//get attribute

	public void getattribute(WebElement element) {

	String attribute = element.getAttribute("value");
	System.out.println(attribute);

	}

	//click
	public void clicks(WebElement element) {
	element.click();
	}
	//action move to element
	public void action(WebElement element) {

	Actions action=new Actions (driver);

	action.moveToElement(element).perform();

	}
	//action double click
	public void actionDouble(WebElement element) {

	Actions action1=new Actions(driver);

	action1.doubleClick(element).perform();
	}
	//action context click
	public void actionContext(WebElement element) {

	Actions action2=new Actions(driver);

	action2.contextClick(element).perform();
	}
	//action drag and drop
	public void actiondrag(WebElement src,WebElement desn) {
	Actions action3=new Actions(driver);

	action3.dragAndDrop(src,desn).perform();

	}
	//robot
	public void robot(int number) throws AWTException {

	Robot robot=new Robot();
	for (int i = 0; i <number ; i++) {

	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	}


	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void threadsleep(int second) throws InterruptedException {

	Thread.sleep(second);

	}
	//screenshot
	public void screenshot(String path) throws IOException {

	TakesScreenshot ts=(TakesScreenshot)driver;
	File screen = ts.getScreenshotAs(OutputType.FILE);

	File f=new File(path);

	FileUtils.copyFile(screen,f);

	}

	//scroll up and down

	public void scrolldown(WebElement element) {

	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].scrollIntoView(true)",element);

	}

	public void scrollup(WebElement element) {

	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].scrollIntoView(false)",element);

	}
	//alert
	public  void simplealert() {

	Alert alert = driver.switchTo().alert();

	alert.accept();

	}
	public void  comfirmAlert() {
	Alert alert1=driver.switchTo().alert();

	alert1.dismiss();

	}

	public void prompt(String name) {

	Alert alert2 = driver.switchTo().alert();

	alert2.sendKeys(name);

	alert2.accept();
	}
	//select-drop down

	public void select(WebElement element,int number) {

	Select select=new Select(element);

	select.selectByIndex(number);

	}
	public void select1(WebElement element,String text) {
	Select select=new Select(element);

	select.selectByVisibleText(text);

	}
	public void select2(WebElement element,String value) {
	Select select=new Select(element);

	select.selectByValue(value);
	}

	public WebElement selectGetOptions(WebElement element) {
	Select select =new Select(element);

	List<WebElement> options = select.getOptions();
	for (WebElement ww : options) {


	}
	return element;

	}

	public void getallselectoption(WebElement element) {
	Select select =new Select(element);

	List<WebElement> selectedOptions = select.getAllSelectedOptions();

	for (WebElement ww : selectedOptions) {
	System.out.println(ww.getText());
	}



	}

	//frames

	public void framesize() {

	List<WebElement> elements = driver.findElements(By.tagName("frame"));

	int size = elements.size();
	System.out.println(size);

	}

	public void frame(WebElement element) {

	driver.switchTo().frame(element);

	}

	public void frameindex(int num) {

	driver.switchTo().frame(num);

	}
	public  void framestring(String text) {
	       
	driver.switchTo().frame(text);

	}
	public void framename(String name) {

	driver.switchTo().frame(name);

	}
	//window handle

	public void pw() {

	String pw = driver.getWindowHandle();

	Set<String> cwindow = driver.getWindowHandles();


	for (String g : cwindow) {
	if (pw!=g) {


	driver.switchTo().window(g);
	}
	}


	}

	public void window(String ID) {

	driver.switchTo().window(ID);

	}
	//table
	public int table() {

	List<WebElement> element = driver.findElements(By.tagName("table"));

	int size = element.size();

	return size;

	}
	 public int tablerow() {


	List<WebElement> element = driver.findElements(By.tagName("tr"));

	int size = element.size();

	return size;

	}
	 
	 public int tablesdata() {

	List<WebElement> element = driver.findElements(By.tagName("td"));

	int size = element.size();

	return size;

	}
	


	}
	 

	}



