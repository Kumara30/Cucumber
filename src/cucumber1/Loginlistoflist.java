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

public class Loginlistoflist
{
	static WebDriver driver;
	@Given("^Lunch the guru listoflist website$")
	public void lunch_the_guru_listoflist_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Testing\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	
	}

	@When("^Enter the username and password in guru listoflist$")
	public void enter_the_username_and_password_in_guru_listoflist(DataTable list2) 
	{
		List<List<String>> list = list2.asLists(String.class);
		driver.findElement(By.name("uid")).sendKeys(list.get(2).get(0));
		driver.findElement(By.name("password")).sendKeys(list.get(2).get(1));
		
	}

	@When("^click on reset button from guru listoflist$")
	public void click_on_reset_button_from_guru_listoflist() {
		driver.findElement(By.name("btnReset")).click();;

	}

	@Then("^Validate the user credentials from login pag$")
	public void validate_the_user_credentials_from_login_pag() {
		Assert.assertEquals("", driver.findElement(By.name("uid")).getAttribute("value"));
		Assert.assertEquals("", driver.findElement(By.name("password")).getAttribute("value"));
	}


}
