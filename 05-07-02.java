package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name=null;
    private int weight = 1;
    private String color="white";
    private int age = 0;
    private String address = null;
    
    public void initialize(String name) //имя 
    {
        this.name = name;
    }
    public void initialize(String name, int weight, int age) //имя вес возраст
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
       public void initialize(String name,  int age) //имя возраст
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
    }
    public void initialize(int weight,  String color) //вес цвет
    {
        this.weight = weight;
        this.color = color;
        
    }
  public void initialize(int weight,  String color, String address) //вес цвет
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
 

}
