import org.testng.annotations.Test;

import com.amaysim.app.amaysim_app.ui.models.MobileCartPage;

public class MobileCartPageTests {
	
	MobileCartPage mobileCartPage;
	
	public MobileCartPageTests( ) {
		mobileCartPage = new MobileCartPage();
	}

	@Test
	public void TestSevenDayPlan( ) {
		mobileCartPage.NavigateToUrl("https://www.amaysim.com.au/mobile/cart/7-day-10gb");
		
	}
	
}
