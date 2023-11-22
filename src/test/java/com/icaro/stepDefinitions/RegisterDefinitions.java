package com.icaro.stepDefinitions;

import com.github.javafaker.Faker;
import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import opencart.pages.AccountPage;
import opencart.pages.HomePage;
import opencart.pages.LoginPage;
import opencart.pages.RegisterPage;
import org.testng.Assert;

public class RegisterDefinitions {

    LoginPage loginPage;

    HomePage homePage;
    RegisterPage registerPage;

    AccountPage accountPage;

    public RegisterDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
    }


    @Cuando("el usuario ingresa datos de registro")
    public void elUsuarioIngresaDatosDeRegistro() {
        Faker faker = new Faker();

        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());

        //registerPage.completarFormulario("julian","aguilar","juli@q2.com.mx","1122334455","12345678");
        //System.out.println("Step Cuando datos");
    }

    @Entonces("se valida que el usuario se registro correctamente")
    public void seValidaQueElUsuarioSeRegistroCorrectamente() {
        Assert.assertEquals(accountPage.getTitulo(), "Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());

    }
}
