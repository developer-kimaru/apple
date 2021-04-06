package net.hb.day19;
public class GradeTest {

	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "합격여부";
		char grade = 'F';

		kor = 90 ;				eng = 5 ;
		sum = kor + eng;		aver = (double)sum/2;
		//합격여부 : 과목별 60점부터, 평균 70점부터 합격 / else 재시험

		if		(aver>=90)	{grade = 'A';}
		else if	(aver>=80)	{grade = 'B';}
		else if	(aver>=70)	{grade = 'C';}
		else if	(aver>=60)	{grade = 'D';}
		else				{grade = 'F';}
		//만약 else를 따로 입력하지 않는 경우 초기 설정한 변수를 확인해야함

		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+aver);
		System.out.println("학점 = "+grade);
		//System.out.println("결과 = "+message);
	}
}