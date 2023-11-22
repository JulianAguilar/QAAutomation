package com.icaro.opencart;

import opencart.pages.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarritoTest extends BaseTest{


    @Test
    public void carrito(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        TabletsPage tabletsPage = new TabletsPage(getDriver());
        CarritoPage carritoPage = new CarritoPage(getDriver());


        //1
        getDriver().get("https://opencart.abstracta.us/");

        //2 Y 3
        homePage.ingresarAlLogin();

        //4
        loginPage.login("pepe@pepe.com.mx", "12345678");

        //5
        myAccountPage.ingresarTablets();

        //6 Se agrega al carrito una tablet Samsung Galaxy Tab 10.1
        tabletsPage.agregarAlCarrito();

        //7 ver carrito
        tabletsPage.vercarrito();

        //7 Mensaje de agregado al carrito exitosamente
        //Assert.assertEquals(tabletsPage.compraCorrecta(), " Success: You have added ");

        //Assert.assertEquals(tabletsPage.compraCorrecta()," Success: You have added ");
        //Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertEquals(carritoPage.confirmaCompra(),"SAM1");


    }
}
