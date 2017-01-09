package com.javarush.test.level05.lesson09.task04;

/* ������� ����� Circle
������� ����� (Circle) ����, � ����� ��������������:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX = 0;
    private int centerY = 0;
    private int radius = 0;
    private int width = 0;
    private String color;
    
    public Circle(int centerX, int centerY, int radius, int width, String color)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.color=color;
        this.width=width;
    }
      public Circle(int centerX, int centerY, int radius, int width)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }
          public Circle(int centerX, int centerY, int radius)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

}
