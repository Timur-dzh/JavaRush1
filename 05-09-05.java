package com.javarush.test.level05.lesson09.task05;

/* ������� ����� ������������� (Rectangle)
������� ����� ������������� (Rectangle). ��� ������� ����� top, left, width, height (����� ����������, �������, ������ � ������). ������� ��� ���� ��� ����� ������ �������������:
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
  
  public Rectangle(int left, int top, int width, int height)
  {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = height;
  }
   public Rectangle(int left, int top)
  {
      this.left = left;
      this.top = top;
      this.width = 0;
      this.height = 0;
  }
    public Rectangle(int left, int top, int width)
  {
      this.left = left;
      this.top = top;
      this.width = width;
      this.height = width;
  }
  
    public Rectangle(Rectangle another)
  {
      this.left = another.left;
      this.top = another.top;
      this.width = another.width;
      this.height = another.height;
  }

}
