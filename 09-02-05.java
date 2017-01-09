package com.javarush.test.level09.lesson02.task05;
import java.util.*;
/* ћетод должен возвращать результат Ц глубину его стек-трейса
Ќаписать метод, который возвращает результат Ц глубину его стек трейса Ц количество методов в нем (количество элементов в списке). Ёто же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        int i =0;
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
    {
      
       i++;
    }
         System.out.println(i);
        return  i;

    }
}
