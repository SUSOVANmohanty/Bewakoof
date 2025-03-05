package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class Base {

	public static WebDriver driver;
	public void initialisation() throws IOException
	{
		WebDriverManager.chromedriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bewakoof.com/");
	}

}
