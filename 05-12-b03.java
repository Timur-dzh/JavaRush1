package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int num = 0;
        int N = Integer.parseInt(br.readLine());// N
        if (N > 0)
        {
            maximum = Integer.parseInt(br.readLine());
            for (int i = 1; i < N; i++)
            {
                num = Integer.parseInt(br.readLine());
                maximum = maximum > num ? maximum : num;
            }


            System.out.println(maximum);
        }
    }
  //  public static int max(int a, int b)
  // {
   //     return a > b ? a : b;
  //  }
}
