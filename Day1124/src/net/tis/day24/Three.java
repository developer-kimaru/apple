package net.tis.day24;
public class Three {
	public static void main(String[] args) {
		// Three.myCal(7, 2); << 에러 발생
		Three aa = new Three();
		aa.myCal(7, 2);
		aa.myCal(175.0);
	} // end
	
	public void myCal(double data) {
		double quo = data/2;
		System.out.println("myCal 메소드 평균 = "+quo);
		System.out.println("myCal 메소드 평균= "+(data/2));
	} // end
	
	public void myCal(int a, int b) { // non-static 메소드
		int sum = a+b;
		System.out.println("myCal 메소드 합계 = "+(a+b));
		System.out.println("myCal 메소드 합계 = "+sum);
	} //end
} //class Three end