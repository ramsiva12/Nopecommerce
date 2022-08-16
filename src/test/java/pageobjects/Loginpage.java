package pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(how=How.XPATH, using="//input[@id='Email']")
	WebElement Email;
	@FindBy(how=How.XPATH, using="//input[@id='Password']")
	WebElement Password;
	@FindBy(how=How.XPATH, using="//input[@id='RememberMe']")
	WebElement RememberCheckBox;
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Log in')]")
	WebElement LogInButton;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Logout')]")
	WebElement LogoutButton;
	
	
	//Login into the website//...........................
	
	public void setEmail(String useremail) {
		Email.clear();
		Email.sendKeys(useremail);
		
	}
	public void setPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
		
	}
	public void clickonLogin() {
		LogInButton.click();
		
	}
	public void clickonLogout() {
		LogoutButton.click();
	}
	
	
	
	

	public static void main(String[] args) {
		
		}
		
		

	}


