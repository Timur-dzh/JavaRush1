package com.javarush.test.level05.lesson12.home05;

import java.io.*;
import java.io.InputStreamReader;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int i = 0;
        String s = null;

        while (s!="sum"){
            s = br.readLine();
            if(s.equals("сумма")){
                break;
            }
                i = Integer.parseInt(s);
                sum += i;

        }

        System.out.println(sum);
    }
    //напишите тут ваш код
}
