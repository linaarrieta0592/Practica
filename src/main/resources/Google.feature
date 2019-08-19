#Author: 	Lina Arrieta
@tag
Feature: yo como usuario, necesito poder realizar una busqueda en google

  @tag1
  Scenario: busqueda de pruebaz en google
    Given el usuario ingresa a google
    When realiza la busqueda de la palabra pruebaz
    And selecciona la palabra correcta pruebas
    Then valida que la cantidad de resultados sea mayor a 6

  @tag2
  Scenario: busqueda de pruebaz en google
    Given el usuario ingresa a google
    When realiza la busqueda de la palabra pruebaz
    Then valida que  el mensaje de correccion sea pruebas
