package net.hb.day17;
import java.util.Scanner;
public class Grade02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. (0~100) >> ");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��ϼ���. (1~4) >> ");
		int year = scanner.nextInt();
		
		if(score >= 60) { //�߰�ȣ ��ġ Ȯ��!!
			if(year != 4) //!= ���� ����
				System.out.println("�հ�!");
			else if (score >= 70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!"); }
		else
			System.out.println("���հ�!");
		scanner.close();
	}	
}
