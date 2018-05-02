package com.example.mylib;

/**
 * Created by siddharth on 5/2/2018.
 */

public class Mymath {

    public static int Plus(int a , int b)
    {
        return a+b;

    }

    public  static  int Minus(int a , int b)

    {
        return a-b;
    }
    public static int Times(int a , int b)
    {
        return a*b;
    }

    public static float Div(int a , int b)
    {
        if(b == 0)

        throw new IllegalArgumentException("Div by zero error");


        else
            return a/b;
    }
}
