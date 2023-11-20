package com.icaro.opencart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


import java.time.Duration;

public class HomeTest  extends BaseTest{


    @Test
    public void validarHome(){

        getDriver().get("https://opencart.abstracta.us/");

        By tittle = By.xpath("//div[@id='logo']/h1/a");
        By search = By.name("search");
        By carrousel = By.id("slideshow0");


        WebElement tittleElement = getDriver().findElement(tittle);
        WebElement searchElement = getDriver().findElement(search);
        WebElement carrouselElement = getDriver().findElement(carrousel);

        Assert.assertEquals(tittleElement.getText(), "Your Store");
        Assert.assertTrue(searchElement.isDisplayed());
        Assert.assertTrue(carrouselElement.isDisplayed());

    }

}
