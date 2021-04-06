package net.hb.day18;
public class ForTest01 { //for반복문 연습
	public static void main(String[] args) {
		
		int number = 0,	sum = 0 ;
		//변수 초기화 없이 선언만 하면 13번 sum=sum+number;에서 오류 (sum의 초기값이 없기 때문에)
		
		for	(int	a=1;	a<6;	a=a+1)
		{	//a는 출력하지 말고 number 변수를 통해 출력
			//sum 값을 출력하는 경우,
			number = number+1;
			System.out.print(number + " ");	}
			System.out.println();
			sum = sum + number;	
			System.out.println("sum = "+ number + sum);	}
}