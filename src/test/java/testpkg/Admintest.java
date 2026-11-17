package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Admintest extends Baseclass
{
  @Test(priority = 1)
  public void adminmthd()
  {
	  
	  adminobj.adminhandle();
  }
//  @Test
//public void screen()
// {
//	  adminobj.scrnmthd();
//  }
  @Test(priority = 2)
  public void profilemthd()
  {
	  adminobj.profilehandle();
  }
  
}
