package com.cognizant;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest {



    @Test
    void testIsCartEmpty(){
        //Setup
        ShoppingCart shoppingCart;
        shoppingCart = new ShoppingCart();
        //Execution

        //Assert
        assertTrue(shoppingCart.isEmpty());
        //Teardown
    }

    @Test
    void testAddSinglePrice(){
        ShoppingCart shoppingCart;
        shoppingCart = new ShoppingCart();
        double expected = 1;
        assertEquals(expected, shoppingCart.addTotalPrice(1));
    }
    @Test
    void testAddMultiplePrice(){
        ShoppingCart shoppingCart;
        shoppingCart = new ShoppingCart();
        double expected = 6;
        assertEquals(expected,shoppingCart.addTotalPrice(1,2,3));
    }

    @Test
    void testAddItem(){
        ShoppingCart shoppingCart;
        shoppingCart = new ShoppingCart();
        int expected = 10;
        assertEquals(expected,shoppingCart.addTotalItems(1,2,3,4));
    }

  @Test
 void testListItems(){
    ShoppingCart shoppingCart;
    shoppingCart = new ShoppingCart();



////        Map<Integer,Double> expected = new HashMap<>();
//
//        expected.put(1,2.0);
//        expected.put(2,4.0);
//        expected.put(3,6.0);
//        assertEquals(expected,shoppingCart.addListItems());


    }







}
