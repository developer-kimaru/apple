package net.hb.day20;
import java.util.Scanner;
public class Exercise02 { //154������ ���� 3-15
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true)
		{System.out.print("�������� �Է��ϼ���. >>> ");
		 int a = scanner.nextInt();
		 System.out.print("�������� �Է��ϼ���. >>> ");
		 int b = scanner.nextInt();
		 	try
		 	{System.out.println(a+"�� "+b+"�� ������ ���� "+(a/b)+"�Դϴ�.");	break;}
		 	catch (ArithmeticException e)
		 	{System.out.println("0���� ���� �� �����ϴ�.");}
		 	scanner.close();
		}
	}
}