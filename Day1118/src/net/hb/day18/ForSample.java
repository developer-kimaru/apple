package net.hb.day18;
public class ForSample { //교재 118페이지 연습
	
	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
				
			for (a=0;	a<11;	a++) 	{
				sum += a;
				System.out.print(a);			
			
			if		(a<10)
				System.out.print("+");	
			else						{
				System.out.print("=");
				System.out.print(sum); 
			}				
		}
	}
}