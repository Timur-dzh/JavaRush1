package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* ����� �������
1. ������ ������ �� ���� �����, �����, �����.
2. ����� ������� ����� ������ � ������ ������, ���������� ����� �������.
3. ��������� ���� for ������� ��������� �� �����, ������ ������� ������ � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("����");
        list.add("����");
        list.add("����");
        
        for (int i = list.size(); i>0; i--) list.add(i, "������");//�������� ��� ��� ���
       
        for (int i = 0; i< list.size(); i ++) System.out.println(list.get(i));

    }
}
