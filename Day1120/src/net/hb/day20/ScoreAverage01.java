package net.hb.day20;
public class ScoreAverage01 { //139페이지 맨 마지막 2차원 배열 초기화
	public static void main(String[] args) {
		int intArray[][]		= {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		int charArray[][]		= {{'a','b','c'}, {'d','e','f'}};
		double doubleArray[][]	= {{0.01,0.02},{0.03,0.04}};
		
		double score [][] = 
		{	{3.3, 3.4},					//1번째행
			{3.5, 3.6, 7.8, 6.2, 5.9},	//2번째행
			{3.7, 4.0}, 				//3번째행
			{4.1, 4.2}};				//4번째행
		// 가로행 4행(배열이름.length), 세로열 2열(배열[행].length)
		
		System.out.println("배열가로행"	+ score.length);
		System.out.println("배열세로행"	+ score[1].length);
		
		for	(int year=0; year<score.length; year++)
			{for(int term=0; term<score.length; term++)
			{System.out.print(score[year][term]+" ");}
			System.out.println();
			}
		
	}
}