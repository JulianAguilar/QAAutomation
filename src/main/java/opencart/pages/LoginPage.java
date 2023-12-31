package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    By emailInput = By.id("input-email");
    By passwordInput = By.id("input-password");
    By loginForm = By.xpath( "//input[@type='submit' and @value='Login']");


    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login (String email, String password){
        WebElement emailInputElem = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailInputElem.sendKeys( email);

        WebElement passwordInputElem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordInputElem.sendKeys(password);

        WebElement loginFormElem = wait.until(ExpectedConditions.elementToBeClickable(loginForm));
        loginFormElem.click();
    }
}
