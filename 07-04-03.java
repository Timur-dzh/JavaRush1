package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. —оздать массив на 10 строк.
2. —оздать массив на 10 чисел.
3. ¬вести с клавиатуры 10 строк, заполнить ими массив строк.
4. ¬ каждую ¤чейку массива чисел записать длину строки из массива строк, индекс/номер ¤чейки которой совпадает с текущим индексом из массива чисел. ¬ывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      
       int[] nums = new int[10];
       String[] arr = new String[10];
         for (int i =0; i< 10; i++)
      {
          arr[i] = br.readLine();
          nums[i] = arr[i].length();
          
      } //напишите тут ваш код
for (int i = 0 ; i<10; i++) System.out.println(nums[i]);
    }
}
