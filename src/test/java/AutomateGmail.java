import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateGmail {public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "D://Workspace//TestGmail//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void startupScreen() {
	

		WebElement element = driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
		element.sendKeys("Gmail");

		element.sendKeys(Keys.ENTER);

		driver.findElement(By.linkText("Gmail - Google")).click();
		driver.findElement(By.id("Email")).sendKeys("itichausali");
		driver.findElement(By.id("next")).click();
		WebElement password = driver.findElement(By.id("Passwd"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(password)).isDisplayed();
		driver.findElement(By.id("Passwd")).sendKeys("###messup");
		driver.findElement(By.id("signIn")).sendKeys(Keys.ENTER);

	}

	@Test
	public void composeMail() {
			driver.findElement(By.linkText("COMPOSE")).click();
		
	}
}
