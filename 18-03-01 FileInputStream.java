package com.javarush.test.level18.lesson03.task01;

import java.io.FileInputStream;
import java.io.*;
/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
 int max = 0;

 while (inputStream.available() > 0) //пока остались непрочитанные байты
 {
  int data = inputStream.read(); //прочитать очередной байт
  if (max < data) max= data; //добавить его к общей сумме 
 }
 inputStream.close(); // закрываем поток

 System.out.println(max); //выводим сумму на экран. 
}
    }

