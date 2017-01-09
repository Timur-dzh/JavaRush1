package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.io.*;
/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     String fileName;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     fileName = reader.readLine();
     FileInputStream inputStream = new FileInputStream(fileName);
 int min = 2147483647;

 while (inputStream.available() > 0) //пока остались непрочитанные байты
 {
  int data = inputStream.read(); //прочитать очередной байт
  if (min > data) min= data; //добавить его к общей сумме 
 }
 inputStream.close(); // закрываем поток

 System.out.println(min); //выводим сумму на экран. 
    }
}
