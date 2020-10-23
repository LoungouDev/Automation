@android
Feature: Login application

  Scenario: Verifier le lancement de application android
    Given Je lance application Deezer
    When Je clique sur le bouton login
    And Je saisi un email valide
    And Je saisi un mot de passe valide
    And Je clique sur le bouton login page login
    Then Le titre music s'affiche
    And Je quitte l'application