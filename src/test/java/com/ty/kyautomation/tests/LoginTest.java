package com.ty.kyautomation.tests;


import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

}
