package net.tis.day23_sample;

public class Two{
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=65;
		   eng=41;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //논리연산 if문 평균70점부터, 과목별 60점부터 하나조건만 만족해도 합격
		   if(avg>=70 || kor>=60 || eng>=60) {msg="축합격";  }
		   else { msg="재시험";   }
		   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("결과=" + msg);
	}//main end

}//class END
