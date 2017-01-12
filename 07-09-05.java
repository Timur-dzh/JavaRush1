package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ”двой слова
1. ¬веди с клавиатуры 10 слов в список строк.
2. ћетод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. »спользу¤ цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<10; i++) list.add(br.readLine());//—читать строки с консоли и объ¤вить ArrayList list тут

        ArrayList<String> result = doubleValues(list);

       for (int i=0; i<result.size(); i++) System.out.println(result.get(i)); //¬ывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i=0; i < list.size(); i+=2) list.add(i, list.get(i));//напишите тут ваш код
        return list;
    }
}