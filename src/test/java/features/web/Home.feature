@web
Feature: Home Page check

  Scenario: Verifier le bon affichage de la home page
    Given Je Navigue vers le site "https://www.deezer.com/fr/"
    When Je ferme le popin
    Then Le bouton connexion est affiché
    And Fermer le navigateur