
@AuthentificationAutomationExercice
Feature:Autentification automation exercice



  @tag1
  Scenario: Connexion a l aplication
    Given Saisir l url suivant "https://automationexercise.com/"
    And cliquer sur autoriser les cookies
    When choisir singnup login
    And saisir adress mail "karima.1@gmail.com" et le mot de passe "test86"
    And cliquer sur le bouton login
    Then virifier le nom de profile "karima"
    

  
