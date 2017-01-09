package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

/* ���������� ����
������ � ������� ��� �����
������� ��� ����� �� �����.
�� �������� ���������� - ������������� �� �� ����-���� � ������������ �������.
������� �� �����
������� ����� �����-������
������ ���� �������� �����
44 83 44
������ ������
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        TreeSet<Integer> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));



        while(in.available() > 0){
            set.add(in.read());
        }

        for(int i : set){
            System.out.println(i);
        }

        reader.close();
        in.close();
    }
}