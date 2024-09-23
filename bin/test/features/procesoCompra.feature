Feature: Seleccion de compras en plataforma Demoblaze

    Scenario: El usuario desea realizar una compra en la plataforma

        Given El usuario se encuentra en la pagina principal de Product Store
        When El usuario selecciona la categoria deseada "<categoria>"
        And El usuario elige el producto deseada "<producto>"
        And El usuario agrega el producto al carrito usando el boton
        Then Al parecer la  alerta se clickea en aceptar

        And se dirige al boton de carrito de compra
        And Se clickea el boton de Place order
        When Al aparecer los campos de la factura se rellenan
        Then Se clickea el boton de finalizar compra

        # Agregar la categoria y el nombre del producto para setear las variables del Feature
        ## Ejemplo usado Monitors  | Apple monitor 24
        
        Examples:
            | categoria | producto     |
            | Monitors   |  Apple monitor 24 |
