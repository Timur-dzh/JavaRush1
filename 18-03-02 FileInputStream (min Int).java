package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.io.*;
/* ����������� ����
������ � ������� ��� �����
����� ����������� ���� � �����, ������� ��� �� �����.
������� ����� �����-������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     String fileName;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     fileName = reader.readLine();
     FileInputStream inputStream = new FileInputStream(fileName);
 int min = 2147483647;

 while (inputStream.available() > 0) //���� �������� ������������� �����
 {
  int data = inputStream.read(); //��������� ��������� ����
  if (min > data) min= data; //�������� ��� � ����� ����� 
 }
 inputStream.close(); // ��������� �����

 System.out.println(min); //������� ����� �� �����. 
    }
}
