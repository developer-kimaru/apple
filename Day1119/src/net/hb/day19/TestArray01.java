package net.hb.day19;
public class TestArray01 {
	public static void main(String[] args) {

		// int number[]		= { 34 } 	;	//�迭�� �ʱⰪ�� ����
		// String city[]	= {"���ǵ�"}	;
		// double rate []	= {23.4}	;
				
		int[] number = new int[6];
		number[0]=1;	number[1]=2;	number[2]=4;
		number[3]=8;	number[4]=16;	number[5]=32;
		
		// ù��° �迭�� ������ ��� for �ݺ��� �̿�
		// �ι�° �迭�� ũ��� length

		for (int a=0; a<number.length; a++) // a<number.length = a<6
			{System.out.print(number[a]+" ");}
		
		System.out.println();
		
		for (int k : number) //136������
			{System.out.print(k+" ");}
			
	}
}