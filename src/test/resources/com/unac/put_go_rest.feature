Feature: automatizacion de rest api - pom
  Yo como estudiante de calidad de software
  necesito construir una petición a una API
  para aprender a automatizar servicios

  Scenario: actualizar un usuario con método put
    Given se establece la base URL "https://gorest.co.in/"
    When se usa el endpoint "public/v2/users/" se actualiza el usuario con el ID "6913852" donde se cambiará su status a "inactive"
    Then se valida que el status code 200 y que contenga el status "inactive"
