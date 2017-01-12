package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* —лово Ђименної
1. —оздай список из слов Ђмамаї, Ђмылаї, Ђрамуї.
2. ѕосле каждого слова вставь в список строку, содержащую слово Ђименної.
3. »спользу¤ цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        
        for (int i = list.size(); i>0; i--) list.add(i, "именно");//напишите тут ваш код
       
        for (int i = 0; i< list.size(); i ++) System.out.println(list.get(i));

    }
}
