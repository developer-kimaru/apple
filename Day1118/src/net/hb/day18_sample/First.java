package net.hb.day18_sample;

public class First {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="�հݿ��θ޼���";
	   char grade='F'; //����ǥ��
	   
	   kor=90;
	   eng=85;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) {
		  msg="���հ�";
		  if(avg>=90) { grade='A'; }
		  else if( avg>=80) { grade='B'; }
		  else if(avg>=70 ) {  grade='C';}
	   }
	   else {
		  msg="�����";
		  if(avg>=60) { grade='D'; }
		  else { grade='F'; }
	   }
	   
	   
	   System.out.println("����=" + tot);
	   System.out.println("���=" + avg);
	   
	}//main end
}//class END








