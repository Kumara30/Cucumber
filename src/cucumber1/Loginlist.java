package cucumber1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginlist 
{
	static WebDriver driver;

	@Given("^Lunch the guru website$")
	public void lunch_the_guru_website()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^Enter the username and password in guru$")
	public void enter_the_username_and_password_in_guru(DataTable details)
	{
		List<String> detaillist = details.asList(String.class);
		driver.findElement(By.name("uid")).sendKeys(detaillist.get(0));
		driver.findElement(By.name("password")).sendKeys(detaillist.get(1));
		
	}

	@When("^click on reset button$")
	public void click_on_reset_button() {
		driver.findElement(By.name("btnReset")).click();;

	}

	@Then("^Validate the user credentials$")
	public void validate_the_user_credentials()
	{
		Assert.assertEquals("", driver.findElement(By.name("uid")).getAttribute("value"));
		Assert.assertEquals("", driver.findElement(By.name("password")).getAttribute("value"));
	}


}
