package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 ��������� ������� � ������
1. ������ ������ �����.
2. ������ � ���� 5 ��������� �������.
3. ������ ��� ������ �� �����.
4. ��������� ���� ������ ��� ���������� �� �����, ������ �������� � ����� ������.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("dsa sd");
        list.add("fddf");
        list.add("sdf ");
        list.add("sdfsdf");
        
        for (int i = 0; i<list.size(); i++) System.out.println(list.get(i));//�������� ��� ��� ���

    }
}
