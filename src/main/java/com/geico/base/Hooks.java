package com.geico.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.geico.constants.IBrowserConstant;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

	static BaseClass base;

	@BeforeAll
	public static void beforeAll() {
		base = new BaseClass();
		base.conf = new com.geico.utils.ReadConfig();
	}

	@Before
	public void preStep() {
		base.setUpDriver(IBrowserConstant.CHROME);
	}

	@After
	public void tearUp(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] ss = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", "error.png");
		}
		base.tearUp();
	}
}
