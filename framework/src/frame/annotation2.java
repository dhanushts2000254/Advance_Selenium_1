package frame;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class annotation2 
{

@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement a = driver.findElement(By.xpath("//a[.='Create new account']"));
	a.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement b = driver.findElement(By.xpath("//select[@id='day']"));
	b.click();
	String z = b.getText();
	Select c=new Select(b);
	c.selectByIndex(24);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement d = driver.findElement(By.xpath("//select[@id='month']"));
	d.click();
	Select e=new Select(d);
	e.selectByVisibleText("Apr");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	WebElement f = driver.findElement(By.xpath("//select[@id='year']"));
	f.click();
	Select g=new Select(f);
	g.selectByValue("2000");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	TakesScreenshot t=(TakesScreenshot)driver;
	File s = t.getScreenshotAs(OutputType.FILE);
	File sr=new File("C:\\Users\\hp\\Pictures.jpeg");
	try {
		FileHandler.copy(s, sr);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Reporter.log(z, true);
	driver.close();
}
}
