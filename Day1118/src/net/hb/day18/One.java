package net.hb.day18;
public class One {
	
	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "�հ�";
		char grade = 'A';
		
		kor = 85 ;				eng = 90 ;
		sum = kor + eng;		aver = (double)sum/2;
		
		if (aver>=70)	{ message = "�հ�";	grade = 'A';}
		else			{ message = "�����";	grade = 'B';}
		//if(Aver>=70)		{	{message = "��! �հ�!"}
		//	if(aver>=90)		{grade = 'A';}
		//	else if(aver>=80)	{grade = 'B';}
		//	else if(aver>=70)	{grade = 'C';}			}			
		//else 					{message = "���հ�!"}
		//	if(aver>=60)	{	{grade = 'D';}
		//	else				{grede = 'F';}			}
		
		System.out.println("���� = "+sum);
		System.out.println("��� = "+aver);
		System.out.println("���� = "+grade);
		System.out.println(message);
	}
}