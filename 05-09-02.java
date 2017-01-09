package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
  private String name=null;
    private int weight = 1;
    private String color="white";
    private int age = 0;
    private String address = null;
    
    public  Cat(String name) //имя 
    {
        this.name = name;
    }
    public  Cat(String name, int weight, int age) //имя вес возраст
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
       public  Cat(String name,  int age) //имя возраст
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
    }
    public  Cat(int weight,  String color) //вес цвет
    {
        this.weight = weight;
        this.color = color;
        
    }
  public  Cat(int weight,  String color, String address) //вес цвет
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }  //напишите тут ваш код

}
