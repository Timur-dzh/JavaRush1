package com.javarush.test.level14.lesson08.home06;
import java.io.*;
/* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while(true)
        {
            key = reader.readLine();
            if (!(key.equals("thriller") || key.equals("cartoon") || key.equals("soapOpera"))) break;
            Movie m = MovieFactory.getMovie(key);
          System.out.println(m.getClass().getSimpleName());
        }
    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }

            if ("thriller".equals(key))
            {
                movie = new Thriller();
            }
            if ("cartoon".equals(key))
            {
                movie = new Cartoon();
            }
            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie
    {


    }

    static class SoapOpera extends Movie
    {
        private String simpleName;

        public SoapOpera()
        {
            this.simpleName = "Мыльная Опера";
        }

        public String getSimpleName()
        {
            return simpleName;
        }
    }

    static class Cartoon extends Movie
    {
        private String simpleName;

        public Cartoon()
        {
            this.simpleName = "Том и джерри";
        }
        public String getSimpleName()
        {
            return simpleName;
        }
    }

    static class Thriller extends Movie
    {
        private String simpleName;

        public Thriller()
        {
            this.simpleName = "Кошмар на улице вязов";
        }
        public String getSimpleName()
        {
            return simpleName;
        }
    }

    //Напишите тут ваши классы, пункт 3
}
