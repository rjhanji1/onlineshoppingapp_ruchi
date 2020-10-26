package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage {
	@FindBy(xpath="//span[text()='1-2 Years']")
	private WebElement Agelevlsel;
	
	//@FindBy(xpath="(//span[text()='Playsets']")
	//private WebElement Subtypesel;
	
	@FindBy(xpath="(//h3[@class='s-item__title s-item__title--has-tags'])[1]")
	private WebElement Kitchnsetsel;
	
	@FindBy(id="binBtn_btn")
	private WebElement Buynow;
	
	public SelectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectProduct()
	{
		Agelevlsel.click();
		//Subtypesel.click();
		Kitchnsetsel.click();
	}
	
	public void Buyitnow()
	{
		Buynow.click();
		
	}
}
