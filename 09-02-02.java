package com.javarush.test.level09.lesson02.task02;
import java.io.*;
/* » снова StackTrace
Ќаписать п€ть методов, которые вызывают друг друга.  аждый метод должен возвращать им€ метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        //напишите тут ваш код
return   Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
return   Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
return   Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
return   Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5()
    {
        
        
   return   Thread.currentThread().getStackTrace()[2].getMethodName();//напишите тут ваш код

    }
}
