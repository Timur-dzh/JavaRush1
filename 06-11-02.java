package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* ����������� ����
1. � ������ Cat ������ public ����������� ���������� cats (ArrayList<Cat>).
2. ����� ��� ������ �������� ���� (������ ������� Cat) � ���������� cats ����������� ���� ����� ���. ������� 10 �������� Cat.
3. ����� printCats ������ �������� ���� ����� �� �����. ����� ������������ ���������� cats.
*/

public class Cat
{
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat()
    {

    }
    //�������� ��� ��� ���

    public static void main(String[] args)
    {
        for (int i = 0; i <10 ; i++)
        {
            Cat cat = new Cat();
            cats.add(cat);
        } //������ ��� 10 �����
        printCats();
    }

    public static void printCats()
    {
        for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i)); //������ ���� ��� ��� ������ 3 ���
        }

    }
}
