package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ��� �������
1. ����� � ���������� 20 �����, ������� �� � ������ � ����������� �� ��� ������ �������:
����� ������� �� 3 (x%3==0), ������� �� 2 (x%2==0) � ��� ���������.
�����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
2. ����� printList ������ �������� �� ����� ��� �������� ������ � ����� ������.
3. ��������� ����� printList ������ ��� ��� ������ �� �����. ������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�������� ��� ��� ���
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        ArrayList<Integer> l0 = new ArrayList<Integer>();
        for (int i = 0; i<20; i++) 
        {
         l1.add(Integer.parseInt(br.readLine()));   
        }

        for (int i = 0; i<l1.size(); i++)
        {
            if (l1.get(i)%2==0) l2.add(l1.get(i));
            if (l1.get(i)%3==0) l3.add(l1.get(i));
            if (l1.get(i)%2!=0 && l1.get(i)%3!=0) l0.add(l1.get(i));
        }

printList(l3);
printList(l2);
printList(l0);
    }

    public static void printList(List<Integer> list)
    {
        for (int i=0; i < list.size();i++) System.out.println(list.get(i));//�������� ��� ��� ���
    }
}
