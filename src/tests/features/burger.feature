Feature: Préparation des burgers
  En tant que chef de cuisine
  Afin de pouvoir proposer des burgers de qualité à nos clients
  Je veux pouvoir préparer un burger avec des ingrédients

  Scenario: Ajouter des ingrédients supplémentaires au burger
    Given un burger avec 2 cornichons et la sauce "Ketchup" pour un test de burger
    When je rajoute 1 cornichon
    Then le burger doit contenir 3 cornichons et la sauce "Ketchup"

  Scenario: Changer la sauce du burger
    Given un burger avec 2 cornichons et la sauce "Moutarde" pour un test de burger
    When je change la sauce en "Mayonnaise"
    Then le burger doit contenir 2 cornichons et la sauce "Mayonnaise"

  Scenario: Réinitialiser la composition du burger
    Given un burger avec 4 cornichons et la sauce "Barbecue" pour un test de burger
    When je réinitialise le burger
    Then le burger doit être sans garniture
