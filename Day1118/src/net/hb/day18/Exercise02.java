package net.hb.day18;
public class Exercise02
{	public static void main(String[] args)	{	//118 페이지 / 예제 3-1
		int sum = 0;
	
		for (int a=1;	a<11;	a++)
				{	sum += a; System.out.print(a);
		if	(a<=9)	System.out.print("+");
		else	{	System.out.print("=");
					System.out.print(sum);	}}}}