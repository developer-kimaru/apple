package net.hb.day19;
public class DoWhileTest05 {
	public static void main(String[] args) {
	//반복문 for, while, 121페이지 참고 do~while
		
	int num = 0;
	while (true)
	{	num = num + 1;
			if (num%5==0)
			{	System.out.print(num+"\n");}
			else 
				System.out.print(num+"\t");
		if(num==30) {break;}					}
	}
}

//	1	2	3	4	5
//	6	7	8	9	10
//	11	12	13	14	15
//	16	17	18	19	20
//	21	22	23	24	25
//	26	27	28	29	30
//	이렇게 출력되게끔..