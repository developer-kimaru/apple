package net.hb.day18;
import java.util.Scanner;
public class CoffeepriceExercise00 { //Switch + 문자형

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
		
		System.out.print("주문하실 커피 >>>> ");
		String order = scanner.next() ;
		int price = 0 ;
		
		switch(order) {
			case "아메리카노"	:	price=2000;			break;
			case "카푸치노"	:
			case "카페라떼"	:
			case "에스프레소"	:	price=3500;			break;
			default 		:	
				System.out.println("메뉴가 없습니다.");	break;		}
		
		if(price!=0)
			System.out.println(order+"는 "+price+"원 입니다.");
			
	scanner.close();	}
}