package net.tis.day23_sample;

public class Three {
	public static void main(String[] args) {
		//88페이지 비트연산  &  |  ^  ~   85페이지 논리연산 비슷해요
		int a = 1;    //0001
		int b = 7;    //0111
		//&and연산 둘다 1일때 true일때연산
		//|or연산 둘중에 하나만 만족=true 1일때 일때연산
	    //^캐럿연산 거짓일때 1 0 / 0 1 연산결과 1
				
		int x = (a & b);
		int y = (a | b);
		int z = a ^ b;
		System.out.println(a +"&"+b+"="+ x);
		System.out.println(a +"|"+b+"="+ y);
		System.out.println(a +"^"+b+"="+ z);
	}//main end

	
	public void note( ) { //Non-static메소드
		//void키워드가 있으면 내용만기술나열, 즉 리턴값없음 
		System.out.println("note메소드");
	}//note end
}//class END






