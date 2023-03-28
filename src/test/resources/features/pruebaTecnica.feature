#Autor: Sergio Gomez
@PruebaTecnica
Feature: Casos de prueba para prueba tecnica

  @registrarseEnPagina
  Scenario Outline: Flujo de login en la pagina web compensar
    Given Me encuentro en la pagina 
    When selecciono la opcion transacciones en linea
    Then lleno el formulario de credenciales
    	|keyFilaDataExcel| <filaDataExcel>|
    	|keyFeature 	   | <feature>      |
    	
    Examples:
    |filaDataExcel 	| feature	  |
    |          2    | compensar |
  


