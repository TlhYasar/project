package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.openqa.selenium.By;

public class BuyPage {
    Methods methods;

    public  BuyPage(){methods = new Methods();}

    public void buyPage(){
        methods.sendKeys(By.id("address-firstname-companyname"),"Talha");
        methods.sendKeys(By.id("address-lastname-title"),"Yaşar");
        methods.sendKeys(By.id("address-zone-id"),"YALOVA");
        methods.selectByText(By.xpath("//*[@id='address-zone-id']\t"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-county-id\"]\t"), "KAĞITHANE");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='district']")).sendKeys("ÇELİKTEPE MAH");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-address-text"),"Eflak Sok. No:14 D:3");
        methods.selectByText(By.id("address-postcode"),"34710");
        methods.selectByText(By.id("address-telephone"),"2268123097");
        methods.selectByText(By.id("address-mobile-telephone"),"5368196162");
        methods.selectByText(By.id("address-tax-id"),"48676855234");
        methods.findElement(By.xpath("(//*[@class='button'])[2]")).click();
        methods.findElement(By.xpath("(//*[@class='button'])[2]")).click();
    }
}
