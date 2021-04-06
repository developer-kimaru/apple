package net.hb.day19;
public class DoWhileTest03 {
	public static void main(String[] args) {
	//반복문 for, while, 121페이지 참고 do~while
		
	int num = 0, sum = 0;
	do
	{	num = num + 1;
		System.out.print(num + " ")	;
		sum = sum + num				;}
	while (num < 10) ;
	
	System.out.println();
	System.out.print("합계 = "+sum);
	}	
}