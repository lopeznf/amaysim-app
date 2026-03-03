package com.amaysim.app.amaysim_app.ui.models.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public ChromeDriver chromeDriver = new ChromeDriver();
	public WebDriverWait wait;
			
	public void NavigateToUrl(String url) {
		chromeDriver.navigate().to(url);
	}

	public void CloseTab() {
		chromeDriver.close();
	}
	
	public void CloseBrowser() {
		chromeDriver.quit();
	}
}
