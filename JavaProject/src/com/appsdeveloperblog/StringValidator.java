package com.appsdeveloperblog;

public class StringValidator {

    public boolean validateString(String x)
    {

        if (x.length() == 10)
        {
            return true;
        }else{
            return false;
        }

    }

    public int exceptionMethod(String name) throws Exception {
        if (name.equals("nish"))
        {
            throw new Exception("hey");
        }

        return 3;
    }
}
