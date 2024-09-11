package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSingUp {
	public WebDriver driver;
	
	//constructeur
	
	public PageSingUp (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//identification des elements
	@FindBy(how =How.XPATH , using = "//input[@data-qa='login-email']")
	WebElement txt_email;
	@FindBy(how =How.XPATH , using = "//input[@placeholder='Password']")
	WebElement txt_MDP;
	@FindBy(how =How.XPATH , using = "//button[normalize-space()='Login']")
	WebElement bt_login;
	
	//creation des methodes
	public void ecrir_dans_lechamp_mail(String txt) {
		txt_email.sendKeys(txt);
		 	
	}
	public void ecrir_dans_lechamp_password (String txt) {
		txt_MDP.sendKeys(txt);
	}
	public void cliquer_sur_bt_login () {
		bt_login.click();
	}

}
