package com.javarush.test.level06.lesson11.home01;

/* ����� Cat � ����������� ���������� catCount
� ������ Cat ������ ����������� ���������� public int catCount.
������ ����������� [public Cat()]. ����� ��� ������ �������� ���� (������ ������� Cat) ����������� ����������
catCount ������������� �� 1. ������� 10 �������� Cat � ������� �������� ���������� catCount �� �����.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //C����� ��� 10 �������� Cat
Cat cat1 = new Cat();
Cat cat2 = new Cat();
Cat cat3 = new Cat();
Cat cat4 = new Cat();
Cat cat5 = new Cat();
Cat cat6 = new Cat();
Cat cat7 = new Cat();
Cat cat8 = new Cat();
Cat cat9 = new Cat();
Cat cat10 = new Cat();

        System.out.println(Cat.catCount); //������ ��� �� ����� catCount
    }

    public static class Cat
    {
       public  static int catCount = 0; //C����� ��� ����������� ����������

        public Cat()
        {
            Cat.catCount++;
        }//������ ��� �����������
    }

}
