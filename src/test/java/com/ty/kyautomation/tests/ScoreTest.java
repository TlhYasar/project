package com.ty.kyautomation.tests;

import com.ty.kyautomation.driver.BaseTest;
import com.ty.kyautomation.pages.ScoreCatalog;
import org.junit.Test;

public class ScoreTest extends BaseTest {
    @Test
    public void scoreCatalogTest(){
        ScoreCatalog scoreCatalog =new ScoreCatalog();
        scoreCatalog.score();
    }
}
