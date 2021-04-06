package net.hb.day18;
public class ForTest03 { //for반복문 연습
	public static void main(String[] args) {
		
		int number = 0,	sum = 0,	proTotal = 1; //곱셈 연산은 초기값을 1로 주는 것이 좋음
		for(int	b=0;	b<5;	b = b+1)			{
			number = number +1 ; //= number++
			System.out.print(number+"  ");
			//sum = sum + number;
			sum += number ;
			proTotal = proTotal * number;					}
		System.out.println("합출력 = " + sum);
		System.out.println("곱출력 = " + proTotal);
	}
}