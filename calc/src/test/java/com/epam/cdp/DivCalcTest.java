package com.epam.cdp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalcTest extends BaseTest{
    @Test
    public void tenDivideFiveTest() {
        long result = calculator.div(10,5);
        Assert.assertEquals(result, 2, "invalid divide operation");
    }
}