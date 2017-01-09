package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ����� �����
1. ����� � ���������� 10 ���� � ������ �����.
2. ����� doubleValues ������ ��������� ����� �� �������� a,b,c -> a,a,b,b,c,c.
3. ��������� ���� for ������ ��������� �� �����, ������ �������� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<10; i++) list.add(br.readLine());//������� ������ � ������� � �������� ArrayList list ���

        ArrayList<String> result = doubleValues(list);

       for (int i=0; i<result.size(); i++) System.out.println(result.get(i)); //������� �� ����� result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i=0; i < list.size(); i+=2) list.add(i, list.get(i));//�������� ��� ��� ���
        return list;
    }
}