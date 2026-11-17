package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Adminpage;
import pagepkg.Dashpage;
import pagepkg.Loginpage;

public class Baseclass 
{
  public static WebDriver driver;
  public Loginpage loginobj;
  public Dashpage   dashobj;
  public Adminpage adminobj;
  
  @BeforeTest
  public void setup()
  {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  @BeforeMethod
  public void objectmthd()
  {
	  loginobj =  new Loginpage(driver);
	  dashobj  =  new Dashpage(driver);
	  adminobj = new Adminpage(driver);
  }
}
