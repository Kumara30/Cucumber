package Task;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newclass
{
static WebDriver driver;
	
	@Given("^I want to open demoguru manager login page$")
	public void i_want_to_open_demoguru_manager_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}

	@Given("^The User logged in manager id and password$")
	public void the_User_logged_in_manager_id_and_password(DataTable credentials) {
		Map<String, String> credentialMap = credentials.asMap(String.class, String.class);
		driver.findElement(By.name("uid")).sendKeys(credentialMap.get("managerUserId"));
		driver.findElement(By.name("password")).sendKeys(credentialMap.get("managerPassword"));
	}
	
	@When("^Enter the login button$")
	public void enter_the_login_button() {
		driver.findElement(By.name("btnLogin")).click();

	}

	@Then("^User should see the home page of manager$")
	public void user_should_see_the_home_page_of_manager() {
//		Assert.assertEquals("http://demo.guru99.com/v4/manager/addcustomerpage.php", driver.getCurrentUrl());
		Assert.assertTrue(driver.getTitle().contains("New Customer Entry Page"));
	}

	@When("^The user navigate the new customer page for NumericValidation$")
	public void the_user_navigate_the_new_customer_page_for_NumericValidation() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user validate the numeric values$")
	public void the_user_validate_the_numeric_values(DataTable customerDetails) {
		List<List<String>> cusDetailsLists = customerDetails.asLists(String.class);
		driver.findElement(By.name("name")).sendKeys(cusDetailsLists.get(1).get(0));
		driver.findElement(By.name("city")).sendKeys(cusDetailsLists.get(1).get(1));
		driver.findElement(By.name("state")).sendKeys(cusDetailsLists.get(1).get(2));
		driver.findElement(By.name("pinno")).sendKeys(cusDetailsLists.get(1).get(3));
		driver.findElement(By.name("emailid")).sendKeys(cusDetailsLists.get(1).get(4));
		
		
	}

	@Then("^User should see the validate numerical information text$")
	public void user_should_see_the_validate_numerical_information_text() {
		Assert.assertEquals("Numbers are not allowed", driver.findElement(By.id("message")).getText());
		Assert.assertTrue(driver.findElement(By.id("message")).getText().contains("Numbers are not"));
		Assert.assertEquals("Numbers are not allowed", driver.findElement(By.id("message4")).getText());
		Assert.assertTrue(driver.findElement(By.id("message4")).getText().contains("Numbers"));
		Assert.assertEquals("Numbers are not allowed", driver.findElement(By.id("message5")).getText());
		Assert.assertTrue(driver.findElement(By.id("message5")).getText().contains("Numbers"));
		Assert.assertEquals("PIN Code must have 6 Digits", driver.findElement(By.id("message6")).getText());
		Assert.assertTrue(driver.findElement(By.id("message6")).getText().contains("PIN Code"));
		Assert.assertEquals("Email-ID is not valid", driver.findElement(By.id("message9")).getText());
		Assert.assertTrue(driver.findElement(By.id("message9")).getText().contains("Email-ID"));
		

	}
	@Then("^Close a browser$")
	public void Close_a_browser() {
       // driver.quit();
	}

	@When("^The user navigate the new customer page for SpecialValidation$")
	public void the_user_navigate_the_new_customer_page_for_SpecialValidation() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user validate the special characters$")
	public void the_user_validate_the_special_characters(DataTable customerDetails1) {
		
		List<List<String>> cusDetailsLists1 = customerDetails1.asLists(String.class);
		driver.findElement(By.name("name")).sendKeys(cusDetailsLists1.get(1).get(0));
		driver.findElement(By.name("addr")).sendKeys(cusDetailsLists1.get(1).get(1));
		driver.findElement(By.name("city")).sendKeys(cusDetailsLists1.get(1).get(2));
		driver.findElement(By.name("state")).sendKeys(cusDetailsLists1.get(1).get(3));
		driver.findElement(By.name("pinno")).sendKeys(cusDetailsLists1.get(1).get(4));
		driver.findElement(By.name("telephoneno")).sendKeys(cusDetailsLists1.get(1).get(5));
		driver.findElement(By.name("emailid")).sendKeys(cusDetailsLists1.get(1).get(6));
		
		
	}
	@Then("^User should see the validate special character information text$")
	public void user_should_see_the_validate_special_character_information_text() {
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message")).getText());
		Assert.assertTrue(driver.findElement(By.id("message")).getText().contains("Special characters are"));
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message3")).getText());
		Assert.assertTrue(driver.findElement(By.id("message3")).getText().contains("Special characters"));
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message4")).getText());
        Assert.assertTrue(driver.findElement(By.id("message4")).getText().contains("Special"));
        Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message5")).getText());
		Assert.assertTrue(driver.findElement(By.id("message5")).getText().contains("allowed"));
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message6")).getText());
		Assert.assertTrue(driver.findElement(By.id("message6")).getText().contains("are not allowed"));
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.id("message7")).getText());
		Assert.assertTrue(driver.findElement(By.id("message7")).getText().contains("are not allowed"));
		Assert.assertEquals("Email-ID is not valid", driver.findElement(By.id("message9")).getText());
		Assert.assertTrue(driver.findElement(By.id("message9")).getText().contains("Email-ID"));
		

	}

	

	@Given("^The user navigate the new customer page$")
	public void the_user_navigate_the_new_customer_page() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@Given("^Click on the Submit button$")
	public void click_on_the_Submit_button() {
		driver.findElement(By.name("sub")).click();
	}

	@Given("^Alert the ok button$")
	public void alert_the_ok_button() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	@When("^Enter the customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_customer_details_and(String custName, String gender, String dob, String address, String city,
			String state, String pinnumber, String mobno, String email, String password) {
		driver.findElement(By.name("name")).sendKeys(custName);
		driver.findElement(By.xpath("//input[@name=\"rad1\" and @value=\"m\"]")).click();
		driver.findElement(By.id("dob")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pinnumber);
		driver.findElement(By.name("telephoneno")).sendKeys(mobno);
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	static String cust;
	
	@When("^User submit the button$")
	public void user_submit_the_button() {
		driver.findElement(By.name("sub")).click();
		WebElement custid = driver.findElement(By.xpath("//table[@id='customer']//tr[4]//td[2]"));
		cust=custid.getText();
		System.out.println("Bank Customer id is :" +cust);
		
	}

	@Then("^User should see the submit successful message$")
	public void user_should_see_the_submit_successful_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='heading3']")).getText().contains("Customer Registered Successfully!!!"));

	}
	//Editing the customer record
	
	@Given("^The user navigate to edit customer page$")
	public void the_user_navigate_to_edit_customer_page() {
	    driver.findElement(By.xpath("(//a[text()='Edit Customer'])")).click();
	}

	@Given("^Enter the customer id$")
	public void enter_the_customer_id() {
	   driver.findElement(By.name("cusid")).sendKeys(cust);
	}

	@When("^Change the address, city, state and pin$")
	public void change_the_address_city_state_and_pin(DataTable addre) 
	{
		List<String> addr = addre.asList(String.class);
		driver.findElement(By.name("addr")).sendKeys(addr.get(0));
		driver.findElement(By.name("city")).sendKeys(addr.get(1));
		driver.findElement(By.name("state")).sendKeys(addr.get(2));
		driver.findElement(By.name("pinno")).sendKeys(addr.get(3));

	}

	@Then("^verify details are submitted or not$")
	public void verify_details_are_submitted_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
	// Deleting the customer record
	
	@Given("^The user navigate to delete customer page$")
	public void the_user_navigate_to_delete_customer_page() {
	    driver.findElement(By.xpath("(//a[text()='Delete Customer'])")).click();
	}

	@When("^Enter customer id$")
	public void enter_customer_id() {
	    driver.findElement(By.name("cusid")).sendKeys(cust);
	}

	@When("^click on submit button$")
	public void click_on_submit_button() {
	    driver.findElement(By.name("AccSubmit")).click();
	    
	}

	@Then("^click ok for conformation$")
	public void click_ok_for_conformation() {
		Alert ac=driver.switchTo().alert();
	    ac.accept();
	    
	}

	@Then("^Verify record is deleted successfully$")
	public void verify_record_is_deleted_successfully() {
		Alert ac = driver.switchTo().alert();
	    
		String str = ac.getText();
		System.out.println(str);
		
		Assert.assertTrue(driver.switchTo().alert(). getText().equals("Customer Deleted successfully"));
	    ac.accept();

}




	

}



