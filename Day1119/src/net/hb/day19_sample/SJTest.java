package net.hb.day19_sample;

public class  SJTest {
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   char grade='F'; //����ǥ��
		   
		   kor=90;
		   eng=85;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //if~elseif~else  100~90 A, 80~89 B, 70~79 C, 60~69 D, 0~59 F
		   if (avg >= 90) { grade='A'; }
		   if (avg >= 80) { grade='B'; }
		   if (avg >= 70) { grade='C'; }
		   if (avg >= 60) { grade='D'; }
		   if (avg < 60) { grade='F'; }
		   
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("����=" + grade);
	}//main end
}//class END





