package net.hb.day19;
import java.util.Scanner;
public class ArrayLength { // 135페이지 예제 3-8
	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		int sum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하세요. >>> ");
		
		for (int a=0; a<intArray.length; a++)
		{intArray[a] = scanner.nextInt();	}
		
		for	(int a=0; a<intArray.length; a++)
		{	sum+=intArray[a];				}
		
		System.out.println("평균은 "+(double)sum/intArray.length);
		scanner.close();
		
	}

}
