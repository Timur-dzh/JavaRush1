package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Map;

/* HashMap �� 10 ���
������� ��������� HashMap<String, String>, ������� ���� 10 ��� �����:
����� - �����, ����� - �����, ����� - �����, ����� - �����, ���� - ����, ������� - ����, ����-���� - ������, ��������� - �����, ���� - ������, ��������� - �������.
������� ���������� ��������� �� �����, ������ ������� � ����� ������.
������ ������ (��� �������� ������ ���� ������):
��������� - �������
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     Map<String, String> plant = new HashMap<String, String>();
    plant.put("�����", "�����");
    plant.put("�����", "�����");
    plant.put("�����", "�����");
    plant.put("�����", "�����");
    plant.put("����", "����");
    plant.put("�������", "����");
    plant.put("����-����", "������");
    plant.put("���������", "�����");
    plant.put("����", "������");
    plant.put("���������", "�������");

    for (Map.Entry<String, String> pair : plant.entrySet())
    {
        String key = pair.getKey();                      //����
        String value = pair.getValue();                  //��������
        System.out.println(key + " - " + value);
    } //�������� ��� ��� ���

    }
}
