package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashpage 
{
	
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")WebElement admin;
	 
	 public Dashpage(WebDriver driver) 
	 {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	 public void dashhandle()
	 {
		 admin.click();
	 }
}
