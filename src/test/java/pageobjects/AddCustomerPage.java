package pageobjects;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
     WebElement CustomerMenu;
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]")
    WebElement CustomerIcon;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]")
    WebElement AddNewicon;
	
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
    WebElement AddEmail;
	
	@FindBy(how=How.XPATH,using="//input[@id='Password']")
    WebElement AddPassword;
	
	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")
    WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")
    WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@id='Gender_Male']")
    WebElement MaleGender;
	
	@FindBy(how=How.XPATH,using="//input[@id='Gender_Female']")
    WebElement FemaleGender;
	
	@FindBy(how=How.XPATH,using="//input[@id='DateOfBirth']")
    WebElement DateofBirth;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[6]/div[2]/span[1]/span[1]/span[1]")
    WebElement Dateselect;
	
	@FindBy(how=How.XPATH,using="//input[@id='Company']")
    WebElement Company;
	
	@FindBy(how=How.XPATH,using="//input[@id='IsTaxExempt']")
    WebElement Taxcheck;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[9]/div[2]/div[1]/div[1]/div[1]/div[1]")
    List<WebElement> NewsLetter;
	
	@FindBy(how=How.XPATH,using="//label[@id='SelectedCustomerRoleIds_label']")
    List<WebElement>CustomerRoles;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='VendorId']")
    WebElement Vendor;
	
	@FindBy(how=How.XPATH,using="//input[@id='Active']")
    WebElement ActiveId;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='AdminComment']")
    WebElement AdminContent;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]")
    WebElement Save;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/div[1]/div[1]/button[2]")
    WebElement SaveandContinue;
	
	
	public void ClickCustomerMenu() {
		CustomerMenu.click();
	}
	
	public void ClickCustomerIcon() {
		CustomerIcon.click();
	}
	
	public void ClickAddNew() {
		AddNewicon.click();
	}
	
	public void setEmail(String email) {
		AddEmail.clear();
		AddEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		AddPassword.clear();
		AddPassword.sendKeys(password);
	}
	
	public void setFirstName(String firstname) {
		FirstName.clear();
		FirstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		LastName.clear();
		LastName.sendKeys(lastname);
	}
	
	public void setGender() {
		MaleGender.click();
		FemaleGender.click();
	}
	
	public void SetDateofBirth(String date) {
		DateofBirth.sendKeys(date);
	}
	
	public void SetDateSelect() {
		Dateselect.click();
		Dateselect.click();
	}
	
	public void setCompanyName(String company) {
		Company.sendKeys(company);
	}
	
	public void setTaxExempt() {
		
		Taxcheck.click();
	}
	
	public void setNewsLetter(int index)
	{
		NewsLetter.get(index);
		
	}
	
	
//	public void setNewsLetter(String newstext ) {
//		WebElement newstexttype=null;
//		NewsLetter.sendKeys(Keys.DOWN);
//		NewsLetter.click();
//		if(newstext.equalsIgnoreCase("Your store name")) {
//			newstexttype=ldriver.findElement(By.xpath("//span[contains(text(),'Your store name')]"));
//		}
//		else if(newstext.equalsIgnoreCase("Test store 2")) {
//			newstexttype=ldriver.findElement(By.xpath("//span[contains(text(),'Test store 2')]"));
//		}
//		newstexttype.click();
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].click", newstexttype);	
//	}
	 
	public void setCustomerRole(int role) throws InterruptedException {
		
		CustomerRoles.clear();
		CustomerRoles.get(1);
	    Thread.sleep(3000);
	}
//	   
//		
//
//		if(roletype.equalsIgnoreCase("Administrator")) {
//			listitem=ldriver.findElement(By.xpath("//li[contains(text(),'Administrators')]"));
//		}
//		else if(roletype.equalsIgnoreCase("forum moderators")) {
//			listitem=ldriver.findElement(By.xpath("//li[contains(text(),'Forum Moderators')]"));
//		}
//		else if(roletype.equalsIgnoreCase("Guest")) {
//			listitem=ldriver.findElement(By.xpath("//span[contains(text(),'Guests')]"));
//		}
//		else if(roletype.equalsIgnoreCase("Rigistered")) {
//			listitem=ldriver.findElement(By.xpath("//span[contains(text(),'Registered')]"));
//		}
//		else if(roletype.equalsIgnoreCase("Vendors")) {
//			listitem=ldriver.findElement(By.xpath("//span[contains(text(),'Vendors')]"));
//		}
//		listitem.click();
//		
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].click", listitem);
//		
//	}
	
	
	public void SelectVendor() {
		Select ven = new Select( Vendor);
		ven.selectByVisibleText("Vendor 1");
		
	}
	
	public void setActiveid() {
		ActiveId.click();
	}
	
	public void setAdminContent(String content) {
		AdminContent.sendKeys(content);
	}
	
	public void ClickonSave() {
		Save.click();
	}
	
	public void ClickSaveAndContinue() {
		SaveandContinue.click();
	}
}
