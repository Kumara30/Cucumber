package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium",Keys.ENTER);
		
		gotopage("9");
		
	}
	
	public static void gotopage(String pageNum) 
	{
		WebElement pData = driver.findElement(By.xpath("//table[@id='nav']//tr"));
		
		List<WebElement> tData = pData.findElements(By.tagName("td"));
		
		for(int i=0;i<=tData.size();i++)
		{
			if(tData.get(i).getText().equals(pageNum))
			{
				tData.get(i).click();
				break;
				
			}
		}
		
		
	}

}
