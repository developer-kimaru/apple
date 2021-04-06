package net.hb.day18_sample;

public class Three {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="합격여부메세지";
	   char grade='F'; //char타입은 한글자표현 'ㄹ'
	   
	   kor=90;
	   eng=100;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) { msg="축합격";  }
	   else { msg="재시험";   }
	   
	   //학점 100~90 A,  80~89 B  70~79 C  60~69 D  0~59 F
	   // if ~ else if ~ else 대신 100페이지 switch제어문
	   //101페이지  10번라인  점수/10 몫처리  83.9, 86.1, 80.3 , 84.7
	   switch((int)avg) {
	     case 10:
	       grade ='A'; break;
	     case 9:
		   grade ='A'; break;
	     case 8:
		   grade ='B'; break;
	     case 7:
		   grade ='C'; break;
	     case 6:
		   grade ='D'; break;
		 default: 
	 	  grade = 'F'; break;
	   }
	   
	   System.out.println("총점=" + tot);
	   System.out.println("평균=" + avg);
	   System.out.println("학점=" + grade);
	   System.out.println("결과=" + msg);
	}//main end
}//Three class END











