package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
     @FindBy(id="ap_email")
      WebElement Username_tf;
     
     @FindBy(id="continue")
     WebElement countinue_button;
     
     @FindBy(id="ap_password")
     WebElement paswrd_tf;
     
     @FindBy(id="auth-signin-button")
     WebElement signin_button;
     
     
     
     
     public void un()
     {
    	 Username_tf.sendKeys("bhavanivaranasi91@gmail.com");
      }
     public void con_button()
     {
    	 countinue_button.click();
     }
     public void pwrd() 
     {
    	 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													paswrd_tf.sendKeys("Vb@Jan@2023");
     }
     public void sign() 
     {
    	 signin_button.click();
     }
     
     public Loginpage(WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
     }

}
   