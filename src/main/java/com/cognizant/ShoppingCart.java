package com.cognizant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private boolean emptyFlag = true;

    public ShoppingCart(){

    }
    public boolean isEmpty(){
       return emptyFlag;
    }

    public double addTotalPrice(double... amounts) {
        double sum =0.0 ;
        for(int i=0; i<amounts.length; i++)
        {
            sum = sum + amounts[i];
        }
        return sum;

    }
    public double addTotalItems(int... items) {
        int count = 0;
        for(int i=0; i<items.length; i++)
        {
            count = count + items[i];
        }
        return count;

    }

   public void  addListItems(Item item) {
     Item itm = new Item(item.getName(),item.getPrice(), item.getQuantity());

    }
}
