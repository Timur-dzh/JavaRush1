package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 �������
1. ������� ������ �� 10 �����.
2. ������� ������ �� 10 �����.
3. ������ � ���������� 10 �����, ��������� ��� ������ �����.
4. � ������ ������ ������� ����� �������� ����� ������ �� ������� �����, ������/����� ������ ������� ��������� � ������� �������� �� ������� �����. ������� ���������� ������� ����� �� �����, ������ �������� �������� � ����� ������.
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
          
      } //�������� ��� ��� ���
for (int i = 0 ; i<10; i++) System.out.println(nums[i]);
    }
}
