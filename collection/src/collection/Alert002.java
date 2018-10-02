package collection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alert002 extends Alert001{
	
	@Test
	public void testdemoguru() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("shailesh");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
	}

}
