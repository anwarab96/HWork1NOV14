import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppYahoo1 {

	WebDriver driver= null;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.yahoo.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
		//driver.findElement(By.id("nav-news")).click();
		
		driver.findElement(By.id("nav-stock")).click();
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	

}
