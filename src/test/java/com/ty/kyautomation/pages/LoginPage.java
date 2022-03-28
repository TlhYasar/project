package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){methods=new Methods();}

    public void login(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"), "talha.yasar@testinium.com");
        methods.sendKeys(By.id("login-password"), "qwerty12345");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
        System.out.println("Hoşgeldiniz");

    }
}
