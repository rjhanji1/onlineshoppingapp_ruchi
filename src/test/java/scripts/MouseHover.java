package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
import pages.HealthandBeauty;
import pages.HomePage;
import pages.SelectionPage;



	public class MouseHover extends BaseTest {
		@Test
		public void test2()
		{
			HealthandBeauty hb=new HealthandBeauty(driver);
			Utilities.mousehover(driver,hb.HandBmousehvrtab());
			hb.mkup();
			
			
			
		}

	}


