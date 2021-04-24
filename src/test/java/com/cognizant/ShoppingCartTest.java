package com.cognizant;

import org.junit.jupiter.api.Test;

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



}
