Feature: Navegacion demoblaze

    Scenario: Entrada a demoblaze y registro
        Given Entro la pagina demoblaze.com
        When clickeo el boton de registrar y ingreso mis datos
        Then se registra el usuario y clickeo aceptar en el Alert

