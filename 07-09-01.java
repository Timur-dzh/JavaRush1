package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* “ри массива
1. ¬веди с клавиатуры 20 чисел, сохрани их в список и рассортируй по трЄм другим спискам:
„исло делитс¤ на 3 (x%3==0), делитс¤ на 2 (x%2==0) и все остальные.
„исла, которые дел¤тс¤ на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. ћетод printList должен выводить на экран все элементы списка с новой строки.
3. »спользу¤ метод printList выведи эти три списка на экран. —начала тот, который дл¤ x%3, потом тот, который дл¤ x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        ArrayList<Integer> l0 = new ArrayList<Integer>();
        for (int i = 0; i<20; i++) 
        {
         l1.add(Integer.parseInt(br.readLine()));   
        }

        for (int i = 0; i<l1.size(); i++)
        {
            if (l1.get(i)%2==0) l2.add(l1.get(i));
            if (l1.get(i)%3==0) l3.add(l1.get(i));
            if (l1.get(i)%2!=0 && l1.get(i)%3!=0) l0.add(l1.get(i));
        }

printList(l3);
printList(l2);
printList(l0);
    }

    public static void printList(List<Integer> list)
    {
        for (int i=0; i < list.size();i++) System.out.println(list.get(i));//напишите тут ваш код
    }
}
