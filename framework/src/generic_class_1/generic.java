package generic_class_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base_constant_1.baseconstant;

public class generic implements baseconstant
{
public WebDriver driver;
@BeforeMethod
public void oppApp()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(baseurl);
}
@AfterMethod
public void close()
{
	driver.close();
}
}
