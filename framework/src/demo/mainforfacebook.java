package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class mainforfacebook extends gforfacebook
{
@Test
public void test()
{
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
