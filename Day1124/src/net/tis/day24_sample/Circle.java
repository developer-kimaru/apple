package net.tis.day24_sample;

public class Circle {
  public int radius; //non-static�ʵ�
  public String name; //non-static�ʵ�
  
  public Circle() {
  } //�⺻������ end
  
  public Circle(int r, String n) {
	 radius=r ; 
	 name=n; 
	 System.out.println("��ǥ�޴��� " + name);
  }//������ end
  
  public double getArea() {//non-static�޼ҵ�
	  double cal = 3.14*radius*radius;
	  return cal;
  }//end
  
  public static void main(String[] args) {
	  Circle pizza ; 
	  pizza  = new Circle(7, "�ڹ�����"); 
	  double area = pizza.getArea();
	  System.out.println(pizza.name +"�� ������ " + area);
	  
	  System.out.println();
	  Circle donut = new Circle();
	  donut.radius=2;
	  donut.name="�ڹٵ���";
	  System.out.println("��ǥ�޴��� " + donut.name);
	  double square = donut.getArea();
	  System.out.println(donut.name +"�� ������ " + square);
  }//end
  
}//Circle class END













