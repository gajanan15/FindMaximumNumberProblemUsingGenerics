package com.checklargestnumber;

import com.largestnumber.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {

    // Test Integer Values
    @Test
    public void givenThreeInteger_FirstIntegerIsMaximum_ShouldReturnFirstInteger() {
        MaxNumber maxNumber = new MaxNumber(50,40,30);
        Assert.assertEquals(50,maxNumber.getLargest());
    }

    @Test
    public void givenThreeInteger_SecondIntegerIsMaximum_ShouldReturnSecondInteger() {
        MaxNumber maxNumber = new MaxNumber(40,50,30);
        Assert.assertSame(50,maxNumber.getLargest());
    }

    @Test
    public void givenThreeInteger_ThirdIntegerIsMaximum_ShouldReturnThirdInteger() {
        MaxNumber maxNumber = new MaxNumber(40, 30, 50);
        Assert.assertSame(50,maxNumber.getLargest());
    }

    // Test Float Values
    @Test
    public void givenThreeFloatValue_WhenFirstFloatValueIsMaximum_ShouldReturnFirstFloatValue() {
        MaxNumber maxNumber = new MaxNumber<>(30.5f,15.5f,12.5f);
        Assert.assertEquals(30.5f,maxNumber.getLargest());
    }

    @Test
    public void givenThreeFloatValue_WhenSecondFloatValueIsMaximum_ShouldReturnSecondFloatValue() {
        MaxNumber maxNumber = new MaxNumber(15.5f,30.5f,12.5f);
        Assert.assertEquals(30.5f,maxNumber.getLargest());
    }

    @Test
    public void givenThreeFloatValue_WhenThirdFloatValueIsMaximum_ShouldReturnThirdFloatValue() {
        MaxNumber maxNumber = new MaxNumber(30.5f,15.5f,12.5f);
        Assert.assertEquals(30.5f,maxNumber.getLargest());
    }

    // Test String
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
        MaxNumber maxNumber = new MaxNumber("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach",maxNumber.getLargest());
    }

    // Test More Than Three Parameters
    @Test
    public void givenMoreThanThreeInteger_WhenIntegerIsMaximum_ShouldReturnMaximumInteger() {
        Assert.assertSame(50,MaxNumber.getLargest(50,40,30,20,10));
    }

    @Test
    public void givenMoreThanThreeFloatValue_WhenFloatValueIsMaximum_ShouldReturnMaximumFloatValue() {
        Assert.assertEquals(30.5f, MaxNumber.getLargest(30.5f,15.5f,12.5f,5.5f,1.1f),0.0f);
    }

    @Test
    public void givenMoreThanThreeStrings_WhenStringIsMaximum_ShouldReturnMaximumString() {
        Assert.assertEquals("Peach",MaxNumber.getLargest("Banana", "Apple", "Peach","Mango"));
    }
}
