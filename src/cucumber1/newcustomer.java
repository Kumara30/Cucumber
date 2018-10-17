package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newcustomer 
{
	static WebDriver driver;
	
	@Given("^The user is in guru home page$")
	public void the_user_is_in_guru_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}

	@Given("^The user logged in as manager with \"([^\"]*)\"and \"([^\"]*)\"$")
	public void the_user_logged_in_as_manager_with_and(String mngrid, String mngrpass) {
		driver.findElement(By.name("uid")).sendKeys(mngrid);
		driver.findElement(By.name("password")).sendKeys(mngrpass);
		driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigate to New customer account$")
	public void the_user_navigate_to_New_customer_account() {
	    driver.findElement(By.xpath("(//a[text()='New Customer'])")).click();
	}

	@When("^The user should enter the customer details with\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
	public void the_user_should_enter_the_customer_details_with_and(String Custid, String gen, String dob, String Address, String City, String State, String Pin, String Phone, String Email, String Pass) 
	{
	    
	    driver.findElement(By.name("name")).sendKeys(Custid);
	    driver.findElement(By.xpath("(//input[@value='m'])")).click();
	    driver.findElement(By.name("addr")).sendKeys(Address);
	    driver.findElement(By.name("city")).sendKeys(City);
	    driver.findElement(By.name("state")).sendKeys(State);
	    driver.findElement(By.name("pinno")).sendKeys(Pin);
	    driver.findElement(By.name("telephoneno")).sendKeys(Phone);
	    driver.findElement(By.name("emailid")).sendKeys(Email);
	    driver.findElement(By.name("password")).sendKeys(Pass);
	}

	@When("^The user should reset the customer details$")
	public void the_user_should_reset_the_customer_details() {
	    driver.findElement(By.name("res")).click();;
	}

	@Then("^Manager should verify the add new customer message$")
	public void manager_should_verify_the_add_new_customer_message() {
		
		String out = driver.getCurrentUrl();
		
	    Assert.assertEquals("http://demo.guru99.com/v4/manager/addcustomerpage.php",out);
	    
	}


}
