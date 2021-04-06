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
		   
		   //합격여부는 평균70점부터, 과목별 60점부터 축합격 /else 재시험
		   if	(avg>=70 && kor>=60 && eng>=60)
		   		{msg = ("합격");}
		   else	{msg="재시험";};
		   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("결과=" + msg);
	}//main end

}//class END
