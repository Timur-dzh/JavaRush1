package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ����� � try..catch
������� � ���������� �����. ��� �� ������ ����� � ���������� ������� � ��������� ����� readData.
�������� ��� ���� (���� ��� ������ readData, ����� ���������� ������, ��� ����� ��������� ����� � BufferedReader - �) ����� ������ � try..catch.
���� ������������ ��� �����-�� �����, ������ ����� �����, �� ����� ������ ����������� ���������� � ������� �� ����� ��� ��������� ����� � �������� ����������.
����� �������� � ����� ������ �������� ������� �����.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData()
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            while (true)
            {
                nums.add(Integer.parseInt(br.readLine()));
            }//�������� ��� ��� ���
        }
catch (Exception e)
            {
                for (int i =0; i<nums.size();i++)
                {
                    System.out.println(nums.get(i));
                }
            }

    }
}
