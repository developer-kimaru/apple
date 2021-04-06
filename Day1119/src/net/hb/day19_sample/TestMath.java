package net.hb.day19_sample;

import java.util.Random;

public class TestMath {

	public static void main(String[] args) {
		 double a=4.7, b=9.1, c=67.824, d=67.825;

		  System.out.println(Math.round(a) +"\t" + Math.round(b)); //5  9
		  System.out.println(Math.ceil(a) +"\t" + Math.ceil(b));   //5.0 10.0
		  System.out.println(Math.floor(a) +"\t" + Math.floor(b)); //4.0  9.0

		  System.out.println( );

		  //double c=67.824, d=67.825
		  System.out.printf("c = %.2f\n" , c);  //67.82
		  System.out.printf("d = %.2f\n" , d);  //67.83
		  
		    int x = (int)(Math.random()*45)+1;//1~45
		    Random rd=new Random();
			int y = rd.nextInt(45)+1;//1~45
			System.out.println();
			System.out.println("난수=" + x );
			System.out.println("난수=" + y );

			System.out.println( );
			int i = 3;
			int j = 5;
			System.out.println("pow함수=" + Math.pow(i, 2));  //제곱근   3*3=9.0
			System.out.println("pow함수=" + Math.pow(j, 2));   //제곱근   5*5=25.0
			System.out.println("sqrt(25) : "+ Math.sqrt(25));   //5.0
			System.out.println("abs(-34)  "+ Math.abs(-34));    //34
	}
}//class END
