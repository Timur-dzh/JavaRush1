package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ќдин большой массив и два маленьких
1. —оздать массив на 20 чисел.
2. ¬вести в него значени¤ с клавиатуры.
3. —оздать два массива на 10 чисел каждый.
4. —копировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. ¬ывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    int[] a = new int[20];
   int[] b = new int[10]; //напишите тут ваш код
    int[] c = new int[10];
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (int i = 0 ; i<20; i++) {a[i] = Integer.parseInt(br.readLine());}
for (int i = 0 ; i<10; i++) {b[i] = a[i];}
for (int i = 10 ; i<20; i++) {c[i-10] = a[i];}
for (int i = 0 ; i<10; i++) System.out.println(c[i]);
    
}
}
