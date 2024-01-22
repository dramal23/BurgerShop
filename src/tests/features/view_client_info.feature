Feature: Consulter les informations d'un client

  Scenario: Afficher les informations d'un client sans destination
    Given Un client 2 avec le nom "Omar"
    When Je consulte les informations du client
    Then Les informations devraient indiquer "Client : Omar, Destination inconnue"

  Scenario: Afficher les informations d'un client avec une destination
    Given Un client 2 avec le nom "Michel"
    And Une destination 2 avec le nom "Barcelone" et le pays "Espagne"
    When Je consulte les informations du client
    Then Les informations devraient indiquer "Client : Michel, BarceloneEspagne"