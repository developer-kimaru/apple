package net.hb.day18;
public class ForTest02 { //for반복문 연습
	public static void main(String[] args) {
		
		int num = 0,	sum = 0,	pro = 1; //곱셈 연산은 초기값을 1로 주는 것이 좋음
		for(int	b=0;	b<5;	b++)			{
			num++; //num++ = num+1
			System.out.print(num+"  ");
			sum = sum + num ;
			pro = pro * num;					}
		
		System.out.println();
		System.out.println("합출력 = " + sum);
		System.out.println("곱출력 = " + pro);
		
	}
}