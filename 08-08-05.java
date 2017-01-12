package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
return list;  //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        
        ArrayList<String> dup = new ArrayList<String>();
        ArrayList<String> dup1 = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

    while (iter.hasNext())
    {      //заполняем dup значениями всех имен.
        Map.Entry<String, String> pair = iter.next();
        dup.add(pair.getValue());            //ключ
    }
    
    for (int i=0; i < dup.size(); i++) //находим пары в массиве dup и знаосим их значения в ДУП1
        {
            for (int c = i+1; c<dup.size(); c++)
            if (dup.get(i).equals(dup.get(c))) dup1.add(dup.get(c));
        }
for (int i = 0; i<dup1.size(); i++) removeItemFromMapByValue(map, dup1.get(i));
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
