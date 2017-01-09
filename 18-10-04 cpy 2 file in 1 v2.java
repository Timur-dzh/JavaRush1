package com.javarush.test.level18.lesson10.home04;
import java.io.*;
/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static void main(String[] args) throws  IOException{

        String file1, file2 ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        file1 = br.readLine();
        file2 = br.readLine();
        FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        byte[] buffer1;
        byte[] buffer2;

            //читаем весь файл одним куском
            buffer1 = new byte[f1.available()];
            int count1 = f1.read(buffer1);
            buffer2 = new byte[f2.available()];
            int count2 = f2.read(buffer2);

            f1.close();
        FileOutputStream f3 = new FileOutputStream(file1);

            f3.write(buffer2, 0, count2);
            f3.write(buffer1, 0,count1);
        f2.close();
        f3.close();
        br.close();
        }}
