package com.javarush.test.level17.lesson04.task04;

/* ������������������ ���������
� ����� Singleton ������� - ������������� � ����������� �����
������ ������ OurPresident � ����������� ����� �������� ������������������ ����.
������ ������������������� ����� ��������������� president.
*/

public class Solution {
    public static class OurPresident {
           static {

             synchronized (Solution.class){

                 president = new OurPresident();
             }
      }

        private static OurPresident president;

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }
}
