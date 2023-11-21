package com.icaro.opencart;
import opencart.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


import java.time.Duration;

public class HomeTest  extends BaseTest{


    @Test
    public void validarHome(){

        HomePage homePage = new HomePage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");


        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());

    }

}
