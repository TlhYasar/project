package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.FavoritesPage;
import com.ty.kyautomation.pages.LoginPage;
import org.junit.Test;

public class FavoritesTest extends BaseTest {

    @Test
    public void favoritesDeleteTest(){
        LoginPage loginPage=new LoginPage();
        FavoritesPage favoritesPage=new FavoritesPage();
        loginPage.login();
        favoritesPage.deleteFavorite();
    }
}
