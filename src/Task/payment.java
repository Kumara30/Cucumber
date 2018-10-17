package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class payment
{
	WebDriver driver;
	
	@Given("^Logged the demogure$")
	public void logged_the_demogure(DataTable Credentails) {
		System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/v4/");
	    List<String> login = Credentails.asList(String.class);
		driver.findElement(By.name("uid")).sendKeys(login.get(0));
		driver.findElement(By.name("password")).sendKeys(login.get(1));

	}

	@Given("^Click on payment gateway project$")
	public void click_on_payment_gateway_project() {
	    driver.findElement(By.xpath("//a[text()='Payment Gateway Project']")).click();
	}

	static String cardnumer;
	static String ExpiryDate;
	static String Expirymonth;
	static String CVV;
	
	@Given("^Click on generate card number$")
	public void click_on_generate_card_number() {
	    driver.findElement(By.xpath("(//a[text()='Generate Card Number'])[1]")).click();
	    WebElement cardno = driver.findElement(By.xpath("(//div[@class='inner'])[2]//h4[1]"));
	    String card = cardno.getText();
	    System.out.println("Length of the card : "+card.length());
	  
		String a = card.replaceAll("[^0-9]", "");
	  
		System.out.println(a);
	  
//	  String[] strcard = cardno.split(" ");
//	  
//	  for(int i=0;i<strcard.length;i++)
//	  {
//		  System.out.println(strcard[i]);
//	  }
//	  //System.out.println("Your Card no is : " +strcard[0]);
		
		  WebElement Expdate = driver.findElement(By.xpath("(//div[@class='inner'])[2]//h4[2]"));
		  String expda = Expdate.getText();
		  String exp = expda.replaceAll("[^0-9]", "");
		  System.out.println(exp);

		
		
		driver.findElement(By.xpath("(//a[text()='Cart'])[1]")).click();
		WebElement quantitys = driver.findElement(By.name("quantity"));
		quantitys.click();
		Select s = new Select(quantitys);
	    s.selectByVisibleText("5");
	    
	    driver.findElement(By.xpath("(//input[@class='button special'])")).click();
	    
	    driver.findElement(By.xpath("(//input[@name='card_nmuber'])")).sendKeys(cardnumer);
	    
	    WebElement date = driver.findElement(By.xpath("(//select[@name='month'])"));
	    date.click();
	    Select s1 = new Select(date);
	    s1.selectByVisibleText(ExpiryDate);
			  
	    WebElement month = driver.findElement(By.xpath("(//select[@name='year'])"));
	    month.click();
	    Select s2 = new Select(month);
	    s2.selectByVisibleText(Expirymonth);
		 
	    
	    driver.findElement(By.name("cvv_code")).sendKeys(CVV);
	   
	    driver.findElement(By.name("submit")).click();
	    
	    
	}


}
