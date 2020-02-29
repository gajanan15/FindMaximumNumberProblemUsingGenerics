package com.largestnumber;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumber<E extends Comparable> {
    E firstNumber;
    E secondNumber;
    E thirdNumber;

    public MaxNumber(E firstNumber, E secondNumber, E thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public E getLargest(){
        return getLargest(firstNumber,secondNumber,thirdNumber);
    }

    public static  <E extends Comparable> E getLargest(E firstNumber, E secondNumber, E thirdNumber,E...option) {
        E max=firstNumber;
        if(secondNumber.compareTo(max)>0){
            max=secondNumber;
        }
        if(thirdNumber.compareTo(max)>0){
           max=thirdNumber;
        }
        if(option.length!=0){
            Arrays.sort(option, Collections.reverseOrder());
            if(max.compareTo(option[0])<0){
                max=option[0];
            }
        }
        printMaximumValue(max);
        return max;
    }

    private static <E extends Comparable> void printMaximumValue(E max) {
        System.out.println(max);
    }
}
