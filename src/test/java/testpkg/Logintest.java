package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Logintest extends Baseclass
{
	
	@Test
	public void loghandle()
	{
		loginobj.logmthd();
	}

}
