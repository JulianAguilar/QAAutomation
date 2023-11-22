package com.icaro.opencart;

import opencart.pages.HomePage;
import opencart.pages.LoginPage;
import opencart.pages.MyAccountPage;
import opencart.pages.TabletsPage;
import org.testng.annotations.Test;

public class CarritoTest extends BaseTest{


    @Test
    public void carrito(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        TabletsPage tabletsPage = new TabletsPage(getDriver());


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



    }
}
