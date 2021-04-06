package net.tis.day24;
public class One {
		public String title = "화요일 원격수업";	//전역변수 =field=필드=멤버변수
											//non-static 필드=field
		public int qwd=1234;				//non-static 필드=field
		
	public static void main(String[] args) {
		String title = "몽블랑"; 				//지역변수=local variable=변수
		System.out.println("지역변수 title" + title);	} // end
	
	public One() {
		//기본새성자, 생략가능, 호출은 new 생성자 ()
		//생성자는 클래스 이름과 100% 동일해야하며, void 기술 금지, 리턴값 없음
		//전역변수=필드=field변수를 초기화
		System.out.println("기본생성자");
		System.out.println("기본생성자 생략 가능");
		One one = new One() ; }
		//생성자도 메소드 동일화, 메소드는 반드시 호출해야 사용
		//One타입 one 변수객체 = new 메모리영역 힙 First() 생성자;
		//기본생성자 end
		
	public static void food() { //static 메소드 = 클래스 메소드
		System.out.println("음식메뉴 어플");}//end
	
	public void order () { //non-static 메소드 = 일반 메소드
		System.out.println("주문어플"); } //end

}//class end