package net.hb.day19;
public class One {
	
	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "�հݿ���";
		char grade = 'A';
		
		kor = 90 ;				eng = 75 ;
		sum = kor + eng;		aver = (double)sum/2;
		
		//�հݿ��� : ���� 60������, ��� 70������ �հ� / else �����
		
			if	 (aver>=70)
				 {if (kor>=60 && eng>=60)	message = "�հ�";	
				  else message = "���հ�";					}
			else message = "���հ�";
		
		System.out.println("���� = "+kor);
		System.out.println("���� = "+eng);
		System.out.println("���� = "+sum);
		System.out.println("��� = "+aver);
		System.out.println("��� = "+message);
	}
}