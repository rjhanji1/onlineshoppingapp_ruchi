package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
//import generlib.Utilities;
import pages.ExploreMakeup;
import pages.HealthandBeauty;

public class BuyMakeup extends BaseTest {
	@Test
	public void test3()
	{
		HealthandBeauty hb=new HealthandBeauty(driver);
		Utilities.mousehover(driver,hb.HandBmousehvrtab());
		hb.mkup();
		ExploreMakeup em=new ExploreMakeup(driver);
		Utilities.mousehover(driver,em.sortarrowmousehvr());
		//Utilities.dropdown(em.sortarrowmousehvr(),Propertyfile.getpropertyfiledata("sort"));
		em.selectproduct();;
		
		
		
		
	}

}


