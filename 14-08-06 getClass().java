package com.javarush.test.level14.lesson08.home06;
import java.io.*;
/* MovieFactory
���������� ����������� �� ��������, ������ � �������:
1. �����������, ��� ��������� ����� ������.
2. ��� ������ ������ ���� ������ ������ Solution.
3. �������� ������ Cartoon, Thriller.
4. �����������, ��� �� �������� ������ ������ SoapOpera �� ����� "soapOpera".
���������� ��������� ������� SoapOpera �������:
5. �������� � MovieFactory.getMovie ��������� ������� Cartoon ��� ����� "cartoon".
6. �������� � MovieFactory.getMovie ��������� ������� Thriller ��� ����� "thriller".

7. ������� � ������� ��������� ������ (�����).
7.1. ���� �������������, ��� ������ �������� ������ �� ����������� � ����� ��: "cartoon", "thriller", "soapOpera".
8. ������� ���������� movie ������ Movie � ��� ������ ��������� ������(�����):
8.1. �������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie.
8.2. ������� �� ����� movie.getClass().getSimpleName().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //������ � ������� ��������� ������ (�����), ����� 7

        /*
8 ������� ���������� movie ������ Movie � ��� ������ ��������� ������(�����):
8.1 �������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie
8.2 ������� �� ����� movie.getClass().getSimpleName()
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

            //�������� ������� SoapOpera (������� �����) ��� ����� "soapOpera"
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
            //�������� ��� ��� ���, ������ 5,6

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
            this.simpleName = "������� �����";
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
            this.simpleName = "��� � ������";
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
            this.simpleName = "������ �� ����� �����";
        }
        public String getSimpleName()
        {
            return simpleName;
        }
    }

    //�������� ��� ���� ������, ����� 3
}
