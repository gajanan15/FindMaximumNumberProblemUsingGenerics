package com.largestnumber;

public class MaxNumber {
    public Integer getLargestNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        Integer max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
           max=thirdNumber;
        }
        return max;
    }

    public Float getLargestNumberUsingFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
            max=thirdNumber;
        }
        return max;
    }

    public String getLargestString(String firstString, String secondString, String thirdString) {
        String max=firstString;
        if(secondString.compareTo(max)>0){
            max=secondString;
        }
        if(thirdString.compareTo(max)>0){
            max=thirdString;
        }
        return max;
    }
}
