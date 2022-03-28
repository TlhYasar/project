package com.ty.kyautomation.pages;

import com.ty.kyautomation.methods.Methods;
import org.openqa.selenium.By;

public class CreditCardPage {
    Methods methods;

    public CreditCardPage(){methods=new Methods();}

    public void creditCardInfo(){

        methods.selectByText(By.id("credit-card-owner"),"Talha Yaşar");
        methods.selectByText();


    }
}
