package com.javarush.test.level09.lesson02.task05;
import java.util.*;
/* ����� ������ ���������� ��������� � ������� ��� ����-������
�������� �����, ������� ���������� ��������� � ������� ��� ���� ������ � ���������� ������� � ��� (���������� ��������� � ������). ��� �� ����� ����� ������ �������� �� �����.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        int i =0;
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
    {
      
       i++;
    }
         System.out.println(i);
        return  i;

    }
}
