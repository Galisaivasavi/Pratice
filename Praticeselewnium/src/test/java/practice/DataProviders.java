package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@DataProvider
	public String[][] dataSender(){
	String [][] data={{"vasavi@gmail.com","vasavi123"},{"vasvi@gmail.com","vasvi123"},{"vasavigjs@@gmail.com","vasavi@123"}};
	return data;
}
	@Test(dataProvider="dataSender")
	public void login(String[]credentials)

	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		//Valid Email
		driver.findElement(By.name("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("password")).sendKeys(credentials[1]);
		driver.close();

}
}