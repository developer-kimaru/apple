package net.hb.day17;
public class Test02 { //클래스 이름
	public static void starGame() { //메소드 이름		
	}
	public static void main(String[] args) { //메소드 이름
		int age = 28; // 지역변수 = local variable
		final double PI = 3.1415;
		//final을 붙이면 final을 붙인 PI 값으로 출력이 고정됨
		String address = "일산";
		System.out.println("원주율 = " + PI);
		System.out.println("나이 =" + age);
		System.out.println("주소 = " + address);
		System.out.println();
		age = 20;
		// PI = 6.2831;
		address = "영등포";
		System.out.println("원주율 = " + PI);
		System.out.println("나이 =" + age);
		System.out.println("주소 = " + address);
		System.out.println();
	}
}