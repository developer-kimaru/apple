package net.hb.day18;
import java.util.Scanner;
public class CoffeepriceExercise00 { //Switch + ������

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
		
		System.out.print("�ֹ��Ͻ� Ŀ�� >>>> ");
		String order = scanner.next() ;
		int price = 0 ;
		
		switch(order) {
			case "�Ƹ޸�ī��"	:	price=2000;			break;
			case "īǪġ��"	:
			case "ī���"	:
			case "����������"	:	price=3500;			break;
			default 		:	
				System.out.println("�޴��� �����ϴ�.");	break;		}
		
		if(price!=0)
			System.out.println(order+"�� "+price+"�� �Դϴ�.");
			
	scanner.close();	}
}