package com.javarush.test.level07.lesson12.home05;

/* ���
�������� ���������, ������� ���� �������� ������ � 30 �� 0, � � ����� ������� �� ����� ����� ����!�. ��������� ������ ��������� ����� 10 ��� � �������. ��� ���� ����� �������� � ��������� ��������, ������������ ��������:
Thread.sleep(100); //�������� �� ���� ������� �������.
������:
30
29
�
1
0
���!
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i=30; i>=0; i--)
        {
            System.out.println(i);

           Thread.sleep(100);
        }

        System.out.println("���!");
    }
}
