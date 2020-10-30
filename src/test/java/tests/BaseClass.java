package tests;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {			
			
		DesiredCapabilities caps = new DesiredCapabilities();

		//caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86_arm");
		//caps.setCapability(MobileCapabilityType.UDID, "3300f6599518944f");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		File file = new File("/Users/dreamcode/eclipse-workspace/AppBienestarSegurosBolivar/src/test/resources/app", "bolivar-conmigo-V001.apk");
		caps.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");	
		
		//driver = new AppiumDriver<MobileElement>(url, caps);
		driver = new AndroidDriver<MobileElement>(url, caps);
		//driver = new IOSDriver<MobileElement>(url, caps);
		
		}catch(Exception exp){
			System.out.println("Fallo porque: "+exp.getCause());
			System.out.println("Mensaje es: "+exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	@Test
	public void sampleTest() {
		System.out.println(" Estoy dentro de la prueba ");
	}
	
	@AfterTest
	public void teardown() {
		
	}

}
