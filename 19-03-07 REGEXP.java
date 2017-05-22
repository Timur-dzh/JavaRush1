package com.javarush.task.task19.task1907;

/*
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.

Требования:
1.?Программа должна считывать имя файла с консоли (используй BufferedReader).
2.?BufferedReader для считывания данных с консоли должен быть закрыт.
3.?Программа должна считывать содержимое файла (используй FileReader c конструктором String).
4.?Поток чтения из файла (FileReader) должен быть закрыт.
5.?Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
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
