package assignment.scripts;

import java.lang.module.FindException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecifiedAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/heenananwani/eclipse-workspace/SeleniumFirst/BrowserDriver/chromedriver");  
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/login");
		 WebElement username = driver.findElement(By.cssSelector("input[id='username']"));
		 username.sendKeys("tomsmith");
		 //SuperSecretPassword!
		 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		 password.sendKeys("SuperSecretPassword!");
		 driver.findElement(By.xpath("//button[@class='radius']")).click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.quit();
		 
	}
}
