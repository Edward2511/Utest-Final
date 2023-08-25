Feature: Registro de usuarios en la aplicación
  Como usuario
  Quiero poder registrarme en la aplicación
  Para acceder a las funcionalidades exclusivas para usuarios registrados

  Scenario: Registro exitoso
    Given ingresar al boton jointoday
    When ingreso los datos del formulario
    |firstName|lastName|email|password|confirPassword|
    |Edward|Rodriguez|pepitopaezcr5@hotmail.com|Cr7siugoat5$|Cr7siugoat5$|
    Then El usuario vera el siguente mensaje
      |Mensaje|
      |Welcome to the world's largest community of freelance software testers!|


