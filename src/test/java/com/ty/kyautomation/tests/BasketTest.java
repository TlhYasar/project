package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.BasketPage;
import com.ty.kyautomation.pages.LoginPage;
import org.junit.Test;

public class BasketTest extends BaseTest {

    @Test
    public void quantityTest() {
        LoginPage loginPage = new LoginPage();
        BasketPage basketPage = new BasketPage();

        loginPage.login();
        basketPage.upToQuantity();
    }


}
