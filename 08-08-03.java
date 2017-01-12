package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> list = new HashMap<String, String>();
       list.put("Ива5нов", "Петр");
        list.put("Ива4нов", "Руслан");
        list.put("Петров", "Руслан");
         list.put("Пефватров", "Русфвалан");
         list.put("Пева3тров", "Русфвлан");
         list.put("Пефв3атров", "Русфввалан");
         list.put("Пефват6ров", "Р6усфвалан");
         list.put("Пефватро8в", "Рус8фвалан");
         list.put("Пефват9ров", "Русфва9лан");
         list.put("Пефват1ров", "Русфвала1н");//напишите тут ваш код//напишите тут ваш код
return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
         int c1 = 0;
     Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

    while (iter.hasNext())
    {
        //получение «пары» элементов
        Map.Entry<String, String> pair = iter.next();
        String val = pair.getValue();            //ключ
        if (val.equals(name)) c1++; //напишите тут ваш код

    }
return c1;
};
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
       int c2 = 0;
     Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
      while (iterator.hasNext())
      {
	  //напишите тут ваш код
   Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //ключ
        if (key.equals(lastName)) c2++; 

    }
    return c2;
}

}
