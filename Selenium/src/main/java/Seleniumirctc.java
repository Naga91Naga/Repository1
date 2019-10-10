import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Seleniumirctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe --verbose --whitelisted-ips=");

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 /* ChromeDriverService service =new ChromeDriverService.Builder().withWhitelistedIps("").withVerbose(true).build();*/
		

	     /*  ChromeOptions chromeOptions = new ChromeOptions();
	       chromeOptions.addArguments("--verbose");
	       chromeOptions.addArguments("--whitelisted-ips=''");*/
		  
		 

		/*  DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
	        desiredCapabilities.setCapability("webdriver.chrome.args", Arrays.asList("--whitelisted-ips=''"));*/

		
		
		
		
		//To launch chromex`

		ChromeDriver driver = new ChromeDriver();

		//To maximize the browser

		driver.manage().window().maximize();

		//To load the url

	driver.get("http://leaftaps.com");

		
		//driver.get("http://leaftaps.com");
		
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--whitelist-ip *");
		chromeOptions.addArguments("--proxy-server='direct://'");
		chromeOptions.addArguments("--proxy-bypass-list=*");
		WebDriver driver1 = new ChromeDriver(chromeOptions);*/
		
	

		
		

	}

}
