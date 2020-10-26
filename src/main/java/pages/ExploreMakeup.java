package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreMakeup {
	@FindBy(xpath="(//div[@class='srp-controls__control--legacy'])[1]")
	private WebElement sortarrow;
	
	@FindBy(xpath="(//li[@class='btn'])[3]")
	private WebElement lowestprice;
	
@FindBy(xpath="//h3[text()='No7 Airbrush Away Primer NEW Boots Number No 7 10ml travel size hypo-allergenic']")
private WebElement prdimage;

public WebElement sortarrowmousehvr() {
	return sortarrow;
}

//public WebElement lowestpriceSort() {
	 // return lowestprice;
	 //}

public ExploreMakeup(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void selectproduct()
{
	lowestprice.click();
	prdimage.click();
}


}
