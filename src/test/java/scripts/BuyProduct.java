package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.HomePage;
import pages.SelectionPage;


public class BuyProduct extends BaseTest {
	@Test
	public void test1()
	{
		HomePage h=new HomePage(driver);
		h.searchProduct(Propertyfile.getpropertyfiledata("productname"));
		SelectionPage s = new SelectionPage(driver);
		
		s.selectProduct();
		s.Buyitnow();
		
		
		
	}

}
