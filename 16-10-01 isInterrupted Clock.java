package com.javarush.test.level16.lesson10.task02;

/* ������ �� ������
1. ���������, ��� ������ ���������.
2. �������� ������ ������ run ���, ����� ������ ������� ����� ������
��������� ������ ������� � countSeconds �� 1, � ����� ����� [����!] (�� �������).
3. ���� ���� �������� 3.5 ������� ��� �����, ������ �� ������� interrupt � ������ ���� ������ � ������� ����� [��������!].
������ ��� countSeconds=4 : [4 3 2 1 ��������!]
4. ���� ���� �������� ����� 3.5 ������, ��� ������ ����������� ����.
������ ��� countSeconds=3 : [3 2 1 ����!]
PS: ����� sleep ����������� InterruptedException.
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
      
        Thread.sleep(3500);
        clock.interrupt();//add your code here - ������ ��� ���
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
         Thread current = Thread.currentThread();
         
          try {
              
              
              while (!current.isInterrupted())
                 {
                  System.out.print(countSeconds + " ");
                  
                  --countSeconds;
                  Thread.sleep(1000);
                  if (countSeconds <= 0) 
                  { System.out.print("����!");
                    current.interrupt();}
                    
                  }
              
                 }  
          catch(InterruptedException e){
              System.out.print("��������!");
              
          }
                
                
                
          //add your code here - ������ ��� ���
        }
    }
}
