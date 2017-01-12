package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ”дали последнюю строку и вставь еЄ в начало
1. —оздай список строк.
2. ƒобавь в него 5 строчек с клавиатуры.
3. ”дали последнюю строку и вставь еЄ в начало. ѕовторить 13 раз.
4. »спользу¤ цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
      ArrayList<String> list = new ArrayList<String>();
     for (int i= 0; i<5; i++)
     {
         list.add(0, br.readLine());
         
     } 
for (int i=0; i<13; i++)
{
    s= list.get(4);
    list.remove(4);
    list.add(0, s);
}
for (int i = 0; i<5; i++) System.out.println(list.get(4-i));
    }
}
