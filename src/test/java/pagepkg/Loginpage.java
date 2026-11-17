package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
   WebDriver driver;
   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement user;
   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement pass;
   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement logbtn;
  
    public Loginpage(WebDriver driver)
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
   public void logmthd()
   {
	   user.sendKeys("Admin");
	   pass.sendKeys("admin123");
	   logbtn.click();
   }
  }
