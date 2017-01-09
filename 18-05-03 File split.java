package com.javarush.test.level18.lesson05.task03;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
/* ���������� �����
������� � ������� ��� ����� �����: ����1, ����2, ����3.
��������� ����1 �� ���������� ��������:
������ �������� ���� �������� � ����2, ������ �������� ���� �������� � ����3.
���� � ����1 ���������� ���� ��������, �� ����2 ������ ��������� ������� �����.
������� ������. �� ������������ try-with-resources
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2, file3;
        file1 = reader.readLine();
        file2 =reader.readLine();
        file3 = reader.readLine();


        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream out1 = new FileOutputStream(file2);
        FileOutputStream out2 = new FileOutputStream(file3);
       if (inputStream.available()>0)
       {
           byte[] buff1;
           if (inputStream.available()%2 !=0){
            buff1 = new byte[inputStream.available()/2+1];}
           else  buff1 = new byte[inputStream.available()/2];
           int count = inputStream.read(buff1);
           out1.write(buff1, 0, count);
           byte[] buff2 = new byte[inputStream.available()];
            count = inputStream.read(buff2);
           out2.write(buff2,0,count);
       }
        reader.close();
        inputStream.close();
        out1.close();
        out2.close();
    }
}
