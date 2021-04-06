package net.tis.day23;
public class MathEx {
	public static void main(String[] args) {
		
		double a = 3.14;
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));

		System.out.print("이번주 행운의 번호는 >> ");
		for	(int b=0; b<5; b++)
			{System.out.print((int)(Math.random()*45+1)+ " ");
			} // for end
	} //main end
} // end
