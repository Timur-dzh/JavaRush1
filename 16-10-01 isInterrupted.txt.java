package com.javarush.test.level16.lesson10.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ������� �������
1. ������ ���������� ������ run � ���� Stopwatch (����������).
2. Stopwatch ������ ��������� ���������� ������, ������� ������ �� �������� ���� �� ����� ������.
3. ������ ���������� ������ � �������.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                 while (!currentThread().isInterrupted())
                {
                    Thread.sleep(1000);
                    seconds++;
                }  //add your code here - �������� ��� ���
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
