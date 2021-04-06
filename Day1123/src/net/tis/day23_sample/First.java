package net.tis.day23_sample;

public class First {

	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=90;
		   eng=85;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //합격여부는 평균70점부터 축합격 /else 재시험
		   if(avg>=70) {msg="축합격";  }
		   else { msg="재시험";   }
		   
		   //삼항연산을 적용해서 기술  (조건)? 만족: 불만족
		   //합격여부는 평균70점부터 pass /else failed
		   String ok = (avg>=70)? "pass" : "failed" ;
				   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("결과=" + msg);
		   System.out.println("결과=" + ok);
	}//main end

}//class END







