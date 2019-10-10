
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Sel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--whitelist-ip %*
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--verbose");
	    chromeOptions.addArguments("--whitelisted-ip %*");
	    chromeOptions.addArguments("--proxy-server=93.180.7.246:8080");

	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.facebook.com");*/
		
		  /* System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		    ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--verbose");
		    chromeOptions.addArguments("--whitelisted-ips=''");
		    chromeOptions.addArguments("--proxy-server=93.180.7.246:8080");

		    WebDriver driver = new ChromeDriver(chromeOptions);
		    driver.get("http://www.whoishostingthis.com/tools/user-agent/");*/
		    
		    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		    capabilities.setCapability("network.proxy.http", "93.180.7.246");
		    capabilities.setCapability("network.proxy.http_port", "8080");
		    ChromeDriverService service =
		        new ChromeDriverService.Builder().withWhitelistedIps("").withVerbose(true).build();
		    WebDriver driver = new ChromeDriver(service, capabilities);
		    driver.get("http://www.whoishostingthis.com/tools/user-agent/");
		
		/*System.setProperty("webdriver.chrome.driver", "./dumnew/chromedriver.exe"  );//use your path
        try{
        	ChromeDriver driver = new ChromeDriver();
        }
        catch (Exception e) {
            System.out.println(e);
        }*/

		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To launch chrome

		//ChromeDriver driver = new ChromeDriver();

		//To maximize the browser

		//driver.manage().window().maximize();

		//To load the url

		//driver.get("http://leaftaps.com");

		
		//driver.get("http://leaftaps.com");
		
		
	
		
	}

}
