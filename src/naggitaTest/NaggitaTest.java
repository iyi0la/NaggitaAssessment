package naggitaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaggitaTest {
	
static WebDriver driver = null; 
	
	@BeforeTest
	public static void setUpTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	@Test
	
	    public void amazonTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		
		Thread.sleep(3000);
		
		System.out.println("page loads successfully");
		
		driver.findElement(By.id("nav-search-bar-form")).submit();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 5000)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[50]/div/div/div/div/div[2]/div/h2/a/span")).click();
		
		System.out.println("selection verified");
		Thread.sleep(2000);
		 
	
	}
	
	@AfterTest 
	
	public void tearDownTest(){
		driver.close();
		driver.quit();
	}

}
