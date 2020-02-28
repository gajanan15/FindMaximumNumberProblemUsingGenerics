package com.checklargestnumber;

import com.largestnumber.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {
    MaxNumber maxNumber = new MaxNumber();

    @Test
    public void givenThreeInteger_FirstIntegerIsMaximum_ShouldReturnFirstInteger() {
        int largestNumber = maxNumber.getLargest(30, 20, 10);
        Assert.assertEquals(30,largestNumber);

    }

    @Test
    public void givenThreeInteger_SecondIntegerIsMaximum_ShouldReturnSecondInteger() {
        int largestNumber = maxNumber.getLargest(10, 30, 20);
        Assert.assertEquals(30,largestNumber);
    }

    @Test
    public void givenThreeInteger_ThirdIntegerIsMaximum_ShouldReturnThirdInteger() {
        int largestNumber = maxNumber.getLargest(10, 20, 30);
        Assert.assertEquals(30,largestNumber);
    }

    @Test
    public void givenThreeFloatValue_WhenFirstFloatValueIsMaximum_ShouldReturnFirstFloatValue() {
        float largestNumber = maxNumber.getLargest(30.5f, 20.5f, 10.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenSecondFloatValueIsMaximum_ShouldReturnSecondFloatValue() {
        float largestNumber = maxNumber.getLargest(10.5f, 30.5f, 20.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenThirdFloatValueIsMaximum_ShouldReturnThirdFloatValue() {
        float largestNumber = maxNumber.getLargest(10.5f, 20.5f, 30.5f);
        Assert.assertEquals(30.5f,largestNumber,0.0);
    }

    @Test
    public void givenThreeStrings_WhenFirstStringIsMaximum_ShouldReturnFirstString() {
        String largestString = maxNumber.getLargest("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",largestString);
    }

    @Test
    public void givenThreeStrings_WhenSecondStringIsMaximum_ShouldReturnSecondString() {
        String largestString = maxNumber.getLargest("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",largestString);
    }
    @Test
    public void givenThreeStrings_WhenThirdStringIsMaximum_ShouldReturnThirdString() {
        String largestString = maxNumber.getLargest("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",largestString);
    }
}
