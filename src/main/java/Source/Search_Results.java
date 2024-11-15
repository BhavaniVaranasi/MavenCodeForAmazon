package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Results 
{
 @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
 WebElement Select_Shoe;
 
 @FindBy(id="add-to-wishlist-button-group")
 WebElement Addingtowishlist;
 
 
 public void selectshoe()
 {
	 Select_Shoe.click();
 }
 public void addingtowishlist() 
 {
	 Addingtowishlist.click();
 }
 
 public Search_Results(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
}
