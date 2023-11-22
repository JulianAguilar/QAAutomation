package opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {


    By productName = By.xpath("//a[text()='Canon EOS 5D']");

    WebDriver driver;
    WebDriverWait wait;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getProductName (){
        WebElement productNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        return productNameElem.getText();
    }
}
