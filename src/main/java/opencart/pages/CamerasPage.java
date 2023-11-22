package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CamerasPage {

    By tabletsBtn = By.xpath("//*[text()='Tablets']");

    By favoriteBtn = By.xpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]");

    By wishlist = By.id("wishlist-total");

    WebDriver driver;
    WebDriverWait wait;


    public CamerasPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void favoriteCamara(){
        WebElement favoriteBtnElem = wait.until(ExpectedConditions.elementToBeClickable(favoriteBtn));
        favoriteBtnElem.click();
    }

    public void seleccionarWishList(){
        WebElement seleccionarWishListElem = wait.until(ExpectedConditions.elementToBeClickable(wishlist));
        seleccionarWishListElem.click();
    }



    public void ingresarTablets(){
        WebElement tabletsBtnElem = wait.until(ExpectedConditions.elementToBeClickable(tabletsBtn));
        tabletsBtnElem.click();
         }


}
