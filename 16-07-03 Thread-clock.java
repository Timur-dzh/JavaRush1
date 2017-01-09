package com.javarush.test.level16.lesson07.task03;

/* Big Ben clock
1. ���������, ��� ������ ���������.
2. �������� ������ ������ printTime ���, ����� ������ ������� ���������� ����� ������� � �������������� � ������������
������:
� �. ������ ������ 23:59:58!
� �. ������ ������ 23:59:59!
� �. ������ ������ �������!
� �. ������ ������ 0:0:1!
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("������", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                
                while (!isStopped) {
                    
                    printTime();
                  
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
           
            if (seconds < 59) 
            {
              seconds++;
            } else { seconds = 0;
                
                    if(minutes < 59)
                     {
                      minutes++;
                      } else {minutes  = 0;
                    
                            if (hours<23)
                                {
                                  hours++;
                                   }
                                  else {hours = 0;}
                              }
                    }
            Thread.sleep(1000);
           //add your code here - ������ ��� ���

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("� �. %s ������ �������!", cityName));
            } else {
                System.out.println(String.format("� �. %s ������ %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
