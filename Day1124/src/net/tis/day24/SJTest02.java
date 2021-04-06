package net.tis.day24;
import java.util.Scanner;
public class SJTest02 {
	public static void main(String[] args) {
		//문제 kor, eng, sum 변수 double aver 평균, String msg, char grade 변수
		int kor = 0, eng = 0, sum = 0;
		double aver = 0.0;	String msg = "";	char grade = 'a';		

		//문제 1] try~catch 사용 권장, scanner 클래스, 국어/영어 키보드 입력
		//문제 2] 합계, 평균, 학점 switch, 결과는 삼항연산으로
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("국어 점수를 입력해주세요. >>> ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요. >>> ");
		eng = sc.nextInt();							} //try end
		
		catch	(Exception e)
		{System.out.println("정수만 입력해주세요.");		} //catch end
		
		
		sum = kor + eng ;
		aver = (double)sum/2;
		
		switch ((int)aver/10)
		{case 10	:	
		case 9		:	grade = 'A';	break;
		case 8		:	grade = 'B';	break;
		case 7		:	grade = 'C';	break;
		case 6		:	grade = 'D';	break;
		default		: 	grade = 'F';			} //switch end

		msg = aver>=60.0	?	"합격"	:	"불합격";
		
		System.out.println("국어 점수 = "+kor);
		System.out.println("영어 점수 = "+eng);
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+aver);
		System.out.println("합격여부 = "+msg);
		System.out.println("학점 = "+grade);
		
		sc.close();
		
	} //end
} //class end