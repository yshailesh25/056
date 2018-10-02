package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class B extends A {

	@Test
	public void testnaukri()
	{
		Set<String> allwindow = driver.getWindowHandles();
		String mainwin="";
		for(String win : allwindow)
		{
			driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl());
			if(driver.getCurrentUrl().equalsIgnoreCase("https://company.naukri.com/popups/virtusa/2282018/index.html"))
			{                                           
				mainwin=win;//win=driver.getWindowHandle()
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		System.out.println(mainwin);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().window(mainwin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='http://w28.naukri.com/advertiser/bms_hits.php?banner=7300234']")).click();
		
		
		String pilot =driver.getCurrentUrl();
		System.out.println(pilot);
		Set<String> s1=driver.getWindowHandles();
		for(String nwin : s1)
		{
			System.out.println(nwin);
			//driver.switchTo().window(nwin);
			//driver.findElement(By.xpath("//strong[text()='APPLY NOW']")).click();
			
		}
	}
	
	}

