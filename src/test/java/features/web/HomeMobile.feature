@android
Feature: Home page application

  Scenario: Verifier le lancement de application android
    Given Je lance application Deezer
    When La home page s'affiche correctement
    Then Je quitte l'application