package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ����� �������� � ��������� ����� ����������������
������: � ������ ����� ���� ��� � �����-����. ������� �����, ������� �� �������� ������ ��������. ������� ��� �������: �����-���� � �����-����. ������� �� �� �����.
����� ������: � ������ ����� ���� ���, �����-���� � �����-����. �������� ����� Cat ���, ����� �� ��� ������� ������ ��������.
������� 6 ��������: �������(����� ����), �������(������ ����), ����, ����, ����, ����.
������� �� ���� �� ����� � �������: �������, �������, ����, ����, ���, ����.

������ �����:
������� ����
������� �����
���� �������
���� ��������
��� ������
���� �������

������ ������:
Cat name is ������� ����, no mother, no father
Cat name is ������� �����, no mother, no father
Cat name is ���� �������, no mother, father is ������� ����
Cat name is ���� ��������, mother is ������� �����, no father
Cat name is ��� ������, mother is ���� ��������, father is ���� �������
Cat name is ���� �������, mother is ���� ��������, father is ���� �������
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babkaName = reader.readLine();
        Cat catBabka = new Cat(babkaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catDed, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catBabka);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catDed);
        System.out.println(catBabka);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }



        @Override
        public String toString()
        {
            if (mother == null && father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
