package com.javarush.test.level06.lesson11.bonus01;
import java.io.*;
import java.io.InputStreamReader;
/* ����� ��������� ���������, ����� ��������������� � ��������
������: ��������� ������ ��� ����� � ���������� � ������� �� �������� � ���� �Max is 25�
*/

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String maxs = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(maxs + max);
    }

}
