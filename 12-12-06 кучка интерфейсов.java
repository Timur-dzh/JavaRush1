package com.javarush.test.level12.lesson12.home06;

/* Fly, Run, Climb ��� ������� Cat, Dog, Tiger, Duck
1. ������ ������ Solution ������ ��������� public interface Fly(������) � ������� void fly().
2. ������ ������ Solution ������ ��������� public interface Climb(������ �� ��������) � ������� void climb().
3. ������ ������ Solution ������ ��������� public interface Run(������) � ������� void run().
4. ������� ���������, ����� ������ ���������� ����� �������� ��� ������� ������.
5. ������ ���������� ������� Cat(���), Dog(������), Tiger(����), Duck(����).
*/

public class Solution
{
    public interface Fly
    {
        void fly();
    }

    public interface Climb
    {
        void climb();
    }

    public interface Run{
        void run();
    }
    public class Cat implements Run, Climb

    {
        public  void run(){};
        public  void climb(){};
    }

    public class Dog implements Run
    {
        public void run(){};
    }

    public class Tiger extends Cat
    {
        public  void run(){};
        public  void climb(){};
    }

    public class Duck implements Fly, Run
    {
        public  void run(){};
        public  void fly(){};
    }
}
