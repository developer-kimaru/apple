package net.hb.day20;
public class Three { //return 단독단행 = 탈출(return 환급값)
	public static void main(String[] args) {
		int data [] = lotto();
		for(int number:data)
		{System.out.print(number + " ");			}
		System.out.println();
		
		String like = book();
		System.out.println("돌려주는 책 제목 = "+like);
		
		System.out.println("우리니라");
		System.out.println("금수강산");
		System.out.println("화려강산");
		// return ; << 여기에 기술하면 문법에러
		System.out.println("주차증면제 10:38");
		System.out.println("영수증출력 10:38");
		return;										}
		//맨 마지막에 return'만' 기술하면 의미없음 (있으나 없으나 실행)
		public static int[] lotto()
		{ int[] number = {1, 2, 3, 4, 5, 6};
		//return 데이터값 number 기술하면 메소드 lotto() 기억
		return number;								}
		
		public static String book() {
		String book = "몽블랑 ";
		return book;				}
}