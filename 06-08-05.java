package com.javarush.test.level06.lesson08.task05;

/* ����� StringHelper
C������ ����� StringHelper, � �������� ����� 2 ����������� ������:
String multiply(String s, int count) � ���������� ������ ����������� count ���.
String multiply(String s) � ���������� ������ ����������� 5 ���.
������:
����� -> �������������������������
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
       for (int i = 0; i<5; i++) result += s; //�������� ��� ��� ���
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i<count; i++) result += s;  //�������� ��� ��� ���
        return result;
    }
}
