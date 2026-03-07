package ROBLOX_WebDriver_Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ROBLOX_WebDriver_Class {
	public void selectOptions(WebElement element, WebDriver driver, String value) {
      Select select = new Select(element);
      select.selectByValue(value);
	}
	public void getUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implicitWait(WebDriver driver , int seconds ) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public void explicitWait(WebDriver driver, int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
