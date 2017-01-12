package com.javarush.test.level05.lesson07.task01;

/* —оздать класс Friend
—оздать класс Friend (друг) с трем¤ инициализаторами (трем¤ методами initialize):
- »м¤
- »м¤, возраст
- »м¤, возраст, пол
*/

public class Friend
{

    private String name = null;
    private int age = 0;
    private String gender = null;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public void initialize(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}//напишите тут ваш код

