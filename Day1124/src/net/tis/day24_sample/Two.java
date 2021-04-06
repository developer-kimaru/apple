package net.tis.day24_sample;

public class Two {
	public static void main(String[] args) {
		//에러 this.note(); static키워드가 있을때 this기술하면 에러
		//에러 Two.note(); main메소드는 static있어서 static없는 note접근못함
		Two ob = new Two() ; //Non-static메소드접근을 위해서 ob객체생성
		ob.note();
		System.out.println("main메소드");
		System.out.println("main영수증");
		System.out.println("main주차증");
	}//end
	
	public double rate(){ //non-static메소드
	  double r = 7.8;
	  return r ; 
	}//end
	
	public boolean getConnect( ){ //non-static메소드
		boolean ct=true;
		return ct;
	}//end
	
	public int price(){ //non-static메소드
		int value=2900;
		return value ;
	}//end
	
	public  String getTitle( ){//non-static메소드
	  String msg="코로나19조심";
	  return msg ;
	}//end
	
	public  void note( ){ //non-static메소드에서는 this사용가능
	   //System.out.println(msg); 에러
	   //non-static메소드에서는 this키워드 사용가능
	   //non-static메소드에서는 this.정보목록이 표시됨 
	   //note메소드를 main에서 호출
	   System.out.println(getTitle( )); //에러해결
	   String a = this.getTitle();
	   System.out.println(getTitle( )); //에러해결
	}//end
	
}//Two class END






