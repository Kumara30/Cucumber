package cucumber1;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginmap 
{
	static WebDriver driver;
	@Given("^Lunch the gurumap website$")
	public void lunch_the_gurumap_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^Enter the username and password in gurumap$")
	public void enter_the_username_and_password_in_gurumap(DataTable detailmap) 
	{
		Map<String, String> detailsmap = detailmap.asMap(String.class, String.class);
		driver.findElement(By.name("uid")).sendKeys(detailsmap.get("username"));
		driver.findElement(By.name("password")).sendKeys(detailsmap.get("password"));
		
	}

	@When("^click on reset button from gurumap$")
	public void click_on_reset_button_from_gurumap() 
	{
		driver.findElement(By.name("btnReset")).click();;
	}

	@Then("^Validate the user credentials from login page$")
	public void validate_the_user_credentials_from_login_page() 
	{
		Assert.assertEquals("", driver.findElement(By.name("uid")).getAttribute("value"));
		Assert.assertEquals("", driver.findElement(By.name("password")).getAttribute("value"));
	}


}
