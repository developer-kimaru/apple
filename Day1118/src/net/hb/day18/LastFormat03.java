package net.hb.day18;
public class LastFormat03{
	public static void main(String[] args) {
		
		double	quoD=0.0;
		quoD =	(double)19/3;
		
		System.out.println(quoD);
		System.out.printf("%.2f\n", quoD); //3자리는 3f, 4자리는 4f, n자리는 nf 이런 식
		System.out.println();
		
		System.out.printf("%.2f\n", 345.343);
		System.out.printf("%.2f\n", 345.348); //소수점 3자리수에서 반올림되어 표기
		System.out.println();
		
		System.out.printf("%8.2f\n", 345.343);
		System.out.printf("%8.2f\n", 345.348);
		// \n(줄넘기기)은 서식 옆에 바로 붙여서 적어야함 :: "%8.2f\n" 
	}
}