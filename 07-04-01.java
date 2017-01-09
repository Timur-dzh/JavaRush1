package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ������������ ����� ������� �� 20 �����
1. � ������ initializeArray():
1.1. �������� ������ �� 20 �����
1.2. �������� � ������� 20 ����� � ��������� ��� ������
2. ����� max(int[] array) ������ �������� ������������ ����� �� ��������� �������
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] arr = new int[20];
      for (int i =0; i< arr.length; i++)
      {
          arr[i] = Integer.parseInt(br.readLine());
      }//��������������� (�������� � ���������) ������ ���
        return arr;
    }

    public static int max(int[] array) {
       
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
             if (array[i] > max) 
                  max = array[i];
        }

      
        return max;
    }
}
