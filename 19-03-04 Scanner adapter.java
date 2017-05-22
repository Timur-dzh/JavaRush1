package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
� ��� ���� �������
������������ Scanner � PersonScanner.
�������-��������� �������� PersonScannerAdapter.
� ������ �������� ������� ��������� ��������� ���� Scanner fileScanner. ���� ���������������� � ������������ � ����� ���������� ���� Scanner.

������ � ����� �������� � ��������� ����:
������ ���� �������� 31 12 1950
������ ���� �������� 31 12 1957

� ����� �������� ������� ���������� �����, ������ ������ �������� ��������� � ����� ������. ����� read() ������ ������ ������ ������ ������ ��������.

����������:
1.?PersonScanner ������ ���� �����������.
2.?����� PersonScannerAdapter ������ ������������� ��������� PersonScanner.
3.?����� PersonScannerAdapter ������ ��������� ��������� ���� fileScanner ���� Scanner.
4.?����� PersonScannerAdapter ������ ��������� ����������� � ���������� Scanner.
5.?����� close() ������ PersonScannerAdapter ������ ������������ ���������� ������ �� ������ fileScanner.
6.?����� read() ������ PersonScannerAdapter ������ ������ ������ � �����, ������� �, � ���������� ������ ������ ������ ��������, � ���� ������� ������ Person.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner){

            this.scanner=scanner;

        }

        @Override
        public Person read() throws IOException
        {
                String str = scanner.nextLine();
                String[] split = str.split(" ");

                Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4]) - 1, Integer.parseInt(split[3]));
                Date date = calendar.getTime();
                Person person = new Person(split[1], split[2], split[0], date);
                return person;

        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}
