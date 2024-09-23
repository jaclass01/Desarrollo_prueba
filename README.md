PROYECTO DEMOBLAZE
El objetivo principal de este proyecto es desarrollar una suite de pruebas automatizadas que simule el flujo completo de un usuario al registrarse en la tienda en línea product store y realizar una compra exitosa. 
Esta automatización permitirá garantizar la calidad del proceso de registro y compra, identificar posibles errores o fallos en el sistema y agilizar el proceso de pruebas de regresión.

Alcance:

Automatización del registro: Se automatizaron todos los pasos necesarios para crear una nueva cuenta de usuario, gracias a java-faker, incluyendo el llenado de formularios y la creación de una contraseña.
Navegación por la tienda: Se automatizará la búsqueda y selección de productos, la adición de productos al carrito de compras y la finalización de la compra.
Procesamiento de pagos: Se simulará el proceso de pago, incluyendo la selección del método de pago y la confirmación de la compra.
Validación de resultados: Se verificará que el usuario haya sido registrado correctamente, que los productos se hayan agregado al carrito correctamente y que el pago se haya procesado con éxito.



Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

Mira Deployment para conocer como desplegar el proyecto.

Pre-requisitos

variables de Entorno

Verifica que en tu equipo se encuentre instalado el java 17 y el gradle 8.9



Construido con
Java: Lenguaje de programación principal para la implementación de las pruebas automatizadas.
Serenity: Framework de automatización de pruebas que proporciona una estructura clara y concisa para la creación de pruebas.
Gradle: Herramienta de construcción utilizada para gestionar las dependencias y compilar el proyecto.
Cucumber: Herramienta de BDD (Behavior Driven Development) que permite escribir casos de prueba en un lenguaje natural.
Selenium WebDriver: Biblioteca para controlar navegadores web y simular acciones del usuario.
Navegadores: Google Chrome y Firefox.


