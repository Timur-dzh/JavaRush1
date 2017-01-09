package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. ������ ������ Solution ������ public static ������ Man � Woman.
2. � ������� ������ ���� ����: name(String), age(int), address(String).
3. ������ ������������, � ������� ���������� ��� ��������� ���������.
4. ������ �� ��� ������� ������� ������ �� ����� ������� ��������� �����������.
5. ������� ������ �� ����� � ����� ������� [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
       Man man1 =new Man("Jora", 10, "Muhosranks");
        Man man2 =new Man("Vasya", 12 , "almaty");
        Woman wm1 = new Woman("Sveta", 15 , "lamm");
        Woman wm2=new Woman("ssd", 53, "55");//������ �� ��� ������� ������� ������ ���
        System.out.println(man1.name + " " + man1.age + " "+ man1.address);
        System.out.println(man2.name + " " + man2.age + " "+ man2.address);
        System.out.println(wm1.name + " " + wm1.age + " "+ wm1.address);
        System.out.println(wm2.name + " " + wm2.age + " "+ wm2.address);

    //������ �� �� ����� ���


    }

    public static class Man
    {
        private String name = null;
        private int age = 0;
        private  String address = null;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address =address;
        }
    }
    public static class Woman
    {
        private String name = null;
        private int age = 0;
        private  String address = null;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address =address;
        }
    }//�������� ��� ���� ������
}
