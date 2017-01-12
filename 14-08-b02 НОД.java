package com.javarush.test.level14.lesson08.bonus02;
import java.io.*;
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int key1 = Integer.parseInt(reader.readLine());
        int key2 = Integer.parseInt(reader.readLine());

        while (key2!=0)
        {
            int tmp =key1%key2;
            key1 = key2;
            key2 = tmp;
        }

                System.out.println(key1);
    }


}