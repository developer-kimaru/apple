package net.hb.day20;
public class ScoreAverage02 { //139������ �� ������ 2���� �迭 �ʱ�ȭ
	public static void main(String[] args) {
		int intArray[][]		= {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		int charArray[][]		= {{'a','b','c'}, {'d','e','f'}};
		double doubleArray[][]	= {{0.01,0.02},{0.03,0.04}};
		
		double score [][] = 
		{	{3.3, 3.4},					//1��°��
			{3.5, 3.6, 7.8, 6.2, 5.9},	//2��°��
			{3.7, 4.0}, 				//3��°��
			{4.1, 4.2}};				//4��°��
		// ������ 4��(�迭�̸�.length), ���ο� 2��(�迭[��].length)
		
		System.out.println("�迭������"	+ score.length);
		System.out.println("�迭������"	+ score[1].length);
		
		for	(int a=0; a<score.length; a++)
			{for(int b=0; b<score[a].length; b++)
			{System.out.print(score[a][b]+" ");	}
			System.out.println();				}
		
	}
}