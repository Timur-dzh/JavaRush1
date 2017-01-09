package com.javarush.test.level08.lesson11.home01;

import com.javarush.test.level06.lesson11.home02.Cat;

import java.util.HashSet;
import java.util.*;

/* Set �� �����
1. ������ ������ Solution ������� public static ����� ��� � Cat.
2. ����������� ����� createCats, �� ������ ��������� ��������� (Set) ����� � ��������� � ���� 3 ����.
3. � ������ main ������� ������ ���� �� Set cats.
4. ����������� ����� printCats, �� ������ ������� �� ����� ���� �����, ������� �������� �� ���������. ������ ��� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next()); //�������� ��� ��� ���. ����� 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
          Set<Cat> cats = new HashSet<Cat>();
     Cat cat1 = new Cat("Cat1");
     Cat cat2 = new Cat("Cat1");
     Cat cat3 = new Cat("Cat3");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        /*  cats.add(new Cat("cat1"));
        cats.add(new Cat("cat2"));
        cats.add(new Cat("cat3")); */
        //�������� ��� ��� ���. ����� 2
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat p : cats)
        {
            System.out.println(p);
        }// ����� 4
    }

    public static class Cat
    {
        String catName;
        public Cat(String name){
            this.catName = name;
        }
        // ����� 1
    }
}
