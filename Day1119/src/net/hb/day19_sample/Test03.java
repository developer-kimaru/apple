package net.hb.day19_sample;

public class Test03 {
	public static void main(String[] args) {
		int a=9;
		int b=2;
		int c=6;
		int d=4;
		// 2  4  6  9 ���
		 if(a<b && a<c ) { //a�����������
			 if(b<c){ System.out.println(a+" "+b+" "+c); }
			 else { System.out.println(a+" "+c+" "+b); }
		 }else if( b<c) { //b����������� 
			 if(a<c){ System.out.println(b+" "+a+" "+c); }
			 else{ System.out.println(b+" "+c+" "+a); }
		 }else { //c����������� 
			 if(a<b){ System.out.println(c+" "+a+" "+b); }
			 else {  System.out.println(c+" "+b+" "+a); }
		 }
	}//main end
}//class END
