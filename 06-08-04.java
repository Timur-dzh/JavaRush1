package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ����� ConsoleReader
������� ����� ConsoleReader, � �������� ����� 4 ����������� ������:
String readString() � ������ � ���������� ������
int readInt() � ������ � ���������� �����
double readDouble() � ������ � ���������� ������� �����
boolean readBoolean() � ������ � ���������� ������ "true" ��� "false" � ���������� ��������������� ���������� ���������� true ��� false
��������: ���������� ���������� ��� ������ ������ � ������� (BufferedReader ��� Scanner) ������ ������� ������
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine()); //�������� ��� ��� ���

    }

    public static double readDouble() throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//�������� ��� ��� ���
return Double.parseDouble(reader.readLine());
    }

    public static boolean readBoolean() throws Exception
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(reader.readLine()); //�������� ��� ��� ���
    }
}
