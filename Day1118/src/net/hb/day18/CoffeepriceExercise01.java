package net.hb.day18;
import java.util.Scanner;
public class CoffeepriceExercise01 { //Switch + 문자형

	public static void main(String[] args) {	
		Scanner	scanner = new Scanner(System.in);
		
		System.out.print("주문할 커피를 입력해주세요. >>> ");
		String order = scanner.next();
		int price = 0;
		
		switch(order) {
			case "아메리카노"	:	price=2000;		break;
			case "카페라떼"	:
			case "카푸치노"	:
			case "에스프레소"	:	price=3500;		break;
		default				:	System.out.println("메뉴에 없습니다.");	}

		if(price!=0)
			System.out.println(order+"는 "+price+"원입니다.");
			
		scanner.close();	}
}