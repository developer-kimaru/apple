package net.hb.day18;
import java.util.Scanner;
public class Exercise04
{	public static void main(String[] args)	{	//120 페이지 / 예제 3-2

		int count = 0, sum = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. >>>> ");
		
		int a =	scanner.nextInt();
		while 	(a != -1)
		{		sum += a ;
				count++;
				a = scanner.nextInt();	}
		if (count==0)
				System.out.println("입력된 수가 없습니다.");
		else {
				System.out.print("정수의 개수는 " + count + "개이며,");
				System.out.println("평균은 " + (double)sum/count + "입니다.");	}
		
		scanner.close();	}}