package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFinaliserPaiemenet {
	 public  WebDriver driver;
		
		
		//constructeur
		public  PageFinaliserPaiemenet (WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			}
		//declaration des elements
		
		@FindBy(how=How.XPATH , using ="//input[@name='name_on_card']")
		WebElement nama_on_cart;
		@FindBy(how=How.XPATH , using ="//input[@name='card_number']")
		WebElement cart_number;
		@FindBy(how=How.XPATH , using ="//input[@placeholder='ex. 311']")
		WebElement cvc;
		@FindBy(how=How.XPATH , using ="//input[@placeholder='MM']")
		WebElement expiration;
		@FindBy(how=How.XPATH , using ="//input[@placeholder='YYYY']")
		WebElement annee_expiration;
		@FindBy(how=How.XPATH , using ="//button[@id='submit']")
		WebElement confirm_order;
		@FindBy(how=How.XPATH ,using="//label[normalize-space()='Expiration']")
		WebElement expirat; 
		//creation des methodes
	   public void ecrir_dans_le_champ_name_cart(String txt) {
		   nama_on_cart.sendKeys(txt);
	   }
		
	   public void ecrir_dans_le_numero_cart(String txt) {
		   cart_number.sendKeys(txt);
	   }
	   public void ecrir_cvc(String txt) {
		   cvc.sendKeys(txt);
	   }
	   public void ecrir_mois_exepiration(String txt) {
		   expiration.sendKeys(txt);
	   }
	   public void ecrir_annee_expiration(String txt) {
		   annee_expiration.sendKeys(txt);
	   }
	   public void scroler_pay() {
		   JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)",expirat );	
	   }
	   public void cliquer_sur_confirmation_paiemner() {
		   confirm_order.click();
	   }
	
}
