package net.hb.day18_sample;

public class First {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="합격여부메세지";
	   char grade='F'; //학점표시
	   
	   kor=90;
	   eng=85;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) {
		  msg="축합격";
		  if(avg>=90) { grade='A'; }
		  else if( avg>=80) { grade='B'; }
		  else if(avg>=70 ) {  grade='C';}
	   }
	   else {
		  msg="재시험";
		  if(avg>=60) { grade='D'; }
		  else { grade='F'; }
	   }
	   
	   
	   System.out.println("총점=" + tot);
	   System.out.println("평균=" + avg);
	   
	}//main end
}//class END









