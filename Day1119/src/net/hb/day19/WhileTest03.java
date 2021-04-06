package net.hb.day19;
public class WhileTest03 {
	
	public static void main(String[] args) {
		//switch,		반복문 탈출 break;
		//switch적용x,	반복문 for, while, do~while
		//124페이지 continue 보조제어문
		//119페이지 while(조건:num<10, true) {}
		//while 반복문으로 1~10 출력
		int kor = 0, eng = 0, sum = 0, num = 0;
		
		while(true)	//무한루프
		{	num = num +1;
			if	(num==5)	{continue;	}
			System.out.print(num+" ");
			sum = sum + num;
			if	(num==10)	{break;		}				}
		
		System.out.println(sum);
	}
}