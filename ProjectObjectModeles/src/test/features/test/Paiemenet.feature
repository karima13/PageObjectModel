
@Achat
Feature: paiement
  I want to use this template for my feature file

Background:

 
    Given Saisir l url suivant "https://automationexercise.com/"
    And cliquer sur autoriser les cookies
   When choisir singnup login
    And saisir adress mail "karima.1@gmail.com" et le mot de passe "test86"
    And cliquer sur le bouton login
     Given scroler dans la page
    Given ajouter un article au panier
    When cliquer sur contunier le shooping
    And ajouterundeuxieme article
    And cliquer sur voir le panier

  @tag1
  Scenario: paiement
    Given cliquer sur bouton procced tocheckout
    And scroler 
    And scroler encore
    And cliquer sur bouton place order
    When saisir le nom de titulaire de la carte "fef"
    And entrer numero de la carte "123456789"
    And saisir cvc "125"
    And saisir le mois "12" et annee  "2025"
    And scroler pay
    And cliquer sur le bouton confirmation de paiement
    Then verfication 
   

 
