package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriverWait wait ;

public WebDriver initializeDriver() throws IOException {

	prop= new Properties();
FileInputStream fis=new FileInputStream("/Users/drakker/eclipse-workspace/web/src/main/java/resources/data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver"));
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriver"));
	 driver= new FirefoxDriver();
	//execute in chrome driver
}
else if (browserName.equals("IE"))
{
//	IE code
}

else if (browserName.equals("safari"))
{
//	IE code
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
wait = new WebDriverWait(driver, 30);

return driver;

}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("/Users/drakker/eclipse-workspace/web/Screenshots/web/"+result+"screenshot.png"));
	
}



}
