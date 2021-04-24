package com.cognizant;

public class ShoppingCart {
    private boolean emptyFlag = true;
    public ShoppingCart(){

    }
    public boolean isEmpty(){
       return emptyFlag;
    }

    public double addItem(double... amounts) {
        double sum =0.0 ;
        for(int i=0; i<amounts.length; i++)
        {
            sum = sum + amounts[i];
        }
        return sum;

    }
}
