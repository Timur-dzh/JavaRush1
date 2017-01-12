package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Map;

/* HashMap из 10 пар
—оздать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ¤года, банан - трава, вишн¤ - ¤года, груша - фрукт, дын¤ - овощ, ежевика - куст, жень-шень - корень, земл¤ника - ¤года, ирис - цветок, картофель - клубень.
¬ывести содержимое коллекции на экран, каждый элемент с новой строки.
ѕример вывода (тут показана только одна строка):
картофель - клубень
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     Map<String, String> plant = new HashMap<String, String>();
    plant.put("арбуз", "¤года");
    plant.put("банан", "трава");
    plant.put("вишн¤", "¤года");
    plant.put("груша", "фрукт");
    plant.put("дын¤", "овощ");
    plant.put("ежевика", "куст");
    plant.put("жень-шень", "корень");
    plant.put("земл¤ника", "¤года");
    plant.put("ирис", "цветок");
    plant.put("картофель", "клубень");

    for (Map.Entry<String, String> pair : plant.entrySet())
    {
        String key = pair.getKey();                      //ключ
        String value = pair.getValue();                  //значение
        System.out.println(key + " - " + value);
    } //напишите тут ваш код

    }
}
