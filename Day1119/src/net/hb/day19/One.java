package net.hb.day19;
public class One {
	
	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "합격여부";
		char grade = 'A';
		
		kor = 90 ;				eng = 75 ;
		sum = kor + eng;		aver = (double)sum/2;
		
		//합격여부 : 과목별 60점부터, 평균 70점부터 합격 / else 재시험
		
			if	 (aver>=70)
				 {if (kor>=60 && eng>=60)	message = "합격";	
				  else message = "불합격";					}
			else message = "불합격";
		
		System.out.println("국어 = "+kor);
		System.out.println("영어 = "+eng);
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+aver);
		System.out.println("결과 = "+message);
	}
}