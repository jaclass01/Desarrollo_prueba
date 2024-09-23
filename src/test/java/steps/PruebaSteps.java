package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class PruebaSteps {

    private PaginaPrincipal landingPage;

    public PruebaSteps() {
        landingPage = new PaginaPrincipal();
    }

    // pasos para crear usuario

    @Given("carga la pagina demoblaze.com")
    public void NavegacionDemo() {
        landingPage.navegacion();
    }

    @When("voy al boton de registro e ingreso mis datos de usuario")
    public void clickeoBotonRegistrar() {
        landingPage.clickRegistro();
        landingPage.procesoRegistroDeUsuario();
    }

    @And("el usuario se crea correctamente")
    public void clickEnVentanaEmergente() {
        landingPage.aceptarAlertas();
    }


    // pasos para el proceso de compra

    @Given("El usuario esta ubicado en el home de Product Store")
    public void NavegacionPlataforma() {
        landingPage.navegacion();
        landingPage.esperarUnosSegundos(2);
    }

    @When("El usuario escoge una categoria {string}")
    public void seleccionarLaCategoriaDeseada(String categoria) {
        landingPage.seleccionarCategoriaDeseada(categoria);
    }

    @And("El usuario selecciona un producto {string}")
    public void seleccionarElProductoDeseado(String producto) {
        landingPage.seleccionarProductoDeseado(producto);
    }

    @And("El usuario agrega su producto al carrito de compras")
    public void agregarProductoCarrito() {
        landingPage.esperarUnosSegundos(1);
        landingPage.anadirAcarritoDeCompra();
        landingPage.esperarUnosSegundos(2);
    }

    @Then("Banner confirmando su eleccion al usuario")
    public void clickEnAlertaGenerada() {
        landingPage.aceptarAlertas();
        landingPage.esperarUnosSegundos(1);
    }

    @And("el usuario revisa sus productos en el carrito de compras")
    public void clickBotonCarritoDeCompra() {
        landingPage.irAVentanaCarritoDeCompra();
        landingPage.esperarUnosSegundos(1);
    }

    @And("el usuario clicka sobre proceder a la compra")
    public void procederConLaCompra() {
        landingPage.clickBotonOrdenCarrito();
        landingPage.esperarUnosSegundos(1);
    }

    @When("se solicitan sus datos de credito para proceder con la compra")
    public void rellenarCamposFormulario() {
        landingPage.rellenarOrdenDeCompra();
        landingPage.esperarUnosSegundos(1);
    }

    @Then("se confirma al usuario la compra")
    public void clickBotonFinalizarCompra() {
        landingPage.clickBotonPurchace();
        landingPage.esperarUnosSegundos(2);
    }

}
