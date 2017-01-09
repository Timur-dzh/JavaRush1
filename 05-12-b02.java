package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ����� �������� � ��������� ����� ����������������
������: ��������� ������ ��� ����� � ���������� � ������� ����������� �� ��� �� �����.
����� ������: ��������� ������ ���� ����� � ���������� � ������� ����������� �� ��� �� �����.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e)
    {
        return min(min(a,b), min(c,min(d,e)));
    }

}
