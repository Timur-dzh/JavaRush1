package com.javarush.test.level05.lesson07.task05;

/* ������� ����� ������������� (Rectangle)
������� ����� ������������� (Rectangle). ��� ������� ����� top, left, width, height (����� ����������, �������, ������ � ������). ������� ��� ���� ��� ����� ������ ������� initialize(�)
�������:
-	������ 4 ���������: left, top, width, height
-	������/������ �� ������ (��� ����� 0)
-	������ �� ������ (����� ������) ������ �������
-	������ ����� ������� �������������� (�� � ��������� � ����������)
*/

public class Rectangle
{
   private int left = 0;
   private int top = 0;//�������� ��� ��� ���
 private int width = 0;
  private int height = 0;
  
  public void initialize(int left, int top, int width, int height)
  {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = height;
  }
   public void initialize(int left, int top)
  {
      this.left = left;
      this.top = top;
      this.width = 0;
      this.height = 0;
  }
    public void initialize(int left, int top, int width)
  {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = width;
  }
  
    public void initialize(Rectangle another)
  {
      this.left = another.left;
      this.top = another.top;
      this.width = another.width;
      this.height = another.height;
  }
  
}
