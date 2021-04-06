package net.hb.day18_sample;

import java.util.Scanner ;

public class CoffeePrice { //103페이지 switch제어문(문자열)
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //4번라인
		
		String order = scanner.next();
		if(order.equals("사과")) { }
		else if(order.equals("체리")) { }
		
		scanner.close(); //19번라인
	}
} //CoffeePrice class END
