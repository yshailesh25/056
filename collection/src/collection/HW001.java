package collection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HW001 {
	ChromeDriver driver;
	@BeforeMethod
	public void startbo()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://thetestingworld.com/testings/register.php");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebro()
	{
		//driver.quit();
	}

}
