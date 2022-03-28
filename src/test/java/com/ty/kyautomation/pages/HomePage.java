package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    public  HomePage(){methods=new Methods();}

    public void home(){
        methods.click(By.xpath("//div[@class='logo-icon']"));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));
    }
}
