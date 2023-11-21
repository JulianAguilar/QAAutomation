package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    By firstNameInput = By.id("input-firstname");
    By lastNameInput = By.id("input-lastname");
    By emailInput = By.id("input-email");
    By telephoneInput = By.id("input-telephone");
    By passwordInput = By.id("input-password");
    By passwordConfirmInput = By.id("input-confirm");
    By termsAndConditionsCheckbox = By.name("agree");
    By continueBtn = By.xpath("//input[@value='Continue']");

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void completarFormulario() {
        WebElement firstNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        firstNameElem.sendKeys("Julian");

        WebElement lastNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
        lastNameElem.sendKeys("Aguilar");

        WebElement emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailElem.sendKeys("julian@2.com.mx");

        WebElement telElem = wait.until(ExpectedConditions.visibilityOfElementLocated(telephoneInput));
        telElem.sendKeys("1122334455");

        WebElement passElem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passElem.sendKeys("12345678");

        WebElement confirmPassElem = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordConfirmInput));
        confirmPassElem.sendKeys("12345678");

        WebElement checkElem = wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckbox));
        checkElem.click();

        WebElement continueBtnElem = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtnElem.click();
    }
}
