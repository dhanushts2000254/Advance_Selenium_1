package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class gforfacebook 
{
WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
@AfterMethod
public void close()
{
	driver.close();
}
}
