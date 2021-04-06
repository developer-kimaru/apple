package net.hb.day19;
public class Two {
	
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
			
		//학점 switch (double타입은 문법에러) 제어문 구하기
		//82.7,	84.5,	89.1
		//82,	84,		89		>> int형
		//8,	8,		8		>> /10 몫
		switch((int)aver/10)
			{	case 10	:	grade='A';	break;
				case 9	:	grade='B';	break;
				case 8	:	grade='C';	break;
				case 7	:	grade='D';	break;	
				default	:	grade='F';	break;	}
		// double 타입은 문법에러가 나므로 int형으로 변경
		
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+aver);
		System.out.println("학점 = "+grade);
		System.out.println("결과 = "+message);
	}
}