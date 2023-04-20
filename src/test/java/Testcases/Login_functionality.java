package Testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_functionality {
	WebDriver driver ;
	@Test(priority=1)
	public void verifyLoginFunctionalitywithValidCredentials() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver_win32 (3)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr478593");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("VabUhut");

		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.close();



	}
	@Test(priority=2)
	public void VerifyAfterLoginWelcomeIdIsDisplayed() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr478593");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("VabUhut");

		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr478593')]")).isDisplayed());
		Thread.sleep(300);
		driver.close();
	}

}
