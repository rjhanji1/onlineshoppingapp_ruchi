package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBasket {
	@FindBy(xpath="(//a[@class='gh-p'])[4]")
	private WebElement sell;
	
	
	@FindBy(xpath="//a[text()='COVID-19 update']")
	private WebElement covid;
	
	
	
	public ShoppingBasket(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void selling()
	{
		sell.click();
		covid.click();
		
	}
}
