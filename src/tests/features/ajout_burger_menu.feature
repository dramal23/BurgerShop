Feature: Ajout de Burgers au Menu
  En tant que gestionnaire du restaurant
  Afin de mettre à jour le menu du restaurant
  Je veux pouvoir ajouter des burgers préparés au menu

  Scenario: Ajouter un burger au menu
    Given un burger avec 2 cornichons et la sauce "BBQ"
    When j'ajoute le burger au menu
    Then le menu doit contenir le burger avec 2 cornichons et la sauce "BBQ"