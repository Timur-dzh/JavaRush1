package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ���� ������� ������ � ��� ���������
1. ������� ������ �� 20 �����.
2. ������ � ���� �������� � ����������.
3. ������� ��� ������� �� 10 ����� ������.
4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������, ������ �������� �� ������ ���������.
5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    int[] a = new int[20];
   int[] b = new int[10]; //�������� ��� ��� ���
    int[] c = new int[10];
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (int i = 0 ; i<20; i++) {a[i] = Integer.parseInt(br.readLine());}
for (int i = 0 ; i<10; i++) {b[i] = a[i];}
for (int i = 10 ; i<20; i++) {c[i-10] = a[i];}
for (int i = 0 ; i<10; i++) System.out.println(c[i]);
    
}
}
