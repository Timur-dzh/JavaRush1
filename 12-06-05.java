package com.javarush.test.level12.lesson06.task05;

/* ������ Cat � Dog �� Pet
��������� ������ Cat � Dog �� Pet.
�������� ����������� ������. ������ Cat � Dog �� ������ ���� ������������.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
public  String getName()
{
    return "�����";
}
public  Cat getChild()
{
    return new Cat();
}
    }

    public static class Dog extends Pet
    {
public  String getName()
{
    return "���";
}

public  Dog getChild()
{
    return new Dog();
}
    }

}
