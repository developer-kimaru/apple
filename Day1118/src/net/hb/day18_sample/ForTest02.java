package net.hb.day18_sample;

public class ForTest02 { //for반복문 연습
	public static void main(String[] args) {
		int number=0,total=0, gob=1; 
		for( int b=0; b<5; b++) {
			number++ ; 
			System.out.print(number + " ");
			total = total + number ;
			gob  =  gob * number ; //1*1=1 1*2=2  2*3=6 6*4=24 24*5=120
		}
		
		System.out.println();
		System.out.println("합출력=" + total );
		System.out.println("곱출력=" + gob );
	}//main end
}//ForTest02 class END







