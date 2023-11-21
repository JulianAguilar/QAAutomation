package com.icaro.opencart;

import com.github.javafaker.Faker;
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

        Faker faker = new Faker();



        getDriver().get("https://opencart.abstracta.us/");

        homePage.ingresarAlRegistro();

        registerPage.completarFormulario(
                "Julian",
                "Aguilar",
                faker.internet().emailAddress(),
                "1122334455",
                "12345678");

        Assert.assertEquals(accountPage.getTitulo(), "Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());


    }
}
