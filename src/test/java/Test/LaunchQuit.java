package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	WebDriver driver;
@BeforeMethod
public void launch()
{
	 driver=new EdgeDriver();
	  driver.get("https://www.Amazon.in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod
public void quit() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
	
}
}
