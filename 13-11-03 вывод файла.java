package com.javarush.test.level13.lesson11.home03;
import java.io.*;
/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String fileName;
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
      // System.out.print("Введите имя файла:");
        fileName = reader.readLine();

        InputStream in = new FileInputStream(fileName);


        while (in.available() > 0)
        {
            System.out.print((char)in.read());
        }

        in.close(); //закрываем потоки
        reader.close();

    }
}
