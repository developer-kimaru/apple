package net.tis.day24;
public class Two {
	public Two() {} //기본 생성자=생략 가능, new 키워드 다음에 생성자 기술
	
	public static void main(String[] args) {
		//this.note();	<< static 키워드가 있을 때 this 사용 불가
		//Two.note();	<< main 메소드는 static이 있어서 static없는 note 사용 불가
		Two aa = new Two ();	aa.note(); //non-static 메소드 접근을 위해 aa객체 생성
		System.out.println("main 메소드");
		System.out.println("main 영수증");
		System.out.println("main 주차증");
	} // end
	
	public double rate ()	{ //non-static 메소드
		double r = 7.8;		return r;}
	
	public boolean getConnect() {
		boolean ct = true;	return ct;}
	
	public int price() {
		int value = 2900;	return value;}
	
	public String getTitle() {
		String title = "톰과 제리";	return title;
		}	//end, return을 주면 getTitle()도 "톰과 제리"로 기억함
	
	public void note() { //non-static 메소드에서는 this 사용 가능
		// System.out.println(title); << 에러
		// non-static 메소드에서는 this 키워드 사용 가능
		// non-static 메소드에서는 this.정보 목록이 표시됨
		// note 메소드를 main에서 호출
		System.out.println(getTitle());
		String a = this.getTitle();
		System.out.println(getTitle());
		} //end
	
} //Two class end