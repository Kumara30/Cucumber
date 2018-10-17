package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium",Keys.ENTER);
		gotopage("5");
		
	}
	
	public static void gotopage(String pageNum) 
	{
		WebElement parentNum = driver.findElement(By.xpath("//div[@class='compPagination']"));
		
	 	List<WebElement> tabData = parentNum.findElements(By.tagName("a"));
	 	
	 	for(int i=0;i<=tabData.size();i++)
	 	{
	 		if(tabData.get(i).getText().equals(pageNum))
	 		{
	 			tabData.get(i).click();
	 			break;
	 		}
	 		
	 	}
		

	}
	
	
	

}
