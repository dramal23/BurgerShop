Feature: Problématique logistique du chef cuisinier

  Background:
    Given qu'un chef cuisinier virtuel existe

  Scenario: Utilisation du design pattern Singleton pour un menu uniforme
    Given qu'il y a plusieurs instances du chef cuisinier
    When le chef cuisinier crée un nouveau burger
    Then le menu du chef cuisinier est le même pour toutes les instances
    And chaque instance peut accéder au menu et modifier les options de burger

  Scenario: Utilisation du design pattern Observer pour orchestrer les livraisons
    Given qu'il y a plusieurs destinations virtuelles
    And le chef cuisinier est observateur des destinations
    When le chef cuisinier finalise un burger
    Then toutes les destinations sont notifiées de la disponibilité du nouveau burger
    And chaque destination peut traiter la livraison du burger de manière indépendante

  Scenario: Intégration des design patterns pour une solution logistique complète
    Given qu'il y a plusieurs instances du chef cuisinier
    And le chef cuisinier est observateur des destinations
    When le chef cuisinier crée un nouveau burger
    Then le menu du chef cuisinier est le même pour toutes les instances
    And chaque instance peut accéder au menu et modifier les options de burger
    And toutes les destinations sont notifiées de la disponibilité du nouveau burger
    And chaque destination peut traiter la livraison du burger de manière indépendante
