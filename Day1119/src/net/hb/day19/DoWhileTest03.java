package net.hb.day19;
public class DoWhileTest03 {
	public static void main(String[] args) {
	//�ݺ��� for, while, 121������ ���� do~while
		
	int num = 0, sum = 0;
	do
	{	num = num + 1;
		System.out.print(num + " ")	;
		sum = sum + num				;}
	while (num < 10) ;
	
	System.out.println();
	System.out.print("�հ� = "+sum);
	}	
}