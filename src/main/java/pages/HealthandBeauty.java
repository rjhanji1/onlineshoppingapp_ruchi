package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthandBeauty {
	@FindBy(xpath="(//a[text()='Health & Beauty'])[1]")
	private WebElement HandBmousehvr;
	
	
	@FindBy(xpath="//a[text()='Make-Up']")
	private WebElement makeup;
	
	public WebElement HandBmousehvrtab() {
		return HandBmousehvr;
	}
	
	public HealthandBeauty(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void mkup()
	{
		makeup.click();
		
	}
}
