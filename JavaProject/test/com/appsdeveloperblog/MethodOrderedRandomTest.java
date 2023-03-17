package com.appsdeveloperblog;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedRandomTest {

    @Order(2)
    @Test
    void testA()
    {
        System.out.println("A");
    }

    @Order(1)
    @Test
    void testB()
    {

        System.out.println("B");
    }

    @Order(3)
    @Test
    void testC()
    {
        System.out.println("C");
    }

    @Order(4)
    @Test
    void testD()
    {

        System.out.println("D");
    }
}
