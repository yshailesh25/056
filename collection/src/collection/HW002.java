package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HW002 extends HW001{
	
	@Test
	public void TW() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='_txtUserName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='_txtPassword']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover ']"))).build().perform();
		//driver.findElement(By.xpath("//a[text()='Update']")).click();
		driver.findElement(By.linkText("Update")).click();
		//driver.findElement(By.xpath("//a[@href='manage_customer.php']")).click();
		Set<String> allwin = driver.getWindowHandles();
		
		String mainwin="";
		String mainwin1="";
		for(String win : allwin)
		{
			driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl());
			if(driver.getCurrentUrl().equalsIgnoreCase("http://thetestingworld.com/testings/manage_customer.php"))
			{
				mainwin=win;
				System.out.println(win);
			}
			else if(driver.getCurrentUrl().equalsIgnoreCase("http://thetestingworld.com/testings/dashboard.php"))
			{
				mainwin1=win;
				System.out.println(win);
			}
		}
		driver.switchTo().window(mainwin);
		driver.findElement(By.xpath("//button[text()='Start Download']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.close();
		driver.switchTo().window(mainwin1);
		driver.findElement(By.xpath("//button[text()='View Me']")).click();
		
		
	}

}
