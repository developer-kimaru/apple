package net.hb.day18;
public class Three {
	
	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "�հ�";
		char grade = 'A';
		
		kor = 25 ;			eng = 90 ;
		sum = kor + eng;	aver = (double)sum/2;
		
		if (aver>=70)		{message = "�հ�";}
		else				{message = "�����";}
		
		// ���� 100~90 A / 80~89 B / 70~79 C / 60~69 D / 0~59 F
		// if ~ else
		
		if 		(aver>=90)	{grade = 'A';}
		else if (aver>=80)	{grade = 'B';}
		else if (aver>=70)	{grade = 'C';}
		else if (aver>=60)	{grade = 'D';}
		else				{grade = 'F';}
		
		System.out.println	("���� = "+sum);
		System.out.println	("��� = "+aver);
		System.out.println	("���� = "+grade);
		System.out.println	(message);
	}
}