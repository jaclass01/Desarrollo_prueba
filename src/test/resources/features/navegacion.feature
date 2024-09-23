Feature: Navegacion demoblaze

    Scenario: ingreso a la pagina y creo mi usuario
        Given carga la pagina demoblaze.com
        When voy al boton de registro e ingreso mis datos de usuario
        Then el usuario se crea correctamente

