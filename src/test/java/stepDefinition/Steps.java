package stepDefinition;

import org.junit.Assert;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AddCustomerPage;
import pageobjects.Loginpage;
import pageobjects.SalesPage;
import pageobjects.SearchCustomerPage;


public class Steps extends BaseClass {
	
	int mail=0;
	int first=0;
	int last=0;
	
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
		lp=new Loginpage(driver);
		cp=new AddCustomerPage(driver);
		sp=new SearchCustomerPage(driver);
		sales= new SalesPage(driver);
	
	}

	@When("open browser with url as {string}")
	public void open_browser_with_url_as(String url) {
		driver.get(url);
		
	}

	@Then("User enters the email as {string} and password as {string}")
	public void user_enters_the_email_as_and_password_as(String email, String password) {
		
		lp.setEmail(email);
		lp.setPassword(password);
	}

	@Then("User click on login")
	public void user_click_on_login() throws InterruptedException {
		lp.clickonLogin();
		Thread.sleep(5000);
		
	}

	@Then("Page should be equal to {string}")
	public void page_should_be_equal_to(String expect) {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();	
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(expect, driver.getTitle());
		}
	}

	@Then("User click on logout")
	public void user_click_on_logout() throws InterruptedException {
		
		lp.clickonLogout();
		Thread.sleep(5000);
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	
	//steps for adding new customer//..............................
	@When("User click on customer menu")
	public void user_click_on_customer_menu() {
	    cp.ClickCustomerMenu();
	}

	@When("User click on customer icon")
	public void user_click_on_customer_icon() {
	   cp.ClickCustomerIcon();
	}

	@Then("User click on Addnew icon")
	public void user_click_on_addnew_icon() {
	   cp.ClickAddNew();
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	    String email = randomemail()+"@gmail.com";
	    cp.setEmail(email);
	    String password = randompassword();
	    cp.setPassword(password);
	    String firstname= randomemail();
	    cp.setFirstName(firstname);
	    String lastname= randomemail();
	    cp.setLastName(lastname);
	    
	   
	    cp.setGender();
	    cp.SetDateofBirth("05/25/1990");
	    cp.SetDateSelect();
	    String company= randomemail()+"technologies pvt ltd";
	    cp.setCompanyName(company) ;
	    cp.setTaxExempt();
	    cp.setNewsLetter(0);
//	    cp.setCustomerRole(3);
        cp.SelectVendor();
	    cp.setAdminContent("please keep these details confidential");
	    
	}

	@When("User click oin save button")
	public void user_click_oin_save_button() {
	    cp.ClickonSave();
	}

	@Then("User can view confirmation message as {string}")
	public void user_can_view_confirmation_message_as(String string) {
	   
	}




	public static void main(String[] args) {
		
		
		

	}
	
	//Sales page related methods
	
	@When("User click on Sales menu")
	public void user_click_on_sales_menu() {
		sales.ClickonSales();
	    
	}

	@When("User click on Orders icon")
	public void user_click_on_orders_icon() throws InterruptedException {
		sales.ClickonOrders();
		Thread.sleep(3000);
	    
	}

	@When("User enter any type of info related to order as {string}")
	public void user_enter_any_type_of_info_related_to_order_as(String string) throws InterruptedException {
		
		
		sales.SetOrderStartDate("03/13/2017");
		sales.SetOrderEndDate("03/13/2020");
		sales.setWereHouse(2);
		sales.setProduct("product");
		sales.setProductStatus("Pending");
		sales.setPaymentStatus("Paid");
		sales.setShippingStatus("Shipped");
		sales.setVendor(1);
		sales.setBillPhoneNumber("8309692633");
		sales.setbillEmail("victoria_victoria@nopCommerce.com");
		sales.setbillLastname("victoria");
		sales.setCountry();
		sales.setPaymentMethod(1);
		Thread.sleep(3000);
		
		
	
	   
	}

	@When("User Directly goto orderinfo as {string}")
	public void user_directly_goto_orderinfo_as(String orderid) {
		//sales.GoDirectOrder("4");
	   
	}

	@When("User click on ordersearch button")
	public void user_click_on_ordersearch_button() {
		sales.clickSearchOrder();
	    
	}

	@Then("User can view order details")
	public void user_can_view_order_details() {
	    
	}
	
	
	// Search page related method
	
	@When("User Serach customer by enter Email as {string}")
	public void user_serach_customer_by_enter_email_as(String email) throws InterruptedException {
		
		sp.SearchByemail("james_pan@nopCommerce.com");
		mail=1;
		
		Thread.sleep(3000);
	    
	}
	
	@When("User Serach customer by enter FirstName as {string}")
	public void user_serach_customer_by_enter_first_name_as(String FirstName) {
		
	    
		sp.SearchByFirstName("Brenda");
		first=1;
	}
	

	@When("User Serach customer by enter LastName as {string}")
	public void user_serach_customer_by_enter_last_name_as(String string) {
	   
		
		sp.SearchByLastName("Holmes");
		last=1;
	}

	@When("User click on Search button")
	public void user_click_on_search_button() {
		sp.clickonSearch();
	    
	}

	@Then("User can view Customer Details as {string}")
	public void user_can_view_customer_details_as(String Custdata) throws InterruptedException {
		Thread.sleep(3000);
		//sp.getNoofRows();
		if(mail==1) {
		boolean status = sp.SearchCustomerByType("james_pan@nopCommerce.com");
		Assert.assertEquals(true, status);
	    
	}
		else if(first==1) {
			boolean status = sp.SearchCustomerByType("Brenda");
			Assert.assertEquals(true, status);
		}
		
		else if(last==1) {
			boolean status = sp.SearchCustomerByType("Holmes");
			Assert.assertEquals(true, status);
		}
		
	
	}
	



}
