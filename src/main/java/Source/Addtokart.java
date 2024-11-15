package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtokart 
{
@FindBy(xpath="//span[@class='a-button a-spacing-small a-button-primary a-button-icon']")
WebElement Addtokart;

public void addtokart()
{
	Addtokart.click();
}
public Addtokart(WebDriver driver) 
{
	 PageFactory.initElements(driver, this);
}
}
