package com.javarush.test.level05.lesson07.task02;

/* ������� ����� Cat
������� ����� Cat (���) � ����� ����������������:
- ���,
- ���, ���, �������
- ���, ������� (��� �����������)
- ���, ����, (���, ����� � ������� ����������, ��� ��������� ���)
- ���, ����, ����� ( ����� �������� ���)
������ �������������� � ������� ������ ��������. ��������, ���� ��� ����������, �� ����� ������� �����-������ ������� ���. ��� �� ����� ������ �� ������. �� �� ���������� ��������. � ��� ����� ����� � �� ���� (null). �� �� �������� ������: null.
*/

public class Cat
{
    private String name=null;
    private int weight = 1;
    private String color="white";
    private int age = 0;
    private String address = null;
    
    public void initialize(String name) //��� 
    {
        this.name = name;
    }
    public void initialize(String name, int weight, int age) //��� ��� �������
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
       public void initialize(String name,  int age) //��� �������
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
    }
    public void initialize(int weight,  String color) //��� ����
    {
        this.weight = weight;
        this.color = color;
        
    }
  public void initialize(int weight,  String color, String address) //��� ����
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
 

}
