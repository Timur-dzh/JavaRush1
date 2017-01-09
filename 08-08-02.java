package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
      HashSet<Integer> nn = new HashSet<Integer>();
      nn.add(1);
       nn.add(2);
        nn.add(3);
         nn.add(4);
          nn.add(5);
           nn.add(6);
            nn.add(7);
             nn.add(8);
              nn.add(9);
               nn.add(10);
                nn.add(11);
                 nn.add(12);
                  nn.add(13);
                   nn.add(14);
                    nn.add(15);
                     nn.add(16);
                      nn.add(17);
                       nn.add(18);
                        nn.add(19);
                         nn.add(20);
                         return nn;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
         Iterator<Integer> iterator = set.iterator();//получение итератора для списка

    while (iterator.hasNext())      //проверка, есть ли ещё элементы   
    {
        //получение текущего элемента и переход на следующий
        Integer text = iterator.next();

        if(text > 10) iterator.remove();
    }
return set;
    } 
}
