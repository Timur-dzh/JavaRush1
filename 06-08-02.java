package com.javarush.test.level06.lesson08.task02;

/* ����������� ������: int getCatCount() � setCatCount(int)
��������  � ������ Cat ��� ����������� ������: int getCatCount() � setCatCount(int), � ������� ������� ����� ��������/�������� ���������� ����� (���������� catCount)
*/

public class Cat
{
    private static int catCount = 0;

    public Cat()
    {
        catCount++;
    }

    public static int getCatCount()
    {
        return catCount;//�������� ��� ��� ���

    }

    public static void setCatCount(int catCount)
    {
        Cat.catCount=catCount;//�������� ��� ��� ���

    }
}
