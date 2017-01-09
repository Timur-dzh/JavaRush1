package com.javarush.test.level05.lesson09.task02;

/* ������� ����� Cat
������� ����� Cat (���) � ����� ��������������:
- ���,
- ���, ���, �������
- ���, ������� (��� �����������)
- ���, ����, (���, ����� � ������� � �����������. ��� - ���������)
- ���, ����, ����� ( ����� �������� ���)
������ ������������ � ������� ������ ��������. ��������, ���� ��� �� ��������, �� ����� ������� �����-������ ������� ���. ��� �� ����� ������ �� ������. �� �� ���������� ��������. � ��� ����� ����� � �� ���� (null). �� �� �������� ������: null.
*/

public class Cat
{
  private String name=null;
    private int weight = 1;
    private String color="white";
    private int age = 0;
    private String address = null;
    
    public  Cat(String name) //��� 
    {
        this.name = name;
    }
    public  Cat(String name, int weight, int age) //��� ��� �������
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
       public  Cat(String name,  int age) //��� �������
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
    }
    public  Cat(int weight,  String color) //��� ����
    {
        this.weight = weight;
        this.color = color;
        
    }
  public  Cat(int weight,  String color, String address) //��� ����
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }  //�������� ��� ��� ���

}
