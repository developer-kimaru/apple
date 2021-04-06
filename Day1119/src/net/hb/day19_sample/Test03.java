package net.hb.day19_sample;

public class Test03 {
	public static void main(String[] args) {
		int a=9;
		int b=2;
		int c=6;
		int d=4;
		// 2  4  6  9 출력
		 if(a<b && a<c ) { //a제일작은경우
			 if(b<c){ System.out.println(a+" "+b+" "+c); }
			 else { System.out.println(a+" "+c+" "+b); }
		 }else if( b<c) { //b제일작은경우 
			 if(a<c){ System.out.println(b+" "+a+" "+c); }
			 else{ System.out.println(b+" "+c+" "+a); }
		 }else { //c제일작은경우 
			 if(a<b){ System.out.println(c+" "+a+" "+b); }
			 else {  System.out.println(c+" "+b+" "+a); }
		 }
	}//main end
}//class END
