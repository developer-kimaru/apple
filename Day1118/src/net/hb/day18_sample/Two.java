package net.hb.day18_sample;

public class Two {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="합격여부메세지";
	   char grade='F'; //char타입은 한글자표현 'ㄹ'
	   
	   kor=90;
	   eng=85;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) { msg="축합격";  }
	   else { msg="재시험";   }
	   
	   //학점 100~90 A,  80~89 B  70~79 C  60~69 D  0~59 F
	   // if ~ else if ~ else 
	   if (avg>=90) { grade='A'; }
	   else if (avg>=80) { grade='B'; }
	   else if (avg>=70) { grade='C'; }
	   else if (avg>=60) { grade='D'; }
	   else { grade='F'; }
	   
	   System.out.println("총점=" + tot);
	   System.out.println("평균=" + avg);
	   System.out.println("학점=" + grade);
	   System.out.println("결과=" + msg);
	}//main end
}//Two class END











