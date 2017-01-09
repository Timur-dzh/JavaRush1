package com.javarush.test.level16.lesson03.task05;

import java.util.Date;

/* ��������� � ������?
1. �������� ����� Violin ���, ���� �� ���� ������ ��� ����. ����������� ��������� MusicalInstrument
2. �������� ����������� ����� � ���� Violin. ���������� ������ ���� ���������:
2.1. ������ ����� ������ ���� - ����� startPlaying().
2.2. ������� 1 ������� - ����� sleepNSeconds(int n), ��� n - ���������� ������.
2.3. ������ ����� ��������� ���� - ����� stopPlaying().
2.4. ������ �� ������� ����������������� ���� � �������������. ������ "Playing 1002 ms".
*/

public class Solution {
    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }
        
        public void run()
        {
            Date d1 = startPlaying();
            sleepNSeconds(1);
            Date d2 = stopPlaying();
            
            
            System.out.println("Playing " + (d2.getTime()-d1.getTime()) +" ms" );
        }
    }

    public static int delay = 1000;

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }
}
