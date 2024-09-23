PROYECTO DEMOBLAZE
El objetivo principal de este proyecto es desarrollar una suite de pruebas automatizadas que simule el flujo completo de un usuario al registrarse en la tienda en línea product store y realizar una compra exitosa. 
Esta automatización permitirá garantizar la calidad del proceso de registro y compra, identificar posibles errores o fallos en el sistema y agilizar el proceso de pruebas de regresión.

Alcance:

Automatización del registro: Se automatizaron todos los pasos necesarios para crear una nueva cuenta de usuario, gracias a java-faker, incluyendo el llenado de formularios y la creación de una contraseña.
Navegación por la tienda: Se automatizará la búsqueda y selección de productos, la adición de productos al carrito de compras y la finalización de la compra.
Procesamiento de pagos: Se simulará el proceso de pago, incluyendo la selección del método de pago y la confirmación de la compra.
Validación de resultados: Se verificará que el usuario haya sido registrado correctamente, que los productos se hayan agregado al carrito correctamente y que el pago se haya procesado con éxito.



ESTRUCTURA DEL PROYECTO
El contenido extraído del proyecto incluye las siguientes carpetas y archivos clave:

.gitattributes, .gitignore: Archivos de configuración para Git.
.idea: Configuración del entorno de desarrollo integrado (IDE), JetBrains IntelliJ.
bin: Puede contener scripts o archivos ejecutables utilizados en el proyecto.
build-logic, build.gradle, settings.gradle: Archivos de configuración de Gradle, la herramienta de construcción que gestiona dependencias y compilación.
gradle, gradlew, gradlew.bat: Archivos relacionados con Gradle Wrapper para facilitar la ejecución del proyecto sin necesidad de una instalación global de Gradle.
src: Este es el directorio que generalmente contiene el código fuente, dividido en subdirectorios como main y test.
target: el resultado de la compilación o los artefactos generados.
utilities: Carpeta donde se almacenan utilidades o clases auxiliares que ayudan en el proceso de automatización, como funciones repetitivas o configuraciones comunes.

PATRON DE DISEÑO POM (Page Object Model)

El patrón POM es fundamental en este tipo de proyectos, y aquí se aplica para organizar el código de automatización de pruebas de manera eficiente. Veamos cómo encaja en este proyecto:

Page Objects: En el patrón POM, cada página web de la aplicación tiene su propia clase de "Page Object", que contiene los elementos de la página (como campos, botones) y los métodos que interactúan con esos elementos. Esto ayuda a encapsular la lógica relacionada con cada página.

Separación de la lógica de negocio y la lógica de automatización: En lugar de escribir interacciones con elementos del DOM directamente en los scripts de prueba, POM permite escribir esas interacciones en clases dedicadas a cada página web, haciendo que las pruebas sean más mantenibles y fáciles de leer.

Reutilización de código: Como cada página tiene su propio objeto, cualquier cambio en la estructura o funcionalidad de la página solo requerirá modificar esa clase, en lugar de actualizar múltiples scripts de prueba.

¿Cómo funciona este proyecto?
Este proyecto usa Selenium WebDriver para controlar el navegador y realizar las interacciones del usuario. El patrón POM es ideal en este contexto porque:

Modulariza el código: Cada página de la tienda en línea tendrá su propio archivo de clase, como una clase para la página de inicio, otra para la página de productos, otra para el carrito de compras, etc.
Facilita el mantenimiento: Si la estructura de la tienda en línea cambia, solo será necesario modificar las clases correspondientes a las páginas afectadas, sin necesidad de cambiar cada prueba.

Construido con
Java: Lenguaje de programación principal para la implementación de las pruebas automatizadas.
Serenity: Framework de automatización de pruebas que proporciona una estructura clara y concisa para la creación de pruebas.
Gradle: Herramienta de construcción utilizada para gestionar las dependencias y compilar el proyecto.
Cucumber: Herramienta de BDD (Behavior Driven Development) que permite escribir casos de prueba en un lenguaje natural.
Selenium WebDriver: Biblioteca para controlar navegadores web y simular acciones del usuario.
Navegadores: Google Chrome y Firefox.

BY 
Manuel Antonio Payares.
gracias a todos, los quiero.
