package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.BasketPage;
import com.ty.kyautomation.pages.BuyPage;
import com.ty.kyautomation.pages.LoginPage;
import org.junit.Test;

public class BuyTest extends BaseTest {
    @Test
    public void buyTest(){
        LoginPage loginPage= new LoginPage();
        BasketPage basketPage = new BasketPage();
        BuyPage buyPage=new BuyPage();

        loginPage.login();
        basketPage.upToQuantity();
        buyPage.buyPage();
    }
}
