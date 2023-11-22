package com.icaro.opencart;

import com.icaro.hooks.Hooks;
import opencart.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FavoritoTest extends BaseTest{

    @Test
    public void favorito() {

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CamerasPage camerasPage = new CamerasPage(getDriver());
        WishListPage wishListPage = new WishListPage(getDriver());

        //1
        getDriver().get("https://opencart.abstracta.us/");

        //2 Y 3
        homePage.ingresarAlLogin();

        //4
        loginPage.login("pepe@pepe.com.mx", "12345678");

        //5
        myAccountPage.ingresarCamara();

        //6
        camerasPage.favoriteCamara();

        //7
        camerasPage.seleccionarWishList();

        //8
        Assert.assertEquals(wishListPage.getProductName(),"Canon EOS 5D");


    }



}
