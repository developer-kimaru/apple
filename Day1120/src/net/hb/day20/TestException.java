package net.hb.day20;

public class TestException {

	public static void main(String[] args) {
		int 	a=7, b=0, sum=0, pro=0, quo=0;
		try		{sum = a + b;	pro = a * b;	quo = a / b;}
		catch	(Exception e) { 	}
	
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" * "+b+" = "+pro);
		System.out.println(a+" / "+b+" = "+quo);
		
		System.out.println("\n마지막처리");
		System.out.println("영수증출력");
		System.out.println("주차비면제");
	}
}