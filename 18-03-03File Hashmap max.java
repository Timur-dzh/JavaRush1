package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.io.*;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        while (inputStream.available() > 0)
        {
            int data =  inputStream.read();
            if (hashMap.containsKey(data)) {hashMap.put(data, hashMap.get(data)+1); }
            else { hashMap.put(data,1);}
        }

        int max=-2147483648;
        for (int entry : hashMap.keySet())
        {
            if ( hashMap.get(entry)>max) max= hashMap.get(entry);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
        {
            if ( entry.getValue() == max) System.out.print(entry.getKey() + " ");
        }


       
        inputStream.close(); // закрываем поток


    }
}
