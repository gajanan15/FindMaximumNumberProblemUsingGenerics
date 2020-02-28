package com.checklargestnumber;

import com.largestnumber.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {
    MaxNumber maxNumber = new MaxNumber();

    @Test
    public void givenThreeInteger_FirstIntegerIsMaximum_ShouldReturnFirstInteger() {
        int largestNumber = maxNumber.getLargestNumber(50, 20, 10);
        Assert.assertEquals(50,largestNumber);
    }

    @Test
    public void givenThreeInteger_SecondIntegerIsMaximum_ShouldReturnSecondInteger() {
        int largestNumber = maxNumber.getLargestNumber(10, 30, 20);
        Assert.assertEquals(30,largestNumber);
    }

    @Test
    public void givenThreeInteger_ThirdIntegerIsMaximum_ShouldReturnThirdInteger() {
        int largestNumber = maxNumber.getLargestNumber(10, 20, 30);
        Assert.assertEquals(30,largestNumber);
    }

    @Test
    public void givenThreeFloatValue_WhenFirstFloatValueIsMaximum_ShouldReturnFirstFloatValue() {
        Float largestNumber = maxNumber.getLargestNumberUsingFloat(30.5f, 20.5f, 10.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenSecondFloatValueIsMaximum_ShouldReturnSecondFloatValue() {
        Float largestNumber = maxNumber.getLargestNumberUsingFloat(10.5f, 30.5f, 20.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenThirdFloatValueIsMaximum_ShouldReturnThirdFloatValue() {
        Float largestNumber = maxNumber.getLargestNumberUsingFloat(10.5f, 20.5f, 30.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

}
