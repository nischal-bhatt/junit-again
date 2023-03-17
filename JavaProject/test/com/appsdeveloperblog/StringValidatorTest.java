package com.appsdeveloperblog;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @DisplayName("hi")
    @ParameterizedTest
    @MethodSource("balle")
    void intsub(String x, boolean a)
    {
           assertEquals(stringValidator.validateString(x),a);
    }

    private static Stream<Arguments> balle()
    {

        return Stream.of(
              Arguments.of("nish",false),
              Arguments.of("chanikyarc",true)
        );

    }




}