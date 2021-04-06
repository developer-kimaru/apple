package net.tis.day24_sample;

public class Three {
	public static void main(String[] args) {
		Three er = new Three();
		er.myCal(7,2);   //myCal(int,int)
		er.myCal(175.0); //myCal(double) 
		//Three.myCal(7,2);   //에러 229페이지
		//Three.myCal(175.0); //에러 229페이지 
	}//end
	
	//함수이름중복=메소드이름중복=오버로딩=OverLoding
	public void  myCal(double data) { //Non-static메소드=일반메소드
		double mok = data/2;
		System.out.println("myCal메소드 평균=" + mok);
		System.out.println("myCal메소드 평균=" + (data/2) );
	}//end
	
	public void myCal(int a, int b) { //Non-static메소드=일반메소드
		System.out.println("myCal메소드 합계=" + (a+b));
		int hap = a+b ;
		System.out.println("myCal메소드 합계=" + hap);
	}//end
}//Three class END







