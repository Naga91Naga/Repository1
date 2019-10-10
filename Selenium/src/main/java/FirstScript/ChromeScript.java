package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeScript {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("test");
		
		

		System.setProperty("webdriver.chrome.driver",
	            "C:\\Selenium\\Selenium\\drivers1\\chromedriver.exe");
		
		System.out.println("test");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("test");
		
		driver.get("https://delivery.manageteamz.com/dashboard/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Naga");
		driver.findElement(By.id("last-name")).sendKeys("Arjun");
		driver.findElement(By.id("email")).sendKeys("ar@testte.com");
		driver.findElement(By.id("phone")).sendKeys("1111122222");
		driver.findElement(By.id("signup-button")).click();
		
		
	}

}
