package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Table;

import utilities.WaitHelper;

public class SearchCustomerPage {
	public WebDriver ldriver;
	WaitHelper waithelper;

	public SearchCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchEmail']")
	WebElement SearchByEmail;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchFirstName']")
	WebElement SearchByfirstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchLastName']")
	WebElement SearchByLastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchCompany']")
	WebElement SearchByCompany;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchIpAddress']")
	WebElement SearchByIp;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]")
	List <WebElement> SearchByRole;
	
	@FindBy(how=How.XPATH,using="//button[@id='search-customers']")
	WebElement SearchButton;
	
	@FindBy(how=How.XPATH,using="//th[contains(text(),'Email')]")
	WebElement tableEmailHeader;
	
	@FindBy(how=How.XPATH,using="//th[contains(text(),'Name')]")
	WebElement tableNameHeader;
	
	@FindBy(how=How.XPATH,using="//th[contains(text(),'Customer roles')]")
	WebElement tableCustRoleHeader;
	
	@FindBy(how=How.XPATH,using="//th[contains(text(),'Company name')]")
	WebElement tableCompanyNameHeader;
	
	@FindBy(how=How.XPATH,using="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(how=How.XPATH,using="//table[@id='customers-grid']//tbody")
	List<WebElement> tablerows;
	
	@FindBy(how=How.XPATH,using="//table[@id='customers-grid']//tbody//tr//td")
	List<WebElement> tableColumns;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchFirstName']")
	WebElement SearchByFirstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='SearchLastName']")
	WebElement SearchByLasttname;
	
	
	
	//Action methods.................
	
	public void SearchByemail(String Email) {
		//waithelper.WaitForElement(Email, 30);
		
		
		SearchByEmail.sendKeys(Email);
		
		
	}
	
	
	public void clickonSearch() {
		SearchButton.click();
		
	}
	
	public int getNoofRows() {
//		int data = tablerows.size();
//		System.out.println("No of rows "+ data);
//		List<WebElement> element = ldriver.findElements(By.xpath("//table[@id='customers-grid_wrapper']//tbody//tr"));
//		System.out.println(element);
		return tablerows.size();
	}
	
	public int getNoofcolumns() {
		return tableColumns.size();
		
	}
	
	public boolean SearchCustomerByType(String Custdata) {
		
		boolean flag = false;
		
		for(int i=1;i<=getNoofRows();i++) {
			String CustomerEmail = table.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]")).getText(); 
			System.out.println(CustomerEmail);
			String CustFirstName = table.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]")).getText(); 
			String CustLastName = table.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]")).getText(); 
			if(CustomerEmail.equals("james_pan@nopCommerce.com")) {
				System.out.println(CustomerEmail);
				flag = true;
			}
			else if(CustFirstName.equals("brenda_lindgren@nopCommerce.com")) {
				System.out.println(CustFirstName);
				flag = true;
			}
			
			else if(CustLastName.equals("arthur_holmes@nopCommerce.com")) {
				System.out.println(CustLastName);
				flag= true;
			}
		}
		return flag;
	}
	
    public boolean SearchCustomerByFirstName(String firstname) {
		
		boolean flag = false;
		for(int i=1;i<=getNoofRows();i++) {
			String CustomerFirstName = table.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[3]")).getText(); 
			System.out.println(CustomerFirstName);
			
			if(CustomerFirstName.equals("Brenda")) {
				flag = true;
			}
			
		}
		return flag;
	}
    
 public boolean SearchCustomerByLastName(String lasttname) {
		
		boolean flag = false;
		for(int i=1;i<=getNoofRows();i++) {
			String CustomerLastName = table.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[3]")).getText(); 
			System.out.println(CustomerLastName);
			
			if(CustomerLastName.equals("Brenda")) {
				flag = true;
			}
			
		}
		return flag;
	}
	
	
    
	
	public void SearchByFirstName(String firstname) {
		
		SearchByFirstname.sendKeys(firstname);
		
	}
	
    public void SearchByLastName(String lastname) {
		
		SearchByLasttname.sendKeys(lastname);
		
	}
	
	
	

}
