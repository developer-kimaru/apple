package net.hb.day18;
import java.util.Scanner;

public class Question14 { //���� 109page, 14�� ����

	public static void main(String[] args) {	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("����, ����, �� �� �ϳ��� �Է����ּ��� >>> ");
	String order = scanner.next();
	int number = 0 ;
	
		switch (order) {
			case "����"	:	number = 1;		break;
			case "����"	:	number = 2;		break;
			case "��"	:	number = 3;		break;
		default 		:	number = 0;		break;		}
		
	System.out.println(order+"�� ������� "+number+"�Դϴ�.");
	
	scanner.close();
	}
}