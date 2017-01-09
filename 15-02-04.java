package com.javarush.test.level15.lesson02.task04;
import java.util.*;

/* ��� - �����
1. �������� public static ����� MarkTwainBook, ������� ����������� �� Book. ��� ������ [Mark Twain]. �������� ������������ - ��� �����.
2. � ������ MarkTwainBook ���������� ��� ����������� ������.
3. ��� ������ getBook ��������� ��� ������������� ����������.
4. �������� �� �������� AgathaChristieBook. ��� ������ [Agatha Christie].
5. � ������ Book ���������� ���� ������ getOutputByBookType ���, ����� �� ���������:
5.1. agathaChristieOutput ��� ���� ����� ������;
5.2. markTwainOutput ��� ���� ����� �����.
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

             String output ="";
             if (getBook() instanceof MarkTwainBook)  output = markTwainOutput;
             if (getBook() instanceof AgathaChristieBook)  output = agathaChristieOutput;
            //Add your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book
    {
        private String name;
        private String author2 = "Mark Twain";
        public MarkTwainBook(String name)
        {
            super("Mark Twain");
            this.name = name;
        }
         public MarkTwainBook getBook()
        {
            return (MarkTwainBook) this;
        }

        public  String getName(){
            return this.name;
        }
            }
              public static class AgathaChristieBook extends Book
    {
        private String name;
        public AgathaChristieBook(String name)
        {
            super("Agatha Christie");
            this.name = name;
        }
         public AgathaChristieBook getBook()
        {
            return (AgathaChristieBook) this;
        }

        public  String getName(){
            return this.name;
        }
            }
    
}

