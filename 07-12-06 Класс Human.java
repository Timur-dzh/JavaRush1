package com.javarush.test.level07.lesson12.home06;

/* �����
������ ����� Human � ������ ���(String), ���(boolean),�������(int), ����(Human), ����(Human). ������ ������� � ������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����. ������� ������� �� �����.
����������:
���� �������� ���� ����� String toString() � ������ Human, �� ������ �� ����� �������������� ��� ������ ������� �� �����.
������ ������:
���: ���, ���: �������, �������: 21, ����: �����, ����: ����
���: ����, ���: �������, �������: 55
���: �����, ���: �������, �������: 2, ����: ������, ����: ���
�
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human Olya = new Human("�����", false, 80  );
        Human Kolya = new Human("�������", true, 82);
        Human Masha = new Human("�����", false, 79);
        Human Pasha = new Human("�����", true, 80);
        Human Katya = new Human("���������", false, 50, Kolya, Olya);
        Human Oleg = new Human("����", true, 49, Pasha, Masha);
        Human Anya = new Human("���", false, 21, Oleg, Katya);
        Human Sanya = new Human("���������", true, 20, Oleg, Katya);
        Human Vanya = new Human("����", true, 19, Oleg, Katya);
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
        //�������� ��� ��� ���

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
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            if (this.father != null)
                text += ", ����: " + this.father;

            if (this.mother != null)
                text += ", ����: " + this.mother;

            return text;
        }
    }

}
