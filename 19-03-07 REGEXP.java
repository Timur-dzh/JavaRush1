package com.javarush.task.task19.task1907;

/*
������� �����
������� � ������� ��� �����.
���� �������� �����, ����������� ������� ����������.
������� � ������� ���������� ���� �world�, ������� ����������� � �����.
������� ������.

����������:
1.?��������� ������ ��������� ��� ����� � ������� (��������� BufferedReader).
2.?BufferedReader ��� ���������� ������ � ������� ������ ���� ������.
3.?��������� ������ ��������� ���������� ����� (��������� FileReader c ������������� String).
4.?����� ������ �� ����� (FileReader) ������ ���� ������.
5.?��������� ������ �������� � ������� ���������� ���� "world", ������� ����������� � �����.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        String str = "";
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader f1 = new FileReader(br.readLine());

        while (f1.ready()) {

            str += String.valueOf((char) f1.read()).toLowerCase();
        }
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");

        String[] mas = str.split(" ");

        for (String x : mas) {
            x.trim();
            if (x.equals("world")) count++;
        }

        System.out.println(count);
        br.close();
        f1.close();

    }
}
