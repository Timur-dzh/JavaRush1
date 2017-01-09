package com.javarush.test.level13.lesson11.home04;
import  java.io.*;
/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
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
