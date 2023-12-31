package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabletsPage {


    By carritoTabletBtn = By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]  ");

    By carritoBoton = By.xpath("//a[@title='Shopping Cart']");

    By confirmacionTabletCarrito = By.xpath("//div[text()=' Success: You have added ']");

    WebDriver driver;
    WebDriverWait wait;

    public TabletsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void agregarAlCarrito(){
        WebElement agregarAlCarritoElem = wait.until(ExpectedConditions.elementToBeClickable(carritoTabletBtn));
        agregarAlCarritoElem.click();
    }


    public String compraCorrecta(){
        WebElement confirmacionTabletCarritoElem = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmacionTabletCarrito));
        return confirmacionTabletCarritoElem.getText();
    }

    public void vercarrito(){
        WebElement verCarritoElem = wait.until(ExpectedConditions.elementToBeClickable(carritoBoton));
        verCarritoElem.click();
    }

}
