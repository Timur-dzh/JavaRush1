package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/* ���������� ��� � �������
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� ��������� - �����.
��������� ������� ����� ����� ����������� � �������� ��� ��� �������.
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
return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
         int c1 = 0;
     Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

    while (iter.hasNext())
    {
        //��������� ������ ���������
        Map.Entry<String, String> pair = iter.next();
        String val = pair.getValue();            //����
        if (val.equals(name)) c1++; //�������� ��� ��� ���

    }
return c1;
};
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
       int c2 = 0;
     Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
      while (iterator.hasNext())
      {
	  //�������� ��� ��� ���
   Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //����
        if (key.equals(lastName)) c2++; 

    }
    return c2;
}

}
