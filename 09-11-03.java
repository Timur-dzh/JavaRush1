package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ћетод в try..catch
¬водить с клавиатуры числа.  од по чтению чисел с клавиатуры вынести в отдельный метод readData.
ќбернуть все тело (весь код внутри readData, кроме объ¤влени¤ списка, где будут хранитьс¤ числа и BufferedReader - а) этого метода в try..catch.
≈сли пользователь ввЄл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
„исла выводить с новой строки сохран¤¤ пор¤док ввода.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData()
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            while (true)
            {
                nums.add(Integer.parseInt(br.readLine()));
            }//напишите тут ваш код
        }
catch (Exception e)
            {
                for (int i =0; i<nums.size();i++)
                {
                    System.out.println(nums.get(i));
                }
            }

    }
}
