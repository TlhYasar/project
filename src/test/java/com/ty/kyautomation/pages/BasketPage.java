package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.openqa.selenium.By;

public class BasketPage {
    Methods methods;

    public BasketPage(){methods=new Methods();}

    public void upToQuantity(){
        methods.findElement(By.id("sprite-cart-icon")).click();
        methods.findElement(By.xpath("(//*[@id='js-cart'])[1]")).click();
        methods.findElement(By.cssSelector("[name='quantity']")).clear();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name='quantity']")).sendKeys("2");
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector(".to-wishlist>.button.red")).click();
    }

}
