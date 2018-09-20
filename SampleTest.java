import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class SampleTest {
	
	
  Properties configProp = new Properties();
  WebDriver driver;
	
	@Test
  public void f() {
	
		
		System.out.println("From Method 1");
		/* System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

         driver.get(configProp.getProperty("url"));
        //driver.get("http://www.google.co.in");

        driver.findElement(By.name("username")).sendKeys(configProp.getProperty("username"));

         driver.findElement(By.name("password")).sendKeys(configProp.getProperty("password"));

         driver.findElement(By.xpath("//button[text()='Login']")).click();
         System.out.println("URL ::" + configProp.getProperty("url"));

         System.out.println("User name::" +configProp.getProperty("username"));

         	System.out.println("Password::" +configProp.getProperty("password"));
	System.out.println("Title :" + driver.getTitle());
	driver.quit();
		*/
  }
	
@Test
public void method2() {
	
	
	System.out.println("Method 2");
	
}
@Test
public void method6() {
	
	
	System.out.println("Method 26");
	
}

@BeforeClass
public void class1() {
	System.out.println("From Sample Class");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("Before method");
	
}

@AfterMethod
public void afterMethod() {
	System.out.println("After method");
	
}
  @BeforeSuite
  public void beforeSuite() {
	  System.err.println("Running from before suite");
	  ReadConfig readConfig = new ReadConfig();
	  configProp = readConfig.readConfigDetails();
	  
  }

}
