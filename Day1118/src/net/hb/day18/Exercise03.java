package net.hb.day18;
public class Exercise03
{	public static void main(String[] args)	{	//118 페이지 / 예제 3-1
	
	int sum = 0;
	
	for	(int a=1;	a<21;	a++)
	{	sum += a;
		System.out.print(a);
		if	(a<=19)
			System.out.print("+");
		else
		{	System.out.print("=");
			System.out.print(sum);	}}}}