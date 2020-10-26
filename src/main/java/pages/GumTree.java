package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GumTree {
	@FindBy(xpath="//a[text()='Gumtree']")
	private WebElement gmtree;
	
	
	@FindBy(xpath="//strong[text()='Jobs']")
	private WebElement jobs;
	
	
	
	public GumTree(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void gmtre()
	{
		gmtree.click();
		jobs.click();
		
	}
}
