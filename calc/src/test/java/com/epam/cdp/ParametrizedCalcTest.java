package com.epam.cdp;

import com.epam.tat.module4.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizedCalcTest extends BaseTest {

    private int expectedResult;
    private int firstValue;
    private int secondValue;

    public ParametrizedCalcTest(int expectedResult, int firstValue, int secondValue){
        super();
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedResult = expectedResult;
    }
    @Before
    public void Initialize(){
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = new Object[][]{{6,2,4}, {7,4,3}, {8,3,5}};
        return Arrays.asList(data);
    }
    @Test
    public void expectedSumOfValues() {
        Assert.assertEquals(calculator.sum(firstValue,secondValue),expectedResult);
    }
}
