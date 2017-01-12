package com.javarush.test.level12.lesson06.task05;

/*  лассы Cat и Dog от Pet
”наследуй классы Cat и Dog от Pet.
–еализуй недостающие методы.  лассы Cat и Dog не должны быть абстрактными.
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
    return " ошка";
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
    return "ѕес";
}

public  Dog getChild()
{
    return new Dog();
}
    }

}
