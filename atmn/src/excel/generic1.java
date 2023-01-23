package excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic1 
{ WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	driver = new FirefoxDriver();

}
@AfterMethod
public void closeapp() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close(); 
}
}
