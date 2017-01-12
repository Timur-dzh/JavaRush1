package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human Olya = new Human("Ольга", false, 80  );
        Human Kolya = new Human("Николай", true, 82);
        Human Masha = new Human("Мария", false, 79);
        Human Pasha = new Human("Павел", true, 80);
        Human Katya = new Human("Екатерина", false, 50, Kolya, Olya);
        Human Oleg = new Human("Олег", true, 49, Pasha, Masha);
        Human Anya = new Human("Аня", false, 21, Oleg, Katya);
        Human Sanya = new Human("Александр", true, 20, Oleg, Katya);
        Human Vanya = new Human("Иван", true, 19, Oleg, Katya);
        System.out.println(Olya.toString());
        System.out.println(Kolya.toString());
        System.out.println(Masha.toString());
        System.out.println(Pasha.toString());
        System.out.println(Katya.toString());
        System.out.println(Oleg.toString());
        System.out.println(Anya.toString());
        System.out.println(Sanya.toString());
        System.out.println(Vanya.toString());
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        String father;
        String mother;
        //Написать тут ваш код

        public Human( String name, Boolean sex,int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother =null;
        }

        public Human( String name, Boolean sex,int age, Human Father, Human Mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = Father.name;
            this.mother = Mother.name;
        }
        public String toString()
        {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }
    }

}
