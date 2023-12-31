package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarritoPage {
    WebDriver driver;
    WebDriverWait wait;

    By compra = By.xpath("//td[text()='SAM1']");

    public CarritoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String confirmaCompra(){
        WebElement confirmaCompraElem = wait.until(ExpectedConditions.visibilityOfElementLocated(compra));
        return confirmaCompraElem.getText();
    }


}
