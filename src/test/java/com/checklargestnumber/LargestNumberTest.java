package com.checklargestnumber;

import com.largestnumber.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {

    @Test
    public void givenThreeInteger_FirstIntegerIsMaximum_ShouldReturnFirstInteger() {
        MaxNumber maxNumber = new MaxNumber(30, 20, 10);
        Assert.assertEquals(30,maxNumber.getLargest());
    }

    @Test
    public void givenThreeInteger_SecondIntegerIsMaximum_ShouldReturnSecondInteger() {
        MaxNumber maxNumber = new MaxNumber(10, 30, 20);
        Assert.assertEquals(30,maxNumber.getLargest());
    }

    @Test
    public void givenThreeInteger_ThirdIntegerIsMaximum_ShouldReturnThirdInteger() {
        MaxNumber maxNumber = new MaxNumber(10, 20, 30);
        Assert.assertEquals(30,maxNumber.getLargest());
    }

    @Test
    public void givenThreeFloatValue_WhenFirstFloatValueIsMaximum_ShouldReturnFirstFloatValue() {
        MaxNumber maxNumber = new MaxNumber(30.5f, 20.5f, 10.5f);
        Assert.assertEquals(30.5f, maxNumber.getLargest());
    }

    @Test
    public void givenThreeFloatValue_WhenSecondFloatValueIsMaximum_ShouldReturnSecondFloatValue() {
        MaxNumber maxNumber = new MaxNumber(10.5f, 30.5f, 20.5f);
        Assert.assertEquals(30.5f,maxNumber.getLargest());
    }

    @Test
    public void givenThreeFloatValue_WhenThirdFloatValueIsMaximum_ShouldReturnThirdFloatValue() {
        MaxNumber maxNumber = new MaxNumber(10.5f, 20.5f, 30.5f);
        Assert.assertEquals(30.5f,maxNumber.getLargest());
    }

    @Test
    public void givenThreeStrings_WhenFirstStringIsMaximum_ShouldReturnFirstString() {
        MaxNumber maxNumber = new MaxNumber("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",maxNumber.getLargest());
    }

    @Test
    public void givenThreeStrings_WhenSecondStringIsMaximum_ShouldReturnSecondString() {
        MaxNumber maxNumber = new MaxNumber("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",maxNumber.getLargest());
    }
    @Test
    public void givenThreeStrings_WhenThirdStringIsMaximum_ShouldReturnThirdString() {
        MaxNumber maxNumber = new MaxNumber("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",maxNumber.getLargest());
    }
}
