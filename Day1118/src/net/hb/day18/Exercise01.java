package net.hb.day18;
import java.util.Scanner;
public class Exercise01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֹ��� Ŀ�Ǹ� �Է����ּ���. >>> ");
		
		String menu = scanner.next();
		int price = 0;
		
		switch (menu) {
			case "�Ƹ޸�ī��"	:	price = 2000;	break;
			case "����������"	:
			case "īǪġ��"	:
			case "ī���"	:	price = 3500;	break;
		default 			:	System.out.println("�޴��� �����ϴ�.");		}
		
		if(price!=0)
			System.out.println(menu + "�� " + price + "���Դϴ�.");
		scanner.close();
	}
}