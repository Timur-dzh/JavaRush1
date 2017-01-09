package com.javarush.test.level13.lesson11.home03;
import java.io.*;
/* ������ �����
1. ������� � ������� ��� �����.
2. ������� � �������(�� �����) ���������� �����.
3. �� ������ ���������� �������. ������� ����� ������ � ����� � ����� ����� � ����������.
*/

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String fileName;
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
      // System.out.print("������� ��� �����:");
        fileName = reader.readLine();

        InputStream in = new FileInputStream(fileName);


        while (in.available() > 0)
        {
            System.out.print((char)in.read());
        }

        in.close(); //��������� ������
        reader.close();

    }
}
