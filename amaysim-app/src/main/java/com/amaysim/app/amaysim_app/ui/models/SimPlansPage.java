package com.amaysim.app.amaysim_app.ui.models;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.amaysim.app.amaysim_app.ui.models.base.BasePage;

public class SimPlansPage extends BasePage {

	public SimPlansPage() {
		NavigateToUrl("https://www.amaysim.com.au/sim-plans");
		wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(60));
	}
}
