package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������ �� ������� � �������� �������
1. ������� ������ �� 10 �������.
2. ������ � ���������� 8 ������� � ��������� �� � ������.
3. ������� ���������� ����� ������� (10 ���������) �� ����� � �������� �������. ������ ������� - � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String[] arr = new String[10];
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        for (int i =0; i< 8; i++)
      {
          arr[i] = br.readLine();
      }
    
for (int i = 10 ;i>0; i--) System.out.println(arr[i-1]);
    }
}