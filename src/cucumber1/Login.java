package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	static WebDriver driver;
	
	@Given("^Enter into facebook$")
	public void enter_into_facebook() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^Enter the username and password$")
	public void enter_the_username_and_password() 
	{
		driver.findElement(By.id("email")).sendKeys("Kumar");
		 driver.findElement(By.id("pass")).sendKeys("ashok");
			
	}

	@When("^Click on submit button$")
	public void click_on_submit_button()
	{
		driver.findElement(By.xpath("(//input[@value=\"Log In\"])")).click();;
	}

	@Then("^Entered details is correct or not$")
	public void entered_details_is_correct_or_not() 
	{
		Assert.assertEquals("Kumar",driver.findElement(By.id("email")).getAttribute("value"));
		Assert.assertEquals("",driver.findElement(By.id("pass")).getAttribute("value"));

	}


}
