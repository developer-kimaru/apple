package net.tis.day23;
public class Three { // 88페이지 비트연산 & | ^ ~
	public static void main(String[] args) {
		int a = 6 ;
		int b = 4 ;
		// &	and연산	둘 다 1을 만족할 때	=true일 떄 연산
		// |	or 연산	둘 중에 하나만 만족	=true 1일 때 연산
		// ^	캐럿연산	거짓 일 때			=1 0 / 0 1 연산결과 1
		int x = a & b ;
		int y = a | b ;
		int z = a ^ b ;

		System.out.println(a + "&" + b + "=" + x);
		System.out.println(a + "|" + b + "=" + y);
		System.out.println(a + "^" + b + "=" + z);

	} // main end
	
	public void note( ) { //Non-static 메소드
		// void 키워드가 있으면 내용만 기술 나열, 리턴값 없음
		
		System.out.println("note 메소드");
	} //note end
} // class end