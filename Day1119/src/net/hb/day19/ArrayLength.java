package net.hb.day19;
import java.util.Scanner;
public class ArrayLength { // 135������ ���� 3-8
	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		int sum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length+"���� ������ �Է��ϼ���. >>> ");
		
		for (int a=0; a<intArray.length; a++)
		{intArray[a] = scanner.nextInt();	}
		
		for	(int a=0; a<intArray.length; a++)
		{	sum+=intArray[a];				}
		
		System.out.println("����� "+(double)sum/intArray.length);
		scanner.close();
		
	}

}
