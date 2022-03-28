package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritesPage {
    Methods methods;

    public FavoritesPage(){
        methods=new Methods();
    }

    public void deleteFavorite(){

        methods.hoverElement(By.xpath("//*[@class='menu top my-list']//li"));
        methods.click(By.xpath("//*[@class='menu top my-list']//li//li[1]"));
        methods.hoverElement(By.xpath("(//*[@class='product-cr'])[3]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart-o'])[3]")).click();
        methods.waitBySeconds(2);
    }

}
