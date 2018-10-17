package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoguru99 
{
	static WebDriver driver;
	
	@Given("^Enter into demoguru$")
	public void enter_into_demoguru() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@When("^Enter the username and password in demoguru$")
	public void enter_the_username_and_password() 
	{
		driver.findElement(By.name("uid")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("pass");
			
	}


	@When("^Click on reset button$")
	public void click_on_reset_button() {
		driver.findElement(By.name("btnReset")).click();;
	}

	@Then("^Entered details is empty then validate$")
	public void entered_details_is_empty_then_validate() {
		Assert.assertEquals("", driver.findElement(By.name("uid")).getAttribute("value"));
		Assert.assertEquals("", driver.findElement(By.name("password")).getAttribute("value"));
	}



}
