package net.tis.day23;

public class One {
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=90;
		   eng=45;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //���� ������ �����ؼ� ��� (����)?
		   //�հݿ��δ� ���70������ ���հ� /else �����
		   
		   String result = (avg>=70) ? "Pass" : "Failed";
		   
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("���=" + result);
	}//main end

}//class END
