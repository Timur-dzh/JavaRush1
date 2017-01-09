package com.javarush.test.level08.lesson11.home01;

import com.javarush.test.level06.lesson11.home02.Cat;

import java.util.HashSet;
import java.util.*;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next()); //напишите тут ваш код. пункт 3

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
        //напишите тут ваш код. пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat p : cats)
        {
            System.out.println(p);
        }// пункт 4
    }

    public static class Cat
    {
        String catName;
        public Cat(String name){
            this.catName = name;
        }
        // пункт 1
    }
}
