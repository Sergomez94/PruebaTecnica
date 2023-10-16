#Autor: Sergio Gomez
@PruebaTecnica
Feature: Casos de prueba para prueba tecnica

  @PruebaTecnicaPunto1
  Scenario Outline: Flujo primer punto prueba tecnica
    Given Ingresar al portal y realizar autenticacion
      | keyFilaDataExcel | <filaDataExcel> |
    When agregar libro Programming JavaScript a coleccion
      | keyFilaDataExcel | <filaDataExcel> |
    And agregar libro Understanding ECMAScript a coleccion
      | keyFilaDataExcel | <filaDataExcel> |
    Then eliminar libro Programming JavaScript de coleccion
    And eliminar cuenta y validar
      | keyFilaDataExcel | <filaDataExcel> |

    Examples: 
      | filaDataExcel |
      |             2 |

  @PruebaTecnicaPunto2
  Scenario Outline: Flujo segundo punto prueba tecnica
    Given Ingresar al portal y realizar autenticacion
      | keyFilaDataExcel | <filaDataExcel> |
    When extraer texto de nested frames
    Then llenar formulario modulo practice form
      | keyFilaDataExcel | <filaDataExcel> |
    And eliminar cuenta y validar
      | keyFilaDataExcel | <filaDataExcel> |

    Examples: 
      | filaDataExcel |
      |             3 |
