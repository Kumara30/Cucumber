package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonbook {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement select = driver.findElement(By.id("searchDropdownBox"));
		select.click();
		Select s1 = new Select(select);
		s1.selectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("data catalog",Keys.ENTER);
		
		WebElement title = driver.findElement(By.xpath("(//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal'])[1]"));
		System.out.println(title.getAttribute("title"));
		
		WebElement cover1 = driver.findElement(By.xpath("(//h3[@data-attribute='Paperback'])[1]"));
		System.out.println("Cover Name : "+cover1.getText());
		
		WebElement price1 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-price s-price a-text-bold'])[1]"));
		System.out.println("Rs :"+price1.getText());
		
		WebElement text1 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-secondary'])[5]"));
		
		WebElement save1 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-price'])[1]"));
		System.out.println(text1.getText()+save1.getText());

		
		WebElement cover2 = driver.findElement(By.xpath("(//h3[@data-attribute='Hardcover'])[1]"));
		System.out.println("Cover Name : "+cover2.getText());
		
		WebElement price2 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-price s-price a-text-bold'])[2]"));
		System.out.println("Rs :" +price2.getText());
		
		WebElement text2 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-secondary'])[7]"));
		WebElement save2 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-price'])[2]"));

		System.out.println(text2.getText()+save2.getText());
		
		WebElement text3 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-secondary'])[8]"));
		System.out.println(text3.getText());
		
		WebElement price3 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-price s-price a-text-bold'])[3]"));
		System.out.println("Rs :" +price3.getText());
		
		WebElement text4 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-secondary'])[9]"));
		WebElement covername = driver.findElement(By.xpath("(//a[@class='a-size-small a-link-normal a-text-normal'])[2]"));
		System.out.println(text4.getText()+covername.getText());
		
		WebElement text5 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[1]"));
		System.out.println(text5.getText());
		
	}

}
