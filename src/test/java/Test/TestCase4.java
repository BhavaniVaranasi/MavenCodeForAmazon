package Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import Source.Addtokart;
import Source.Homepage;
import Source.Loginpage;
import Source.Search_Results;

public class TestCase4 extends LaunchQuit 
{
	@Test
	  public void wishlist() 
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
		  Search_Results s1=new Search_Results(driver);
		  s1.selectshoe();
		  Set<String> s2=driver.getWindowHandles();
			Iterator<String> i1=s2.iterator();
			
			String pid=i1.next();
			String cid=i1.next();
			
			System.out.println(pid);
			System.out.println(cid);
			driver.switchTo().window(cid);
			Search_Results Ser=new Search_Results(driver);
			Ser.addingtowishlist();
			//driver.switchTo().window(pid);
			Addtokart add=new Addtokart(driver);
			add.addtokart();
		      H1.sign_out();
		 
	  }
}
