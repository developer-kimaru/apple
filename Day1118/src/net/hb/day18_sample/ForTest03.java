package net.hb.day18_sample;

public class ForTest03 { //83������ ���Կ��� , 
	public static void main(String[] args) {
		int number=0,total=0, gobTotal=1; 
		for( int b=0; b<5; b++ ) {
			number++; 
			System.out.print(number + " ");
			total += number ;
			gobTotal *=  number ; //1*1=1 1*2=2  2*3=6 6*4=24 24*5=120
		}
		
		System.out.println();
		System.out.println("�����=" + total );
		System.out.println("�����=" + gobTotal );
	}//main end
}//ForTest03 class END






