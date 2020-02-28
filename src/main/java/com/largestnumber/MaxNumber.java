package com.largestnumber;
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

    public <E extends Comparable> E getLargest(E firstNumber, E secondNumber, E thirdNumber) {
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
