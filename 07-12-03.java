package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ћаксимальное и минимальное числа в массиве
—оздать массив на 20 чисел. «аполнить его числами с клавиатуры. Ќайти максимальное и минимальное числа в массиве.
¬ывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> list = new ArrayList<Integer>();
        int  maximum;
        int  minimum;

        for (int i = 0; i <20 ; i++)
        {
            list.add(Integer.parseInt(r.readLine()));
        }
        maximum = list.get(0);
        minimum = list.get(0);
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            if (maximum<list.get(i)) maximum=list.get(i);
            if (minimum>list.get(i)) minimum=list.get(i);
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
