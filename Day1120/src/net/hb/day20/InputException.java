package net.hb.day20;
import java.util.Scanner;
import java.util.InputMismatchException;

	public class InputException { // 156 페이지 예외처리 실습
		public static void main(String[] args)
			{	Scanner scanner = new Scanner(System.in);
				System.out.println("정수 3개를 입력하세요. >>> ");
				int sum=0, number=0;
				for(int a=0; a<3; a++)
			{	System.out.print(a+">>");
				try {number = scanner.nextInt();		}

			catch (InputMismatchException e)
			{	System.out.println("정수가 아닙니다. 다시 입력해주세요.");
				scanner.nextLine();
				a--;
				continue;								}
				sum += number;							}
				System.out.println("합은 "+sum);
				scanner.close();						}}
			//	double aver = 78.9;
			//	a = (int)aver;
			//	String data = "1200";
			//	int b = Integer.parseInt(data);
			//	System.out.println(data+98); //120098
			//	System.out.println(b+98); //1298