package com.amaysim.app.amaysim_app.ui.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amaysim.app.amaysim_app.ui.models.base.BasePage;

public class HomePage extends BasePage {
	
	ChromeDriver chromeDriver = new ChromeDriver();
	WebElement shopAllPlansLink = chromeDriver.findElement(By.xpath("//a[@label='Shop all plans']"));

	@Override
	public void NavigateToUrl() {
		chromeDriver.navigate().to("https://www.amaysim.com.au/sim-plans");
	}
	
	public void ClickShopAllPlansLink() {
		shopAllPlansLink.click();
	}
}
