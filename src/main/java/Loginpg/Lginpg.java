package Loginpg;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Lginpg extends Base {

	@FindBy(xpath = "//span[text()='LOGIN']")
	private WebElement Login;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phno;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	private WebElement cont;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement login;
	@FindBy(xpath = "//span[text()='Male']")
	private WebElement gender;
	@FindBy(xpath = "//input[@type='text'])[2]")
	private WebElement otp1;
	@FindBy(xpath = "//input[@type='text'])[3]")
	private WebElement otp2;
	@FindBy(xpath = "//input[@type='text'])[4]")
	private WebElement otp3;
	@FindBy(xpath = "//input[@type='text'])[5]")
	private WebElement otp4;
	@FindBy(xpath = "//*[name()='rect' and contains(@width,'18')]")
	private WebElement tik;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continu;

	@FindBy(xpath = "//img[@fetchpriority='high']")
	private WebElement home;
	@FindBy(xpath = "//a[normalize-space()='Men']")
	private WebElement men;
	@FindBy(xpath = "//a[@href='/mens-denim']//div[@class='my-4']//span[@type='sm'][normalize-space()='Jeans']")
	private WebElement jeans;
	@FindBy(xpath = "(//*[name()='rect'])[2]")
	private WebElement size;
	@FindBy(xpath = "(//span[@class='sc-f48c17b3-0 fjEpcQ'])[52]")
	private WebElement slimjean;
	@FindBy(xpath = "(//label[@class='sc-fc819127-2 sc-fc819127-5 bcHcti ckKNWd'])[2]")
	private WebElement wsize;
	@FindBy(xpath = "(//button[@variant='primary'])[1]")
	private WebElement addtobag;
	@FindBy(xpath = "//span[@type='3xs']")
	private WebElement bagicon;
	@FindBy(xpath = "//button[@aria-label='Remove Product']//*[name()='svg']")
	private WebElement cross;
	@FindBy(xpath = "(//button[@data-testid='button'])[1]")
	private WebElement remove;
	@FindBy(xpath = "//img[@fetchpriority='high']")
	private WebElement home1;

	public Lginpg() {
		PageFactory.initElements(driver, this);

	}

	public String LoginFunction() throws InterruptedException {
		
		Login.click();
		Thread.sleep(2000);
		phno.sendKeys("7978449593");
		Thread.sleep(2000);
		cont.click();
		Thread.sleep(2000);
		login.sendKeys("mohantysusovan04@gmail.com");
		Thread.sleep(2000);
		gender.click();
		Thread.sleep(2000);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter OTP");
		String o = s.next();
		String o1 = s.next();
		String t = s.next();
		String p = s.next();
		otp1.sendKeys("o");
		otp2.sendKeys("o1");
		otp3.sendKeys("t");
		otp4.sendKeys("p");
		Thread.sleep(31000);
		tik.click();
		Thread.sleep(2000);
		continu.click();
		return driver.getCurrentUrl();
	}

	public String BewakoofFunctionTest() throws InterruptedException 
	{
		
		home.click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(men).build().perform();
		Thread.sleep(2000);
		jeans.click();
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(2000);
		size.click();
		Thread.sleep(2000);
		slimjean.click();
		Thread.sleep(2000);
		wsize.click();
		Thread.sleep(2000);
		addtobag.click();
		Thread.sleep(2000);
		bagicon.click();
		Thread.sleep(2000);
		cross.click();
		Thread.sleep(2000);
		remove.click();
		Thread.sleep(2000);
		return driver.getTitle();
	}
}
