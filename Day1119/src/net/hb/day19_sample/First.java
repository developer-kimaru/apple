package net.hb.day19_sample;

public class First {

	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   char grade='F'; //����ǥ��
		   
		   kor=90;
		   eng=45;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //�հݿ��δ� ���� 60������ ���70������ ���հ�/else �����
		   if(avg>=70) {
			   if(kor>=60 && eng>=60) {
				   msg="���հ�";
			   }else {msg="�����"; }
		   }else {
			  msg="�����";
		   }
		   
		   System.out.println("����=" + kor);
		   System.out.println("����=" + eng);
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("���=" + msg);
	}//main end

}//class END
