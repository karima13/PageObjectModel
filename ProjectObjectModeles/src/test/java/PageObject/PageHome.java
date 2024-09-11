package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageHome {
	public WebDriver driver;
	
	//constructeur
	
	public PageHome (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//identification des elements
	@FindBy(how =How.XPATH , using ="//p[@class='fc-button-label']")
	WebElement accepter_cookies;
	@FindBy(how =How.XPATH , using ="//i[@class='fa fa-lock']")
	WebElement bt_signup_login;
	@FindBy(how =How.XPATH , using ="//ul[@class='nav navbar-nav']//li//a//b)")
	WebElement txt_profil;
	@FindBy(how=How.XPATH , using="//a[@data-product-id='1']")
	WebElement bt_addtocart1;
	@FindBy (how=How.XPATH , using="//button[text()='Continue Shopping']")
	WebElement bt_contshopping ;
	@FindBy(how=How.XPATH , using="//a[@data-product-id='2']")
	WebElement bt_addtocart2;
    @FindBy(how=How.XPATH , using="//u[text()='View Cart']")
	WebElement bt_view_cart;
    @FindBy(how=How.XPATH , using="//h2[normalize-space()='Features Items']")
    WebElement recher;
	//creation des methodes
	public void demarer_URL(String txt) {
		driver.get(txt);
	}
	public void cliquer_sur_autorisation_cookies() {
		accepter_cookies.click();
	}
	public void cliquer_sur_le_bouton_login() {
	bt_signup_login.click();
	}
	public String profil_obtenu() {
		String txt_profil_obtenu = txt_profil.getText();
		return txt_profil_obtenu;
	}
	
	public void scroler_dans_la_page() {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",recher );	
	}
	
    public void cliquer_sur_buton_ajouter_au_panier() {
    	bt_addtocart1.click();
    }
    public void cliquer_sur_bt_continier_shooping() {
    	bt_contshopping.click();
    }
    public void cliquer_sur_ajouter_article2_au_panier() {
    	bt_addtocart2.click();
    }
    public void cliquer_sur_bt_vieux_cart() {
    	bt_view_cart.click();
    }
    public void cliquer_sur_bt_vieux_ct() {
    	bt_view_cart.click();
    }
}
