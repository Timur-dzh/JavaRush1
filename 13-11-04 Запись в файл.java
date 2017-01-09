package com.javarush.test.level13.lesson11.home04;
import  java.io.*;
/* ������ � ����
1. �������� � ������� ��� �����.
2. ��������� ������ � �������, ���� ������������ �� ������ ������ "exit".
3. ������� ��������� ��� ��������� ������ � ����, ������ ������� � ����� �������.
*/

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String fileName;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();

        OutputStream outStream = new FileOutputStream(fileName);

        String data;
        while (true)
        {
            data = reader.readLine();

            data = data +"\n";

            for (int i = 0; i < data.length(); i++)
            {
                outStream.write((int) data.charAt(i));
            }
            if (data.equals("exit\n") ) break;
        }
        outStream.close();
        reader.close();


    }
}
