package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* ������ �� ����������
�������� ���������, �������:
1. ������ � ������� ����� N > 0
2. ����� ������ N ����� � �������
3. ������� �� ����� ������������ �� ��������� N �����.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int num = 0;
        int N = Integer.parseInt(br.readLine());// N
        if (N > 0)
        {
            maximum = Integer.parseInt(br.readLine());
            for (int i = 1; i < N; i++)
            {
                num = Integer.parseInt(br.readLine());
                maximum = maximum > num ? maximum : num;
            }


            System.out.println(maximum);
        }
    }
  //  public static int max(int a, int b)
  // {
   //     return a > b ? a : b;
  //  }
}
