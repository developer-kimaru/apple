package net.tis.day24_sample;

public class Circle {
  public int radius; //non-static필드
  public String name; //non-static필드
  
  public Circle() {
  } //기본생성자 end
  
  public Circle(int r, String n) {
	 radius=r ; 
	 name=n; 
	 System.out.println("대표메뉴는 " + name);
  }//생성자 end
  
  public double getArea() {//non-static메소드
	  double cal = 3.14*radius*radius;
	  return cal;
  }//end
  
  public static void main(String[] args) {
	  Circle pizza ; 
	  pizza  = new Circle(7, "자바피자"); 
	  double area = pizza.getArea();
	  System.out.println(pizza.name +"의 면적은 " + area);
	  
	  System.out.println();
	  Circle donut = new Circle();
	  donut.radius=2;
	  donut.name="자바도넛";
	  System.out.println("대표메뉴는 " + donut.name);
	  double square = donut.getArea();
	  System.out.println(donut.name +"의 면적은 " + square);
  }//end
  
}//Circle class END













