package net.hb.day19;
import java.util.Scanner;
public class ArrayAccess { // 133������ ���� 3-7
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		System.out.print("��� 5���� �Է��ϼ���. >>> ");
		for(int a=0; a<intArray.length; a++)
		{	intArray[a] = scanner.nextInt();
			if(intArray[a] > max) max = intArray[a];}
		
		System.out.println("5���� ���� �� �ִ밪�� "+max+"�Դϴ�.");
	}
}