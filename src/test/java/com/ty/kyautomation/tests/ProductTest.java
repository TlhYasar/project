package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.LoginPage;
import com.ty.kyautomation.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage= new LoginPage();
        ProductPage productPage= new ProductPage();

        loginPage.login();
        productPage.selectProduct();
    }
    @Test
    public void getTextTest(){
        ProductPage productPage=new ProductPage();
        productPage.textControl();
    }
    @Test
    public void valueTest(){

        ProductPage productPage=new ProductPage();
        productPage.valueControlTest();
    }
    @Test
    public void hobieTest(){
        LoginPage loginPage=new LoginPage();
        ProductPage productPage=new ProductPage();

        loginPage.login();
        productPage.selectHobie();

    }
}

