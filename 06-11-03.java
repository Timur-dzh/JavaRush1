package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* ������ �� ����������
������: �������� ���������, ������� ������ � ���������� 5 ����� � ������� �� � ������������ �������.
������ �����:
3
2
15
6
17
������ ������:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            nums.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(nums);
        for (int i = 0; i <nums.size() ; i++)
        {
            System.out.println(nums.get(i));
        }
        //�������� ��� ��� ���
    }
}