package net.hb.day18;
import java.util.Scanner;
public class CoffeepriceExercise01 { //Switch + ������

	public static void main(String[] args) {	
		Scanner	scanner = new Scanner(System.in);
		
		System.out.print("�ֹ��� Ŀ�Ǹ� �Է����ּ���. >>> ");
		String order = scanner.next();
		int price = 0;
		
		switch(order) {
			case "�Ƹ޸�ī��"	:	price=2000;		break;
			case "ī���"	:
			case "īǪġ��"	:
			case "����������"	:	price=3500;		break;
		default				:	System.out.println("�޴��� �����ϴ�.");	}

		if(price!=0)
			System.out.println(order+"�� "+price+"���Դϴ�.");
			
		scanner.close();	}
}