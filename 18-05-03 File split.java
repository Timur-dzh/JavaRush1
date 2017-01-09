package com.javarush.test.level18.lesson05.task03;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
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
