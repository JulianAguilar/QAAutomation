package com.icaro.opencart;

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
        //1
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        getDriver().get("https://opencart.abstracta.us/");

        //2 Y 3
        By myAccountBtn = By.xpath( "//a[@title='My Account']");
        By loginBtn = By.xpath( "//a[text()='Login']"); //a[contains(@ref, 'account/login')]

        WebElement myAccountBtnElem = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountBtnElem.click();

        WebElement loginBtnElem = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtnElem.click();

        //4
        By emailInput = By.id("input-email");
        By passwordInput = By.id("input-password");
        By loginForm = By.xpath( "//input[@type='submit' and @value='Login']");


        WebElement emailInputElem = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailInputElem.sendKeys( "pepe@pepe.com.mx");

        WebElement passwordInputElem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordInputElem.sendKeys("12345678");

        WebElement loginFormElem = wait.until(ExpectedConditions.elementToBeClickable(loginForm));
        loginFormElem.click();

        //5
        By tittle = By.xpath( "//h2[text()='My Account']");

        WebElement titleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(tittle));

        Assert.assertEquals(titleElem.getText(), "My Account");







    }


}
