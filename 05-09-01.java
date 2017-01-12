package com.javarush.test.level05.lesson09.task01;

/* —оздать класс Friend
—оздать класс Friend (друг) с трем¤ конструкторами:
- »м¤
- »м¤, возраст
- »м¤, возраст, пол
*/

public class Friend
{
   private String name = null;
   private int age =0;
   private String gen = null;
   
  public Friend(String name)
  {
    this.name = name;
  } 
  
  public Friend(String name, int age)
  {
    this.name = name;
    this.age = age;
  } 
    
    public Friend(String name, int age, String gen)
  {
    this.name = name;
    this.age = age;
    this.gen = gen;
  } 
  

}