package com.javarush.test.level05.lesson12.home05;

import java.io.*;
import java.io.InputStreamReader;
/* ������� � ���������� ����� � ������� �� �����
������� � ���������� ����� � ������� �� �����, ���� ������������ �� ����� ����� ������. ������� �� ����� ���������� �����.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int i = 0;
        String s = null;

        while (s!="sum")
        {
            s = br.readLine();
            if(s.equals("�����"))
            {
                break;
            }
                i = Integer.parseInt(s);
                sum += i;

        }

        System.out.println(sum);
    }
    //�������� ��� ��� ���
}

