package com.largestnumber;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MaxNumber {
    public <E extends Comparable> E getLargest(E firstNumber,E secondNumber, E thirdNumber) {
        E max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
           max=thirdNumber;
        }
        return max;
    }
}
