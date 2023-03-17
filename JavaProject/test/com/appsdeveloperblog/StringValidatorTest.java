package com.appsdeveloperblog;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    StringValidator stringValidator;

    @BeforeAll
    static void doSomething() {
        // look at this error closely - stringValidator = new StringValidator();
        System.out.println("hi all before");
    }

    @BeforeEach
    void createObject() {
        stringValidator = new StringValidator();
        System.out.println("object created");
    }

    @Test
    void test() {
        boolean returnVal = stringValidator.validateString("helloworld");
        assertTrue(returnVal);
    }

    @Test
    void test3() {
        boolean returnVal = stringValidator.validateString("hello");
        assertFalse(returnVal);
    }

    @Disabled
    @Test
    void test2() {
        fail("failed it");
    }

    @Test
    void assertionMethod() throws Exception {

      Exception exception =  assertThrows(Exception.class, () -> {
           stringValidator.exceptionMethod("nish");
       })  ;

      assertEquals("hey",exception.getMessage());
    }


}