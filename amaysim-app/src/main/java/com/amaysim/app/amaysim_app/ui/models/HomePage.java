package com.amaysim.app.amaysim_app.ui.models;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amaysim.app.amaysim_app.ui.models.base.BasePage;

public class HomePage extends BasePage {
	
	WebElement shopAllPlansLink;

	public HomePage() {
		NavigateToUrl("https://www.amaysim.com.au/");
		wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(60));
	}
	
	public void ClickShopAllPlansLink() { 
		shopAllPlansLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.amaysim.com.au/sim-plans']")));
		shopAllPlansLink.click();
	}
	
}
