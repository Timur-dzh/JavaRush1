package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* ���� � ����������� �����
1. ������������� ��������� Constants.FILE_NAME ������ ����� � ����� � �������, ������� �������� ��������� �����.
2. � ����������� ����� ������ �� ����� � ������ Constants.FILE_NAME ��� ������ � ������ �� ��-����������� � List lines.
3. ������ ����� ����� ������� close().
*/

public class Solution  {
    public static List<String> lines = new ArrayList<String>();
static{
    try
    {

        BufferedReader reader = new BufferedReader(new FileReader(Constants.FILE_NAME));
        String line = null;
        while ((line=reader.readLine())!=null) {lines.add(line);}
        reader.close();

    }
    catch (Exception e){};
}
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
