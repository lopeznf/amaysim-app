import com.amaysim.app.amaysim_app.ui.models.HomePage;
import org.testng.annotations.*;

public class HomePageTests {
	
	HomePage homePage;	
	
	public HomePageTests() {
		homePage = new HomePage();		
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1 here");
		
		homePage.ClickShopAllPlansLink();
	}
	
	@AfterTest
	public void TestTearDown() {
		homePage.CloseBrowser();
	}
}
