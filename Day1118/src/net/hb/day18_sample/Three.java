package net.hb.day18_sample;

public class Three {
	public static void main(String[] args) {
	   int kor=0,eng=0,tot=0;
	   double avg=0.0;
	   String msg="�հݿ��θ޼���";
	   char grade='F'; //charŸ���� �ѱ���ǥ�� '��'
	   
	   kor=90;
	   eng=100;

	   tot=kor+eng;
	   avg=(double)tot/2;
	   
	   if (avg>=70) { msg="���հ�";  }
	   else { msg="�����";   }
	   
	   //���� 100~90 A,  80~89 B  70~79 C  60~69 D  0~59 F
	   // if ~ else if ~ else ��� 100������ switch���
	   //101������  10������  ����/10 ��ó��  83.9, 86.1, 80.3 , 84.7
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
	   
	   System.out.println("����=" + tot);
	   System.out.println("���=" + avg);
	   System.out.println("����=" + grade);
	   System.out.println("���=" + msg);
	}//main end
}//Three class END











