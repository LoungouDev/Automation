@web
Feature: Navigator login

  Scenario: Feature login
    Given Je Navigue vers le site "https://www.deezer.com/fr/"
    When Je clique sur connexion
    And Je saisis "loungou.ayoub.fst@gmail.com" et "Noipein123"
    And Je clique sur login
    Then Le captcha affiche
    And Fermer le navigateur