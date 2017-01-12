package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        String fileName2 = sc.nextLine();
        sc.close();
        try {
            Scanner in = new Scanner(new FileInputStream(fileName1));
            in.useLocale(Locale.ENGLISH);
            ArrayList<Float> list = new ArrayList<Float>();
            while (in.hasNext()) {
                list.add(in.nextFloat());
            }
            in.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
            for (float number: list) {
                writer.write(Math.round(number) + " ");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
/*    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String f1 = br.readLine();
        String f2 = br.readLine();

        br.close();

        FileInputStream file1 = new FileInputStream(f1);
        FileOutputStream file2 = new FileOutputStream(f2);

        while (file1.available() > 0)
        {
            int buff = file1.read();

            if (buff == 32)
            {
                list.add(word);
                word = "";
            } else word = word + (char) buff;


        }

        list.add(word);

        for (String entry : list)
        {


            int i;
            i = Math.round(Float.parseFloat(entry));
            System.out.println(i);

            if (i < 0)file2.write(45);
            file2.write(48 + Math.abs(i));

            file2.write(32);
        }
        file1.close();
        file2.close();
  */  }
}
