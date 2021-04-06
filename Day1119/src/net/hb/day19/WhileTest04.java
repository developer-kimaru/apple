package net.hb.day19;
public class WhileTest04 {
	public static void main(String[] args) {
	//do~while 반복문, while 반복문 비교
		
	int num = 0, sum = 0;
	while (num<10)
	{	num = num + 1;
		System.out.print(num + " ")	;
		sum = sum + num				;	}
	
	System.out.println();
	System.out.print("합계 = "+sum);
	}	
}