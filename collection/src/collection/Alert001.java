package collection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Alert001 {
	
	ChromeDriver driver;
	@BeforeMethod
	public void startbro()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@AfterMethod
	public void closebro()
	{
		//driver.quit();
	}
}
