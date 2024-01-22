Feature: Modifier les informations d'une destination

  Scenario: Modifier le nom d'une destination
    Given Une destination 3 avec le nom "Sydney" et le pays "Australie"
    When Je change le nom de la destination en "Melbourne"
    Then Le nouveau nom de la destination devrait être "Melbourne"

