import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppCnn {
	WebDriver driver = null;
	@Before
	public void setUp() throws Exception {
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.cnn.com");
		driver.manage().window().maximize();
	}

	

	@Test
	public void test() {
	driver.findElement(By.id("nav-politics")).click();
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
