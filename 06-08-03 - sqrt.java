package com.javarush.test.level06.lesson08.task03;

/* ����� Util
����������� ����������� ����� double getDistance(x1, y1, x2, y2). �� ������ ��������� ���������� ����� �������.
��������� ����� double Math.sqrt(double a), ������� ��������� ���������� ������ ����������� ���������
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        double dist;
        double x;
        double y;
        x= x2-x1;
        y= y2-y1;
        dist = Math.sqrt(x * x + y * y);
        return dist;//�������� ��� ��� ���

    }
}
