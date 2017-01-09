package com.javarush.test.level16.lesson03.task04;

/* ����� ����-������
1. ������� ���� - ����� public static SpecialThread - �� ��������� ���������� Runnable
2. SpecialThread ������ �������� � ������� ���� ����-�����.
���������: main thread ��� ������� � ������� ���� ����-�����.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
            System.out.println(e);
        }
    }
    public static class SpecialThread implements Runnable
{
    public void run() {
      for (StackTraceElement e : Thread.currentThread().getStackTrace())
      {
            System.out.println(e);
        }
    }
}
}