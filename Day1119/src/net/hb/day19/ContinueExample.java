	package net.hb.day19;
	import java.util.Scanner;
	public class ContinueExample { // 125page
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("정수를 5개 입력하세요. >>> ");
			int sum =0;
			for (int a=0; a<5; a++)
			{	int b = scanner.nextInt();
				if	(b<=0)	continue;
				else		sum+=b	;			}
			
			System.out.println("양수의 합은 " + sum);
			
			scanner.close();
			
			// int kor = 90;
			// System.out.println("kor=" + kor);
		}
	}