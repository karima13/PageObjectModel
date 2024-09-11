package SetepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Hooks.SetUp;
import PageObject.PageHome;
import PageObject.PagePanier;
import io.cucumber.java.en.*;

public class Shopping {
	WebDriver driver =SetUp.driver;
	PageHome home =new PageHome(driver);
	PagePanier panier =new PagePanier(driver);
	@Given("scroler dans la page")
	public void scroler_dans_la_page() {
	   home.scroler_dans_la_page();
	}
 
	@Given("ajouter un article au panier")
	public void ajouter_un_article_au_panier() {
		
	  home.cliquer_sur_buton_ajouter_au_panier();
	}

	@When("cliquer sur contunier le shooping")
	public void cliquer_sur_contunier_le_shooping() {
	   home.cliquer_sur_bt_continier_shooping();
	}

	@When("ajouterundeuxieme article")
	public void ajouterundeuxieme_article() {
	    home.cliquer_sur_ajouter_article2_au_panier();
	}

	@When("cliquer sur voir le panier")
	public void cliquer_sur_voir_le_panier() {
	    home.cliquer_sur_bt_vieux_cart();
	}

	//@Then("virifier la desccption de premier {string} et le deuxieme article {string}")
//	public void virifier_la_desccption_de_premier_et_le_deuxieme_article(String string, String string2) {
	    
	//}
}
