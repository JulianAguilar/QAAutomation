package com.icaro.stepDefinitions;

import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import opencart.pages.HomePage;
import org.testng.Assert;

public class HomeDefinitions {

    HomePage homePage;

    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pag de opencart")
    public void queElUsuarioIngresaALaPagDeOpencart() {
        //System.out.println("STEP DADO");
        Hooks.getDriver().get("https://opencart.abstracta.us/");
    }

    @Entonces("se valida que el usuario se encuentre en home")
    public void seValidaQueElUsuarioSeEncuentreEnHome() {
        //System.out.println("STEP ENTONCES");
        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());
    }

    @Y("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.ingresarAlLogin();
    }

    @Y("el usuario ingresa a crear cuenta")
    public void elUsuarioIngresaACrearCuenta() {
        homePage.ingresarAlRegistro();
    }

//    HomePage homePage = new HomePage(getDriver());

//    getDriver().get("https://opencart.abstracta.us/");


//        Assert.assertEquals(homePage.getTitulo(), "Your Store");
//        Assert.assertTrue(homePage.buscadorEsVisible());
//        Assert.assertTrue(homePage.carrouselEsVisible());
}
