package com.javarush.test.level12.lesson09.task05;

/* ����� Human � ���������� Run, Swim
������ public ����� Human(�������) �  public ���������� Run(������/������), Swim(�������).
������ � ������ ��������� �� ������ ������.
������ ��� ���������� ������ Human, �� �� �������� ������.
������ ����� Human �����������.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

 public interface Run
  {
      void run();
  }
 public interface Swim
  {
      void swim();
  }//add public interfaces and public class here - ������ public ���������� � public ����� ���
public abstract  class  Human implements Run, Swim
  {
     
      public  abstract  void run();
    
      public abstract  void swim();
  }
  
}
