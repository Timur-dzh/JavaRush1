package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������ �� ����� � �������� �������
1. ������� ������ �� 10 �����.
2. ������ � ���������� 10 ����� � �������� �� � ������.
3. ����������� �������� ������� � �������� �������.
4. ������� ��������� �� �����, ������ �������� �������� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    int[] a = new int[10];
   int[] b = new int[10]; //�������� ��� ��� ���
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (int i = 0 ; i<10; i++) {a[i] = Integer.parseInt(br.readLine());}
for (int i = 0 ; i<10; i++) {b[i] = a[9-i];}
for (int i = 0 ; i<10; i++) System.out.println(b[i]);
    
}
}
