package com.javarush.test.level17.lesson10.home04;

/* ������������������ ������
���������� ����������� synchronized ������ ��� �������, ������� ����������.
������ ������ Solution ����� �������������� ������.
*/

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        double i = method3();
    }

    protected synchronized void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    }

    synchronized double  method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

}
/*
method4() ����� ����������������, ������ ��� ��������� ����� ������ ���� StringBuilder(), ������� �� ����� ���������� �������������
method5() �� ����� ����������������, ������ ��� ��������� ����� ������ ���� StringBuffer(), ������� � ���� ����� ���������� �������������
method3() ����� ����������������, ������ �� ����������� � ������ private double param = Math.random(), ������� ����� ������������ ����� ����� ������ ������ Solution
method0() �� ����� ����������������, ������ �� �������� � ���� method3(), ������� � ���� ������� ������������������
method2() �� ����� ����������������, ������ ��� �� �� ������� ����� �������� � �� �������� ����� ������� � �� �������� ������ �������
method1() ����� ����������������, ������ ��� �� �������� � ���� �����, ������� �� ������������������, ���� �� ���������� ��� ��� double i = method3() ����� ����� �������� �� ������� ������, � �� �� ������
method7() �� ����� ����������������, ������ ��� �� �� ������� ����� �������� � �� �������� ����� ������� � �� �������� ������ �������
method6() ����� ����������������, ������ ��� �� �������� � ���� �����, ������� �� ������������������, � � ���� ���� ����� � �������
 */