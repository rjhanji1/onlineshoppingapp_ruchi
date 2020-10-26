package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Utilities;
import pages.HealthandBeauty;
import pages.ShoppingBasket;

public class StartShopping extends BaseTest {
	@Test
	public void test4()
	{
		ShoppingBasket sb=new ShoppingBasket(driver);
		//Utilities.mousehover(driver,hb.HandBmousehvrtab());
		sb.selling();
		
		
		
	}

}


