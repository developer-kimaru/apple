package net.hb.day18;
import java.util.Scanner;
public class Exercise04
{	public static void main(String[] args)	{	//120 ������ / ���� 3-2

		int count = 0, sum = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ���. >>>> ");
		
		int a =	scanner.nextInt();
		while 	(a != -1)
		{		sum += a ;
				count++;
				a = scanner.nextInt();	}
		if (count==0)
				System.out.println("�Էµ� ���� �����ϴ�.");
		else {
				System.out.print("������ ������ " + count + "���̸�,");
				System.out.println("����� " + (double)sum/count + "�Դϴ�.");	}
		
		scanner.close();	}}