import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateGmail {
	
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.co.in/");
	}
	@Test
	public void startupScreen() {
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("Gmail");
		
	}
}
