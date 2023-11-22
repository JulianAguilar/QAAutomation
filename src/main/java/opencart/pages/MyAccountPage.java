package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    By tittle = By.xpath( "//h2[text()='My Account']");


    By categoriaBtn = By.xpath("//*[text()='Cameras']");

    //By tabletsBtn = By.xpath("//*[text()='Tablets']");


    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitulo(){
        WebElement titleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(tittle));
        return titleElem.getText();
    }

    public void ingresarCamara(){
        WebElement categoriaBtnElem = wait.until(ExpectedConditions.elementToBeClickable(categoriaBtn));
        categoriaBtnElem.click();
    }

    //public void ingresarTablets(){
    //    WebElement tabletsBtnElem = wait.until(ExpectedConditions.elementToBeClickable(tabletsBtn));
    //    tabletsBtnElem.click();
   // }


}
