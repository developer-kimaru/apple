package net.hb.day20;
import java.util.Scanner;
import java.util.InputMismatchException;

	public class InputException { // 156 ������ ����ó�� �ǽ�
		public static void main(String[] args)
			{	Scanner scanner = new Scanner(System.in);
				System.out.println("���� 3���� �Է��ϼ���. >>> ");
				int sum=0, number=0;
				for(int a=0; a<3; a++)
			{	System.out.print(a+">>");
				try {number = scanner.nextInt();		}

			catch (InputMismatchException e)
			{	System.out.println("������ �ƴմϴ�. �ٽ� �Է����ּ���.");
				scanner.nextLine();
				a--;
				continue;								}
				sum += number;							}
				System.out.println("���� "+sum);
				scanner.close();						}}
			//	double aver = 78.9;
			//	a = (int)aver;
			//	String data = "1200";
			//	int b = Integer.parseInt(data);
			//	System.out.println(data+98); //120098
			//	System.out.println(b+98); //1298