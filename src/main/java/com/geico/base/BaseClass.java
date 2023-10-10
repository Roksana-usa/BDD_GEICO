package com.geico.base;

import static com.geico.constants.IBrowserConstant.*;

import java.lang.reflect.Method;
import java.time.Duration;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import com.geico.constants.ConfigConstant;

import com.geico.pages.HomePage;
import com.geico.utils.ReadConfig;
import com.geico.utils.ReadFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;// new chromDriver();
	ReadConfig conf;

	public static HomePage homePage;

	public static WebDriver getDriver() {
		return driver;
	}

	public void setUpDriver(String browserName) {
		driver = initializingBrowser(browserName);
		driver.manage().window().maximize();
		int pageLoadTime = Integer.parseInt(conf.getValue(ConfigConstant.pageLoadTime));
		int implicitWaitTime = Integer.parseInt(conf.getValue(ConfigConstant.impliciteWaitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));
		driver.get(conf.getValue(ConfigConstant.url));
		initPages();
	}

	public WebDriver initializingBrowser(String browserName) {
		switch (browserName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case EDGE:
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			return new SafariDriver();
		default:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
	}

	public void initPages() {
		homePage = new HomePage(driver);
	}

	public void tearUp() {
		driver.quit();
	}

}
