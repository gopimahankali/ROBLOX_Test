package ROBLOX_OR_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ROBLOX_CreateANewAccount_Page {
	WebDriver driver;
	public ROBLOX_CreateANewAccount_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//button[@aria-label='Month']/..//select")
	private WebElement monthDropDown;
	@FindBy(xpath = "//button[@aria-label='Day']/..//select")
	private WebElement dayDropDown;
	@FindBy(xpath = "//button[@aria-label='Year']/..//select")
	private WebElement yearDropDown;
	@FindBy(xpath = "//label[text()='Username']/..//div")
	private WebElement usernameTextBox;	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//span[text()='Male']")
	private WebElement genderMale;
	@FindBy(xpath = "//span[text()='Female']")
	private WebElement genderFemale;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement createAccountButton;
	@FindBy(xpath = "//div[contains(@class,\"padding-top-[var(--size-1200)] padding-x-[var(--size-1600)]\")]//button")
	private WebElement signInButton;
	
}
