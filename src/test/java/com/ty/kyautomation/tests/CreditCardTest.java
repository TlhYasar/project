package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.CreditCardPage;
import org.junit.Test;

public class CreditCardTest extends BaseTest {
    @Test
    public void creditTest(){
        CreditCardPage creditCardPage=new CreditCardPage();

        creditCardPage.creditCardInfo();


    }
}
