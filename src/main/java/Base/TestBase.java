package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static  WebDriver driver;
	public  WebDriver initaliaztion() throws IOException
	{

		Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\zerodha\\data.properties");
prop.load(file);
String browsername=prop.getProperty("browser");
if(browsername.equals("Chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\zerodha\\Chromedriver.exe");
 driver= new ChromeDriver();	
}
else if  (browsername=="Firefox")
{

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\zerodha\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();	
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return(driver);

	}

}
