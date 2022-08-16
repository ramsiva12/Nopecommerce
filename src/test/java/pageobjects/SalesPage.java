package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;


public class SalesPage {
	public WebDriver ldriver;
	
	
	
	public SalesPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	//Locators on Element page
	@FindBy(how=How.XPATH,using="//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/p[1]")
	WebElement Saleslink;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Orders')]")
	WebElement Orderspage;
	
	
	@FindBy(how=How.ID,using="StartDate")
	WebElement Salestartdate;
	
	@FindBy(how=How.ID,using="EndDate")
	WebElement Saleendate;
	
	@FindBy(how=How.XPATH,using="//select[@id='WarehouseId']")
	WebElement Saleswarehouse;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-product-name']")
	WebElement Salesproduct;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]")
	WebElement orderlist;
	
	@FindBy(how=How.XPATH,using="//ul[@id='OrderStatusIds_listbox']//li")
	List<WebElement> orderlistele;
	
	
	@FindBy(how=How.XPATH,using="//ul[@id='PaymentStatusIds_listbox']//li")
	List<WebElement> Salepaymentlist;
	
	@FindBy(how=How.XPATH,using="//ul[@id='PaymentStatusIds_taglist']")
	List<WebElement> paymentunordlist;
	
	@FindBy(how=How.XPATH,using="//select[@id='PaymentStatusIds']")
	WebElement paymentselect;
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]")
	WebElement Salepaymentstatus;
	
	
	@FindBy(how=How.XPATH,using="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]")
	WebElement Saleshippingstatus;
	
	@FindBy(how=How.XPATH,using="//ul[@id='ShippingStatusIds_listbox']//li")
	List<WebElement> Saleshippinglist;
	
	@FindBy(how=How.XPATH,using="//select[@id='VendorId']")
	WebElement Salevendor;
	
	@FindBy(how=How.XPATH,using="//input[@id='BillingPhone']")
	WebElement billingphonenumber;
	
	@FindBy(how=How.XPATH,using="//input[@id='BillingEmail']")
	WebElement billingemail;
	
	@FindBy(how=How.XPATH,using="//input[@id='BillingLastName']")
	WebElement billlastname;
	
	@FindBy(how=How.XPATH,using="//select[@id='BillingCountryId']")
	WebElement Billingcountry;
	
	@FindBy(how=How.XPATH,using="//select[@id='PaymentMethodSystemName']")
	WebElement Paymentmethod;
	
	@FindBy(how=How.ID,using="OrderNotes")
	WebElement Saleordernotes;
	
	@FindBy(how=How.ID,using="GoDirectlyToCustomOrderNumber")
	WebElement godirectlycustorder;
	
	@FindBy(how=How.ID,using="go-to-order-by-number")
	WebElement gotoorderbynum;
	
	@FindBy(how=How.XPATH,using="//button[@id='search-orders']")
	WebElement Searchorders;
	
	@FindBy(how=How.XPATH,using="//table[@id='orders-grid']")
	WebElement ordertable;
	
	@FindBy(how=How.XPATH,using="//table[@id='orders-grid']//tr")
	WebElement ordertablerow;
	
	@FindBy(how=How.XPATH,using="//table[@id='orders-grid']//tr//td")
	WebElement ordertablecolumn;
	
	
	// Sales page object methods
	
	public void ClickonSales() {
		Saleslink.click();
		
		
		
	}
	
	public void ClickonOrders() {
		
		Orderspage.click();
	
	}
	public void SetOrderStartDate(String startdate) {
		
		Salestartdate.sendKeys(startdate);
		
	}
	
    public void SetOrderEndDate(String enddate) {
		
    	Saleendate.sendKeys(enddate);
		
	}
    
    public void setWereHouse(int index) {
    	
    	Select select = new Select(Saleswarehouse);
    	select.selectByIndex(index);
    }
    
    public void setProduct(String product) {
    	Salesproduct.sendKeys(product);
    }
	
    public void setProductStatus(String status) throws InterruptedException {
    	
    	
       // System.out.println(listele.get(1).getText());	
    	//ldriver.findElement(By.xpath("//li[contains(text())]")).click();
//    	Select select = new Select(Salesproductstatus);
//    	List values = select.getOptions();
//    	System.out.println(values.size());
//    	
//    	select.selectByVisibleText("Pending");
//    	
//    	
        orderlist.click();
    	
    	for(int i=0;i<=orderlistele.size()-1;i++) {
    		if(orderlistele.get(i).getText().contains(status)) {
    			orderlistele.get(i).click();
    			Thread.sleep(3000);
    			
    		}
    		
    	}
//    	Actions keyDown = new Actions(ldriver);
//    	
//    	keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN));

    	}
    
    
    public void setPaymentStatus(String paymentstatus) throws InterruptedException {
    	Salepaymentstatus.click();
    	Thread.sleep(5000);
    	System.out.println(Salepaymentlist.size());
    	for(int i=0;i<=Salepaymentlist.size()-1;i++) {
    		System.out.println(Salepaymentlist.get(i).getText());
    		if(Salepaymentlist.get(i).getText().contains(paymentstatus)) {
    			
    			Salepaymentlist.get(i).click();
    			
    	        
    }
    	}
//    	Select select = new Select(paymentselect);
//    	select.selectByIndex(3);
    }
    
    public void setShippingStatus(String Shippingstatus) throws InterruptedException {
    	Saleshippingstatus.click();
    	Thread.sleep(5000);
    	for(int i=0;i<=Saleshippinglist.size()-1;i++) {
    		System.out.println(Saleshippinglist.get(i).getText());
    		if(Saleshippinglist.get(i).getText().contains(Shippingstatus)) {
    			
    			Saleshippinglist.get(i).click();
    			
    	        
    }
    	}
    }
    
    public void setVendor(int Vendortype) {
    	Select select =new Select(Salevendor);
    	select.selectByIndex(Vendortype);
    }
	
    public void setBillPhoneNumber(String phone) {
    	billingphonenumber.sendKeys(phone);
    	
    }
    
    public void setbillEmail(String email) {
    	billingemail.sendKeys(email);
    	
    }
    
    public void setbillLastname(String lastname) {
    	billlastname.sendKeys(lastname);
    	
    }
    
    public void setCountry() {
    	Select select = new Select(Billingcountry);
    	select.selectByVisibleText("India");
    	
    }
    
    public void setPaymentMethod(int methodtype) {
    	Select select = new Select(Paymentmethod);
    	select.selectByIndex(methodtype);
    	
    }
    
    public void GoDirectOrder(String orderid) {
    	
    	godirectlycustorder.sendKeys(orderid);
    	gotoorderbynum.click();
    	
    	
    }
    
    public void clickSearchOrder() {
    	Searchorders.click();
    	
    }




}
