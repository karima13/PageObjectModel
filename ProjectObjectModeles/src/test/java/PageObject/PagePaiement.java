package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {
   public  WebDriver driver;
	
	
	//constructeur
	public PagePaiement (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	
	//declaration des elements
	@FindBy(how=How.XPATH , using="//a[normalize-space()='Place Order']")
	WebElement place_Order;
	@FindBy(how=How.XPATH , using="//h2[normalize-space()='Review Your Order']")
	WebElement re_your_order;
	@FindBy(how=How.XPATH , using="//b[normalize-space()='Total Amount']")
	WebElement am_total;
	//creation des methodes
	public void scroler() {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)",re_your_order );	
	}
	public void scroler_encore() {
		 JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)",am_total );	
	}
    public void cliquer_sur_contunier_le_paiement() {
    	place_Order.click();
    	
    }
}

   
