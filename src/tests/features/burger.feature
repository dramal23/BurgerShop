Feature: Préparation des burgers
  En tant que chef de cuisine
  Afin de pouvoir proposer des burgers de qualité à nos clients
  Je veux pouvoir préparer un burger avec des ingrédients

  Scenario: Préparer un nouveau burger
    Given un burger sans garniture
    When j'ajoute 3 cornichons et la sauce "Spéciale" au burger
    Then le burger doit contenir 3 cornichons et la sauce "Spéciale"

  Scenario: Afficher la description d'un burger
    Given un burger avec 3 cornichons et la sauce "Spéciale"
    When j'affiche la description du burger
    Then la description du burger doit être "Burger avec 3 cornichons et sauce Spéciale"
