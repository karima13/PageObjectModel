package SetepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageHome;
import PageObject.PageSingUp;
import io.cucumber.java.en.*;

public class AuthentificationAutomationExercice {
	
	WebDriver driver = SetUp.driver;
	PageHome home =new PageHome(driver)   ;
	PageSingUp singup = new PageSingUp(driver);
	
	@Given("Saisir l url suivant {string}")
	public void saisir_l_url_suivant(String string) {
		home.demarer_URL(string);
	}
	@Given("cliquer sur autoriser les cookies")
	public void cliquer_sur_autoriser_les_cookies() {
		home.cliquer_sur_autorisation_cookies();
	}
	@When("choisir singnup login")
	public void choisir_singnup_login() {
	   home.cliquer_sur_le_bouton_login();
	}

	@When("saisir adress mail {string} et le mot de passe {string}")
	public void saisir_adress_mail_et_le_mot_de_passe(String string, String string2) {
		singup.ecrir_dans_lechamp_mail(string);
		singup.ecrir_dans_lechamp_password(string2);
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		singup.cliquer_sur_bt_login();
	}

	@Then("virifier le nom de profile {string}")
	public void virifier_le_nom_de_profile(String string) {
	    Assert.assertEquals(string, home.profil_obtenu());
	}

}
