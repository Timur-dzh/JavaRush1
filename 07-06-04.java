package com.javarush.test.level07.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 ������� � ������ ������
1. ������ ������ ����� � ������ main.
2. ������ � ���� 10 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
      ArrayList<String> list = new ArrayList<String>();
     for (int i= 0; i<10; i++)
     {
         list.add(0, br.readLine());
         
     } 
for (int i =0; i<10; i ++) System.out.println(list.get(i));
    }
}
