package net.hb.day18;
import java.util.Scanner;

public class Question14 { //교재 109page, 14번 문제

	public static void main(String[] args) {	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("가위, 바위, 보 중 하나를 입력해주세요 >>> ");
	String order = scanner.next();
	int number = 0 ;
	
		switch (order) {
			case "가위"	:	number = 1;		break;
			case "바위"	:	number = 2;		break;
			case "보"	:	number = 3;		break;
		default 		:	number = 0;		break;		}
		
	System.out.println(order+"의 결과값은 "+number+"입니다.");
	
	scanner.close();
	}
}