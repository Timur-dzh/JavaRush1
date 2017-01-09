package com.javarush.test.level14.lesson08.home07;

import java.util.ArrayList;
import java.util.List;

/* ����������� �����
����������� �����
1. ����������� ����� cleanAllApartaments.
��� ������� ������� �� apartaments:
2. ��� ������������� ������� (Apt1Room) ������� ����� clean1Room.
�.�. ���� ������ ���� Apt1Room, �� ������� � ���� ����� clean1Room.
3. ��� ������������� ������� (Apt2Room) ������� ����� clean2Rooms
�.�. ���� ������ ���� Apt2Room, �� ������� � ���� ����� clean2Rooms.
4. ��� ������������� ������� (Apt3Room) ������� ����� clean3Rooms
�.�. ���� ������ ���� Apt3Room, �� ������� � ���� ����� clean3Rooms.
*/
public class Solution
{
    public static void main(String[] args)
    {
        List<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(new Apt1Room());
        apartaments.add(new Apt2Room());
        apartaments.add(new Apt3Room());

        cleanAllApartaments(apartaments);
    }

    public static void cleanAllApartaments(List<Apartament> apartaments)
    {
        for (Apartament ap: apartaments)
        {
            if (ap instanceof Apt1Room) ((Apt1Room) ap).clean1Room();
            if (ap instanceof Apt2Room) ((Apt2Room) ap).clean2Rooms();
            if (ap instanceof Apt3Room) ((Apt3Room) ap).clean3Rooms();
        }
    }

    static interface Apartament
    {
    }

    static class Apt1Room implements Apartament
    {
        void clean1Room()
        {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartament
    {
        void clean2Rooms()
        {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartament
    {
        void clean3Rooms()
        {
            System.out.println("3 rooms are cleaned");
        }
    }
}
