package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePanier {
	public  WebDriver driver;
	
	
	//constructeur
	public PagePanier (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	//identification des elements
	@FindBy(how=How.XPATH , using="//a[@class='btn btn-default check_out']")
	WebElement Proceed_To_Checkout;
	
	//creation des methodes
	public void acceder_au_paiement () {
		Proceed_To_Checkout.click();
	}
	
	
	

}
