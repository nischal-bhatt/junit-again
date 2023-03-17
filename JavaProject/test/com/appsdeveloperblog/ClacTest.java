package com.appsdeveloperblog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClacTest {

    Calculator calculator;

    @BeforeEach
    void beforeEach()
    {
        calculator = new Calculator();
    }

    @RepeatedTest(3)
    void xxx(RepetitionInfo repetitionInfo, TestInfo testInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        int res =calculator.integerSubtraction(2,3);
        System.out.println(testInfo.getDisplayName());
        assertEquals(-1,res);

    }
}
