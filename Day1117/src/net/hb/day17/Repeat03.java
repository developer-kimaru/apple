package net.hb.day17;

public class Repeat03 {

	public static void main(String[] args) {

		String name = "김동백";
		int kor = 90, eng = 70, mat = 75;
		int sum = 0;
		double aver = 0.0;
		sum = kor + eng + mat;
		aver = (double)sum/3;
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : "+sum);
		System.out.println("평균점수 : "+aver);
		
		
}
}