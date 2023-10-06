package com.icaro.clase6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class PrimeraPruebaAutomationTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");


        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);
    }

    @Test
    public void abrirPagina(){
        this.driver.get("https://opencart.abstracta.us/");
    }

    @AfterMethod
    public void tearDown(){
        if (this.driver != null){
            this.driver.quit();
        }
    }
}
