package net.tis.day24;
public class AI { 	//193~194페이지 this 키워드
					//this키워드는 현재 클래스를 접근, static에서는 문법 에러
					//1. 지역변수, 전역변수 이름이 동일할 때
					//2. 매개인자, 전역변수 이름이 동일할 때
		int IQ = 2400; //필드 전역변수, IQ 데이터를 display로 출력
		int m = 0;
		int total = 1000; //전역변수, non-static 접근할 때 this
		
	public static void main(String[] args) {
		// System.out.println("AI클래스 IQ지역변수 "+ this.IQ);	<< 이건 에러
		// static에서는 문법 에러
		System.out.println("AI클래스 ");
		// System.out.println("AI클래스 "+IQ);
		// main함수에서 display() 호출
		AI tis = new AI();
		tis.display();
		tis.input(540); //540원 입금
		int mypoint = tis.grandTotal();
		System.out.println("총잔액 = "+mypoint);
	} //main end
	
	public void input(int m) {
		this.m = m;
	} //non-static메소드, end
	
	public int grandTotal() { //non-static메소드, end
		total = total + m ;
		return total;
	} //end
	
public void display() { //non-static메소드
	int IQ = 17; //
	System.out.println("AI클래스 IQ전역변수 "+ this.IQ);
	System.out.println("AI클래스 IQ지역변수 "+ IQ);
	} //display end

}//AI class end