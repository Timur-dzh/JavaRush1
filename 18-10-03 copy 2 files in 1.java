package com.javarush.test.level18.lesson10.home03;
import java.io.*;
/* ��� � �����
������� � ������� 3 ����� �����
�������� � ������ ���� ����������� ������� �����, � ����� �������� � ������ ���� ���������� �������� �����
������� ������. �� ������������ try-with-resources
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1, file2, file3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        file1 = br.readLine();
        file2 = br.readLine();
        file3 = br.readLine();

        FileOutputStream f1 = new FileOutputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        FileInputStream f3 = new FileInputStream(file3);

        if (f2.available() > 0) {
            //������ ���� ���� ����� ������
            byte[] buffer = new byte[f2.available()];
            int count = f2.read(buffer);
            f1.write(buffer, 0, count);
        }
        f2.close();

        if (f3.available() > 0) {
            //������ ���� ���� ����� ������
            byte[] buffer = new byte[f3.available()];
            int count = f3.read(buffer);
            f1.write(buffer, 0, count);
        }
    f3.close();
        f1.close();
        br.close();
    }
}
