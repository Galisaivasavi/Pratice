package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross2 {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void login(@Optional("chrome") String BrowserName) {
		 
		
		if (BrowserName.equalsIgnoreCase("chrome")) 
		{
            driver = new ChromeDriver();
        }
		else if (BrowserName.equalsIgnoreCase("firefox")) 
        {
            driver = new FirefoxDriver();
        } 
        else if (BrowserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }


	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("vasavigjks@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vasavi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(true, false);
		
	}

	
		
	}


