package net.hb.day18_sample;

public class Two {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="�հݿ��θ޼���";
	   char grade='F'; //charŸ���� �ѱ���ǥ�� '��'
	   
	   kor=90;
	   eng=85;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) { msg="���հ�";  }
	   else { msg="�����";   }
	   
	   //���� 100~90 A,  80~89 B  70~79 C  60~69 D  0~59 F
	   // if ~ else if ~ else 
	   if (avg>=90) { grade='A'; }
	   else if (avg>=80) { grade='B'; }
	   else if (avg>=70) { grade='C'; }
	   else if (avg>=60) { grade='D'; }
	   else { grade='F'; }
	   
	   System.out.println("����=" + tot);
	   System.out.println("���=" + avg);
	   System.out.println("����=" + grade);
	   System.out.println("���=" + msg);
	}//main end
}//Two class END











