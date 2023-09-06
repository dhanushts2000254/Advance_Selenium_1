package runner_class_1;

import org.testng.annotations.Test;

import generic_class_1.generic;
import pom_1.pom;

public class runner extends generic
{
@Test
public void test()
{
	pom p=new pom(driver);
	p.un().sendKeys("admin");
	p.pass().sendKeys("passwords");
	p.login().click();
	//dhy
	//hhhf
}
}
