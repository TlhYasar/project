package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.openqa.selenium.By;

public class ScoreCatalog {

    Methods methods;

    public ScoreCatalog(){methods=new Methods();}

    public void score(){

        methods.findElement(By.className("lvl1catalog")).click();
        methods.findElement(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']")).click();
        methods.waitBySeconds(10);
        methods.findElement(By.xpath("//*[@class='sort']//select//option[contains(text(),\"Yüksek Oylama\")]")).click();



    }






}
