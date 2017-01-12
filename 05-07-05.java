package com.javarush.test.level05.lesson07.task05;

/* —оздать класс пр¤моугольник (Rectangle)
—оздать класс пр¤моугольник (Rectangle). ≈го данными будут top, left, width, height (лева¤ координата, верхн¤¤, ширина и высота). —оздать дл¤ него как можно больше методов initialize(Е)
ѕримеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаЄм квадрат
-	создаЄм копию другого пр¤моугольника (он и передаЄтс¤ в параметрах)
*/

public class Rectangle
{
   private int left = 0;
   private int top = 0;//напишите тут ваш код
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
