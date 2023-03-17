package com.appsdeveloperblog;

public class Calculator {

    public double division(double divident, double divisor) throws Exception {

        if (divisor == 0)
        {
            throw new Exception("divisor cannot be zero");
        }

        return divident / divisor;
    }

    public int integerSubtraction(int minuend, int subtrahend)
    {
        return minuend - subtrahend;
    }
}
