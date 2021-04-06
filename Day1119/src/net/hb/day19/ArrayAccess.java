package net.hb.day19;
import java.util.Scanner;
public class ArrayAccess { // 133페이지 예제 3-7
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		System.out.print("양수 5개를 입력하세요. >>> ");
		for(int a=0; a<intArray.length; a++)
		{	intArray[a] = scanner.nextInt();
			if(intArray[a] > max) max = intArray[a];}
		
		System.out.println("5가지 정수 중 최대값은 "+max+"입니다.");
	}
}