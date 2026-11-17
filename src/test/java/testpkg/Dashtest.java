package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Dashtest extends Baseclass
{
  @Test
  public void dashmthd()
  {
	  dashobj.dashhandle();
  }
}
