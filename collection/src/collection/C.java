package collection;

import java.util.Set;

import org.testng.annotations.Test;

public class C extends B{
	
	@Test(priority=2)
	public void testn2()
	{
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
