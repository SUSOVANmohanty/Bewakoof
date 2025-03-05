package LoginPgTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Loginpg.Lginpg;

public class LoginpgTest extends Base {
	
	Lginpg lp;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialisation();
		lp=new Lginpg();
	}
	@Test(priority=1)
	public void LoginFunction() throws InterruptedException
	{
		String expected="https://www.bewakoof.com/";
		String actual=lp.LoginFunction();
		if(expected.equals(actual))
		{
			System.out.println("Login Test Passed!");
		}else {
			System.out.println("Login Test Failed! Expected: " + expected + " but got: " + actual);
		}
	}
	@Test(priority=2)
	public void BewakoofFunctionTest() throws InterruptedException
	{
		String expTitel="Online Fashion Shopping for Men, Women, Accessories - Bewakoof.com";
		String actTitel=lp.BewakoofFunctionTest();
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
    
}
