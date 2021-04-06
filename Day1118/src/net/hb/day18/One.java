package net.hb.day18;
public class One {
	
	public static void main(String[] args) {
		int kor = 0, eng = 1, sum = 2;
		double aver = 0.0;
		String message = "합격";
		char grade = 'A';
		
		kor = 85 ;				eng = 90 ;
		sum = kor + eng;		aver = (double)sum/2;
		
		if (aver>=70)	{ message = "합격";	grade = 'A';}
		else			{ message = "재시험";	grade = 'B';}
		//if(Aver>=70)		{	{message = "축! 합격!"}
		//	if(aver>=90)		{grade = 'A';}
		//	else if(aver>=80)	{grade = 'B';}
		//	else if(aver>=70)	{grade = 'C';}			}			
		//else 					{message = "불합격!"}
		//	if(aver>=60)	{	{grade = 'D';}
		//	else				{grede = 'F';}			}
		
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+aver);
		System.out.println("학점 = "+grade);
		System.out.println(message);
	}
}