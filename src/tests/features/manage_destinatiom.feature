Feature: Gérer les informations d'une destination pour les clients

  Scenario: Ajouter un client à une destination
    Given Une destination avec le nom "Paris" et le pays "France"
    And Un client avec le nom "Youness"
    When J'ajoute le client à la destination
    Then Le client devrait être associé à la destination