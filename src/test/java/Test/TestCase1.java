package Test;


import org.testng.annotations.Test;

import Source.Homepage;
import Source.Loginpage;

public class TestCase1 extends LaunchQuit
{
  @Test
  public void LogintoAmazon() 
  {
	  Homepage H1=new Homepage(driver);
	  H1.aandlist(driver);
	  H1.sigin_click();
	  Loginpage l1=new Loginpage(driver);
	  l1.un();
	  l1.con_button();
	  l1.pwrd();
	  l1.sign();
	  
	 
  }
}
