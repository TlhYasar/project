package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[8]"));
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[8]")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[7]")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[6]")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[9]")).click();
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class='fa fa-heart red'])[7]")));
        methods.waitBySeconds(1);



    }
    public void selectHobie(){
        methods.hoverElement(By.xpath("(//*[contains(text(),'Tüm Kitaplar')])[3]"));
        methods.click(By.xpath("(//*[contains(text(),'Tüm Kitaplar')])[3]"));
        methods.waitBySeconds(4);
        methods.randomElement();
        methods.waitBySeconds(4);


    }
    public void textControl() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan test:" + text);
        logger.info("Alınan test:" + text);
    }

    public void valueControlTest() {
        methods.sendKeys(By.id("search-input"), "testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan test:" + value);
        logger.info("Alınan test:" + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    }
}
