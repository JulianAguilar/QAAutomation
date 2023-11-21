package com.icaro.opencart;

import opencart.pages.AccountPage;
import opencart.pages.HomePage;
import opencart.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest  extends BaseTest{

    @Test
    public void createAccount(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());


        getDriver().get("https://opencart.abstracta.us/");

        homePage.ingresarAlRegistro();

        registerPage.completarFormulario();

        Assert.assertEquals(accountPage.getTitulo(), "Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());


    }
}
