package net.hb.day19;
public class GradeTest {

	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "�հݿ���";
		char grade = 'F';

		kor = 90 ;				eng = 5 ;
		sum = kor + eng;		aver = (double)sum/2;
		//�հݿ��� : ���� 60������, ��� 70������ �հ� / else �����

		if		(aver>=90)	{grade = 'A';}
		else if	(aver>=80)	{grade = 'B';}
		else if	(aver>=70)	{grade = 'C';}
		else if	(aver>=60)	{grade = 'D';}
		else				{grade = 'F';}
		//���� else�� ���� �Է����� �ʴ� ��� �ʱ� ������ ������ Ȯ���ؾ���

		System.out.println("���� = "+sum);
		System.out.println("��� = "+aver);
		System.out.println("���� = "+grade);
		//System.out.println("��� = "+message);
	}
}