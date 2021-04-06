package net.hb.day19;
public class TestArray01 {
	public static void main(String[] args) {

		// int number[]		= { 34 } 	;	//배열의 초기값을 설정
		// String city[]	= {"여의도"}	;
		// double rate []	= {23.4}	;
				
		int[] number = new int[6];
		number[0]=1;	number[1]=2;	number[2]=4;
		number[3]=8;	number[4]=16;	number[5]=32;
		
		// 첫번째 배열의 내용을 출력 for 반복문 이용
		// 두번째 배열의 크기는 length

		for (int a=0; a<number.length; a++) // a<number.length = a<6
			{System.out.print(number[a]+" ");}
		
		System.out.println();
		
		for (int k : number) //136페이지
			{System.out.print(k+" ");}
			
	}
}