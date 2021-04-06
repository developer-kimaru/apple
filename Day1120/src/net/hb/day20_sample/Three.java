package net.hb.day20_sample;

//return단독단행 탈출   return 환급값 
public class Three {
	public static void main(String[] args) {
		int[] data = lotto();
		for(int su:data) {
			System.out.print(su + " ");
		} System.out.println();
		
		String like = book();
		System.out.println("돌려주는 책제목 = " + like);
		
		System.out.println();
		System.out.println("우리나라");
		System.out.println("금수강산");
		System.out.println("화려강산");
		//return ; 여기에 기술하면 문법에러 
		System.out.println("주차증면제 10:37 10:41");
		System.out.println("영수증출력 10:37 10:41");
		return ; //맨마지막에 return만 기술하면 의미없어요
	}//end

	public static int[] lotto() {
		int[] su = { 23, 9, 45, 29, 33, 16} ;
		//return 데이터값su 기술하면 메소드 lotto()기억 
		return su; 
	}//end
	
	public  static  String  book() {
	  String title="몽블랑" ;	
	  return title ; 
	}//end
	
}//class END











