package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass{

	@Test
	public void testOne() throws InterruptedException {
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='android.widget.ToggleButton' and @name='Crear cuenta']")).click();
		//driver.findElement(By.id("com.segurosbolivar.balm/id:loginInMail")).sendKeys("kjosiro@gmail.com");
		//driver.findElement(By.id("com.segurosbolivar.balm/id:loginUser")).click();
		driver.switchTo().activeElement();
		
		driver.findElement(By.xpath("//*[@text='Crear cuenta']")).click();
		
		driver.findElementsByAccessibilityId("loginInMail").clear();
		
		//driver.findElementById("loginInMail").sendKeys("prueba1");
		
		System.out.println("Test 1 completado...");
	}
	
}
