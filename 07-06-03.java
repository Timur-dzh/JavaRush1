package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* —ама¤ коротка¤ строка
1. —оздай список строк.
2. —читай с клавиатуры 5 строк и добавь в список.
3. »спользу¤ цикл, найди самую короткую строку в списке.
4. ¬ыведи найденную строку на экран.
5. ≈сли таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
   public static void main(String[] args) throws Exception
    {
        int min=100;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<String>();
       
       for(int i = 0; i<5; i++) 
       
       {
           list.add(br.readLine());
           if (min > list.get(i).length())  min=list.get(i).length()  ;
       }
    
	for (int i = 0 ; i <list.size(); i++)
	{
		if (list.get(i).length()==min) System.out.println(list.get(i));
	}
}
}
