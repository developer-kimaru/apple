package net.hb.day20_sample;

public class  SJTest {
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg ="�հݸ޼���";
		   
		   kor=90;
		   eng=85;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //if(���>=70)�հ� ~else �����
		   if(avg>=70) { msg="���հ�"; }
		   else { msg="�����"; }
		   
		   String ret = (avg >=70) ? "succcess" : "failed" ;
		   int ok = (avg >=70) ? 1 : 0 ;
		   char ck = (avg >=70) ? 'O' : 'X' ;
		   
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("���=" + msg);
		   System.out.println("���=" + ret);
		   System.out.println("���=" + ok);
		   System.out.println("���=" + ck);
	}//main end
}//class END





