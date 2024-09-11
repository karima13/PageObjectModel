package SetepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageFinaliserPaiemenet;
import PageObject.PageHome;
import PageObject.PagePaiement;
import PageObject.PagePanier;
import io.cucumber.java.en.*;

public class Paiement {
	
	WebDriver driver =SetUp.driver;
	
	PagePanier panier =new PagePanier(driver);
	PagePaiement pyment= new PagePaiement(driver);
	PageFinaliserPaiemenet fin_paiement =new PageFinaliserPaiemenet(driver);
	
	@Given("cliquer sur bouton procced tocheckout")
	public void cliquer_sur_bouton_procced_tocheckout() {
	panier.acceder_au_paiement();
	}
	@Given("scroler")
	public void scroler() {
		pyment.scroler();
	}
	@Given("scroler encore")
	public void scroler_encore() {
		pyment.scroler_encore();
	}

	@Given("cliquer sur bouton place order")
	public void cliquer_sur_bouton_place_order() {
		pyment.cliquer_sur_contunier_le_paiement();
	}
	
	@When("saisir le nom de titulaire de la carte {string}")
	public void saisir_le_nom_de_titulaire_de_la_carte(String string) {
		fin_paiement.ecrir_dans_le_champ_name_cart(string);
	}

	@When("entrer numero de la carte {string}")
	public void entrer_numero_de_la_carte(String string) {
		fin_paiement.ecrir_dans_le_numero_cart(string);
	}

	@When("saisir cvc {string}")
	public void saisir_cvc(String string) {
		fin_paiement.ecrir_cvc(string);
	}

	@When("saisir le mois {string} et annee  {string}")
	public void saisir_le_mois_et_annee(String string, String string2) {
		fin_paiement.ecrir_mois_exepiration(string);
		fin_paiement.ecrir_annee_expiration(string2);
	}
	@When("scroler pay")
	public void scroler_pay() {
		fin_paiement.scroler_pay();
	}

	@When("cliquer sur le bouton confirmation de paiement")
	public void cliquer_sur_le_bouton_confirmation_de_paiement() {
		fin_paiement.cliquer_sur_confirmation_paiemner();
	}

	@Then("verfication")
	public void verfication() {
	   
	}
}
