package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n, m;
        ArrayList<String> list = new ArrayList<String>();
        n = reader.readLine();
        m =reader.readLine();

        for (int i = 0; i < Integer.parseInt(n) ; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < Integer.parseInt(m) ; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
}}