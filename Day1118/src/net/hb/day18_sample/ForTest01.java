package net.hb.day18_sample;

public class ForTest01 { //for반복문 연습
	public static void main(String[] args) {
		int su = 0, tot = 0 ; //변수초기화없이 선언만 
		for(int a=1; a<6; a=a+1 ) { //su변수출력 1~5 tot=15
			su = su + 1 ;
			System.out.print(su + " " );
			tot = tot + su ; 
		}//for end
		System.out.println("tot=" + tot);
		
		
		System.out.println();
		int num=0,hap=0; 
		for( int b=0; b<5; b++) {
			num++; 
			System.out.print(num + " ");
			hap = hap + num ;
		}
		System.out.println("hap=" + hap );
	}//main end
}//ForTest01 class END







