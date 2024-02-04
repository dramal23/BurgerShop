Feature: Problématique logistique du chef cuisinier

  Scenario: Utilisation du design pattern Singleton pour un menu uniforme
    Given qu'il y a un unique gestionnaire de menus
    When le gestionnaire de menus crée un nouveau menu
    Then tous les utilisateurs ont accès au même menu

  Scenario: Utilisation du design pattern Observer pour orchestrer les livraisons
    Given qu'il y a plusieurs clients associés à des destinations et agissant en tant qu'observateurs de livraison
    When le chef cuisinier finalise un nouveau burger
    Then tous les clients sont notifiés de la disponibilité du nouveau burger

  Scenario: Intégration des design patterns pour une solution logistique complète
    Given qu'il y a un unique créateur de burgers
    And plusieurs destinations et des clients associés à ces destinations
    When le créateur de burgers crée un nouveau burger
    Then toutes les destinations sont notifiées de la disponibilité du nouveau burger
    And chaque destination peut traiter la livraison du burger de manière indépendante
