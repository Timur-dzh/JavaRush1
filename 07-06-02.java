package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ����� ������� ������
1. ������ ������ �����.
2. ������ � ���������� 5 ����� � ������ � ������.
3. ��������� ����, ����� ����� ������� ������ � ������.
4. ������ ��������� ������ �� �����.
5. ���� ����� ����� ���������, ������ ������ � ����� ������.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int max=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<String>();
       
       for(int i = 0; i<5; i++) 
       
       {
           list.add(br.readLine());
           if (max < list.get(i).length())  max=list.get(i).length()  ;
       }
    
	for (int i = 0 ; i <list.size(); i++)
	{
		if (list.get(i).length()==max) System.out.println(list.get(i));
	}

    }
}
