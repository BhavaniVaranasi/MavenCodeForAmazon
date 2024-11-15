package Test;

import org.testng.annotations.Test;

import Source.Homepage;
import Source.Loginpage;

public class TestCase2 extends LaunchQuit
{
	@Test
	  public void searching() 
	  {
		  Homepage H1=new Homepage(driver);
		  H1.aandlist(driver);
		  H1.sigin_click();
		  Loginpage l1=new Loginpage(driver);
		  l1.un();
		  l1.con_button();
		  l1.pwrd();
		  l1.sign();
		  H1.searching();
		  H1.sign_out();
		 
	  }
}
