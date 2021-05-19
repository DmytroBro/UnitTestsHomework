package com.epam.cdp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest{
    @Test
    public void onePlusTwoTest() {
        long result = calculator.sum(1,2);
        Assert.assertEquals(result, 3, "invalid sum operation");
    }
}
