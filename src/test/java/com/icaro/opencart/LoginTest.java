package com.icaro.opencart;

import opencart.pages.HomePage;
import opencart.pages.LoginPage;
import opencart.pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void login (){

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //1
        getDriver().get("https://opencart.abstracta.us/");

        //2 Y 3
        homePage.ingresarAlLogin();

        //4
        loginPage.login("pepe@pepe.com.mx", "12345678");

        //5
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");


    }

    @Test
    public void loginFallido(){
        //HomePage homePage = new HomePage(getDriver());
        //LoginPage loginPage = new LoginPage(getDriver());
        //MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //1
        //getDriver().get("https://opencart.abstracta.us/");

        //2 Y 3
        //homePage.ingresarAlLogin();

        //4
        //loginPage.login("pepe@pepe.com.mx", "1234567");
    }


}