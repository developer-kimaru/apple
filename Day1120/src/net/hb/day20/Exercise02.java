package net.hb.day20;
import java.util.Scanner;
public class Exercise02 { //154페이지 예제 3-15
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true)
		{System.out.print("나뉨수를 입력하세요. >>> ");
		 int a = scanner.nextInt();
		 System.out.print("나눔수를 입력하세요. >>> ");
		 int b = scanner.nextInt();
		 	try
		 	{System.out.println(a+"를 "+b+"로 나누면 몫은 "+(a/b)+"입니다.");	break;}
		 	catch (ArithmeticException e)
		 	{System.out.println("0으로 나눌 수 없습니다.");}
		 	scanner.close();
		}
	}
}