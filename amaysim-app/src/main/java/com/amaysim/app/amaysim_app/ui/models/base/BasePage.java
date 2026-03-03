package com.amaysim.app.amaysim_app.ui.models.base;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public ChromeDriver chromeDriver = new ChromeDriver();
			
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
