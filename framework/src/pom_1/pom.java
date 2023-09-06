package pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
@FindBy(name="email")
private WebElement username;
@FindBy(name="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;
public pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public WebElement un() 
{
	return username;	
}
	public WebElement pass()
{
	return password;
}
	public WebElement login() 
{
	return login;
}
}
