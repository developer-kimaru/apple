package net.hb.day20_sample;

public class  SJTest {
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg ="합격메세지";
		   
		   kor=90;
		   eng=85;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //if(평균>=70)합격 ~else 재시험
		   if(avg>=70) { msg="축합격"; }
		   else { msg="재시험"; }
		   
		   String ret = (avg >=70) ? "succcess" : "failed" ;
		   int ok = (avg >=70) ? 1 : 0 ;
		   char ck = (avg >=70) ? 'O' : 'X' ;
		   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("결과=" + msg);
		   System.out.println("결과=" + ret);
		   System.out.println("결과=" + ok);
		   System.out.println("결과=" + ck);
	}//main end
}//class END





