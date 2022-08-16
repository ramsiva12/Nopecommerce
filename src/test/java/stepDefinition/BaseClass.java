package stepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AddCustomerPage;
import pageobjects.Loginpage;
import pageobjects.SalesPage;
import pageobjects.SearchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public Loginpage lp;
	public AddCustomerPage cp;
	public SearchCustomerPage sp;
	public SalesPage sales;

	public BaseClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	public static String randomemail() {
		String randomEmail = RandomStringUtils.randomAlphabetic(5);
		String randomPassword = RandomStringUtils.randomAlphanumeric(6);
		
		return randomEmail;
	}
	public static String randompassword() {
		
		String randomPassword = RandomStringUtils.randomAlphanumeric(6);
		
		return randomPassword;
	}
	

}
