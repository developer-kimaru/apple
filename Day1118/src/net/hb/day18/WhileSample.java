package net.hb.day18;
import java.util.Scanner;

public class WhileSample { // 120������ (���� 3-2)
	public static void main(String[] args) {
		
		int count = 0,	sum = 0 ;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int a = scanner.nextInt();
		while(a != -1)
		{	sum += a	; //
			count++		; //AssignmentIncDecOperator.java Ȯ��
			a = scanner.nextInt();		}
		
		if	(count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else
		{	System.out.print("������ ������ " + count + "���̸�, ");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");	}
		
		scanner.close();
	}
}