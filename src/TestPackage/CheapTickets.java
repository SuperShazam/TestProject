package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class CheapTickets {
	
	public static void main(String[] args){
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cheapticket.in/b2c/flights");
		System.out.println("Loaded cheaptickets");
		
		//go to sign up
		driver.findElement(By.xpath("//a[@id='signup']")).click();
		System.out.println("Travelled to signup");
		
		//driver.findElement(By.xpath("//input[@class='fluid']")).sendKeys("abc@abc.com");
		
		WebElement email= driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@class='fluid']"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		email.click();
		
		//WebElement email= driver.findElement(By.xpath("//div[@class='content']//form[@id='B2BUserPopup']//div[conatins(class,'ui input fluid  ')]//input[@class='fluid']"));
		//email.click();
		
		
		
		
	}

}
