package net.tis.day23;

public class Two{
	public static void main(String[] args) {
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   
		   kor=95;
		   eng=50;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //�հݿ��δ� ���70������, ���� 60������ ���հ� /else �����
		   if	(avg>=70 && kor>=60 && eng>=60)
		   		{msg = ("�հ�");}
		   else	{msg="�����";};
		   
		   System.out.println("����=" + tot);
		   System.out.println("���=" + avg);
		   System.out.println("���=" + msg);
	}//main end

}//class END
