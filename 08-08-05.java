package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


/* ������� �����, ������� ���������� �����
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� ��������� - �����.
������� �����, ������� ���������� �����.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
      HashMap<String, String> list = new HashMap<String, String>();
       list.put("���5���", "����");
        list.put("���4���", "������");
        list.put("������", "������");
         list.put("���������", "���������");
         list.put("����3����", "��������");
         list.put("����3�����", "����������");
         list.put("������6���", "�6��������");
         list.put("��������8�", "���8������");
         list.put("������9���", "������9���");
         list.put("������1���", "��������1�");//�������� ��� ��� ���//�������� ��� ��� ���
return list;  //�������� ��� ��� ���

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        
        ArrayList<String> dup = new ArrayList<String>();
        ArrayList<String> dup1 = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

    while (iter.hasNext())
    {      //��������� dup ���������� ���� ����.
        Map.Entry<String, String> pair = iter.next();
        dup.add(pair.getValue());            //����
    }
    
    for (int i=0; i < dup.size(); i++) //������� ���� � ������� dup � ������� �� �������� � ���1
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
