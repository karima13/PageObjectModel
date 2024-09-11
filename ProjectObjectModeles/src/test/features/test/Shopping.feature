
@shopping
Feature: shooping 
  
 Background:

 
    Given Saisir l url suivant "https://automationexercise.com/"
    And cliquer sur autoriser les cookies
   When choisir singnup login
    And saisir adress mail "karima.1@gmail.com" et le mot de passe "test86"
    And cliquer sur le bouton login
    Then virifier le nom de profile "karima"
  @tag1
  Scenario: ajouter des article au panier
    Given scroler dans la page
    Given ajouter un article au panier
    When cliquer sur contunier le shooping
    And ajouterundeuxieme article
    And cliquer sur voir le panier
   # Then virifier la desccption de premier "Blue Top" et le deuxieme article "Men Tshirt"
    

  
