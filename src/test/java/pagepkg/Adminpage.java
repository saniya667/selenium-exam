package pagepkg;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage
{
  WebDriver driver;
  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")WebElement username;
  
 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")WebElement search;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")WebElement profile;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")WebElement logout;
  
  
public Adminpage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
  public void adminhandle()
  {
	  username.sendKeys("Admin");
	  //empname.sendKeys("arun");
	  search.click();
  }
  public void profilehandle()
  {
	  profile.click();
	  logout.click();
  }
//  public void scrnmthd()
// {
	  // File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //FileHandler.copy(s,new File("./screenshot.new.png"));
//  }
  
  



}
