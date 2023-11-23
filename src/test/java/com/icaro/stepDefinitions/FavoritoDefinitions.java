package com.icaro.stepDefinitions;

import com.icaro.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import opencart.pages.*;
import org.testng.Assert;

public class FavoritoDefinitions {


    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    CamerasPage camerasPage;
    WishListPage wishListPage;

    public FavoritoDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new  LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.camerasPage = new CamerasPage(Hooks.getDriver());
        this.wishListPage = new WishListPage(Hooks.getDriver());
    }

    @Cuando("el usuario ingresa a camaras")
    public void elUsuarioIngresaACamaras() {myAccountPage.ingresarCamara();}


    @Y("el usuario agrega articulo a favoritos")
    public void elUsuarioAgregaArticuloAFavoritos() {camerasPage.favoriteCamara();}

    @Y("el usuario ingresa a la wishlist")
    public void elUsuarioIngresaALaWishlist() {camerasPage.seleccionarWishList();}

    @Entonces("se valida que el usuario agrego articulo a favoritos")
    public void seValidaQueElUsuarioAgregoArticuloAFavoritos() {
        Assert.assertEquals(wishListPage.getProductName(),"Canon EOS 5D");}
}
