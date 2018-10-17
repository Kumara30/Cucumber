package Task;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazoniphone {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='iphone']")).click();
		
		WebElement sorting = driver.findElement(By.xpath("//select[@class='a-spacing-top-mini']"));
		Select s1 = new Select(sorting);
		s1.selectByVisibleText("Price: Low to High");
		
		List<WebElement> iphones = driver.findElements(By.xpath("(//ul[@id='s-results-list-atf'])//li"));
		Random r = new Random();
		
		WebElement selectiphone = iphones.get(r.nextInt(iphones.size()));
		//Select s2 = new Select(selectiphone);
		System.out.println(selectiphone);
		
		
		
		
		
		
		
	}

}
