package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	WebDriver driver;

	@Before
	public void launchBrowser() {
		// create object and set property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manjusha Jaiswal\\eclipse-workspace\\Session2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// set url
		driver.get("https://objectspy.space/");

		// set maximize
		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();

		// define wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void learnElementLocators() throws InterruptedException {

		driver.findElement(By.name("firstname")).sendKeys("Selenium");

		// Interview question(upload files if there is INPUT tag using send keys then we
		// have to use this otherwise
		// other than Input tag use Robot class)

		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Manjusha Jaiswal\\Downloads\\Reservation.pdf");
		 
		// link text
	//	driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// wait
		// Thread.sleep(6000);

		// navigate back
	// 	driver.navigate().back();//it keeps the browser back to the webpage

		// Partial link Text
	//	 driver.findElement(By.partialLinkText("TF-API Product Backend")).click();

		// CSS selector
		// element identification //operation
		 driver.findElement(By.cssSelector("input#sex-0")).click();
		 driver.findElement(By.cssSelector("input[value='3']")).click();

		// multiple elements
		 driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();

		// Xpath
		// AbsoluteXpath(we do not use at work why because when dev develops raises new
		// elements
		// another attributes it fails
		 driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun");
		 

		// Relative Xpath( we work with relative Xpath)
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium is fun");
		 

		// multiple Relative Xpath

		driver.findElement(By.xpath("//input[@name='tool'and @ value='Selenium Webdriver' and @id ='tool-2']")).click();
		
		
	//	driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
	
	
	
	
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
