package net.tis.day23;

public class One {
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=90;
		   eng=45;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //삼항 연산을 적용해서 기술 (조건)?
		   //합격여부는 평균70점부터 축합격 /else 재시험
		   
		   String result = (avg>=70) ? "Pass" : "Failed";
		   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("결과=" + result);
	}//main end

}//class END
