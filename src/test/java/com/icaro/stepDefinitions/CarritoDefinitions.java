package com.icaro.stepDefinitions;

import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.messages.types.Hook;
import opencart.pages.*;
import org.testng.Assert;

public class CarritoDefinitions {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    TabletsPage tabletsPage;

    CarritoPage carritoPage;

    public CarritoDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.tabletsPage = new TabletsPage(Hooks.getDriver());
        this.carritoPage = new CarritoPage(Hooks.getDriver());

    }

    @Cuando("el usuario ingresa a tablets")
    public void elUsuarioIngresaATablets() {myAccountPage.ingresarTablets();}


    @Y("el usuario agrega una tablet al carrito de compras")
    public void elUsuarioAgregaUnaTabletAlCarritoDeCompras() {tabletsPage.agregarAlCarrito();}


    @Y("el usuario ingresa al carrito de compras")
    public void elUsuarioIngresaAlCarritoDeCompras() {tabletsPage.vercarrito();}

    @Entonces("se valida que el usuario agrego articulo al carrito de compras")
    public void seValidaQueElUsuarioAgregoArticuloAlCarritoDeCompras() {
        Assert.assertEquals(carritoPage.confirmaCompra(),"SAM1");
    }
}
