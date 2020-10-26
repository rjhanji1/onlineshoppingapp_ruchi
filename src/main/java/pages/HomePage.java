package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="gh-ac")
	private WebElement searchoptn;
	
	@FindBy (id="gh-btn")
	private WebElement seaechbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void searchProduct(String product)
	{
		searchoptn.sendKeys(product);
		seaechbtn.click();
	}
}