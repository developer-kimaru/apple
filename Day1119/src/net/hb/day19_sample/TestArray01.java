package net.hb.day19_sample;

public class TestArray01 {
	public static void main(String[] args) {
		//int su[] = { 34 }  ; 
		//String city[] = { "여의도" } ;
		//double rate[] = { 23.4 } ;
		int[] su = new  int[6];
		su[0]=37;  su[1]=45;  su[2]=7;
		su[3]=14;  su[4]=30;  su[5]=19;
		
		//첫번째 배열의 내용을 출력 for반복문이용
		//두번째 배열의 크기는 length
		for(int a=0; a<su.length ; a=a+1) {
		  System.out.print(su[a] + " ");	
		} System.out.println();
		
		for(int k : su) { //136페이지 for~each문 향상된for반복문
		  System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.print(su[0] + " " );
		System.out.print(su[1] + " " );
		System.out.print(su[2] + " " );
		System.out.print(su[3] + " " );
		System.out.print(su[4] + " " );
		System.out.print(su[5] + " " );
		System.out.println();
	}
}//class END








