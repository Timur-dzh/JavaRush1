package com.javarush.test.level06.lesson05.task03;

/* �� 50 000 �������� Cat � Dog
������� � ����� �� 50 000 �������� Cat � Dog. (Java-������ ������ ������ ���������� ��������������, � ����� finalize ���� ��� �� ���������).
*/

public class Solution
{
    public static void main(String[] args)
    {
      for (int i=0; i<50000; i++) {
      Cat cat1 = new Cat();
      Dog dog2 = new Dog();//�������� ��� ��� ���
      }

    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}