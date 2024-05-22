Feature: automatizacion de rest api - pom
  yo como estudiante de calidad de software
  necesito construir una peticion a una api
  para aprender a automatizar servicios

  Scenario: actualizar el estado de un usuario con metodo put
    Given se establece la base url "https://gorest.co.in/"
    When se actualiza el estado en el endpoint "public/v2/users/" por id "6914439" con el estado "active"
    Then se valida que el status code 200 y que el estado sea "active"
