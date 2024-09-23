Feature: Seleccion de compras en plataforma Demoblaze

    Scenario Outline: El usuario desea realizar una compra

        Given El usuario esta ubicado en el home de Product Store
        When El usuario escoge una categoria "<categorias>"
        And El usuario selecciona un producto "<producto>"
        And El usuario agrega su producto al carrito de compras
        Then Banner confirmando su eleccion al usuario

        And el usuario revisa sus productos en el carrito de compras
        And el usuario clicka sobre proceder a la compra
        When se solicitan sus datos de credito para proceder con la compra
        Then se confirma al usuario la compra

        # Agregar la categoria y el nombre del producto para setear las variables del Feature
        ## Ejemplo usado telefonos

        Examples:
            | categorias | producto     |
            | Phones   |  Samsung galaxy s6 |
