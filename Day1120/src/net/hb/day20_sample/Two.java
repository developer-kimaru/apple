package net.hb.day20_sample;

//139페이지 맨마지막 2차원배열초기화
public class Two {
	public static void main(String[] args) {
	   int intArray[][] = {{0,1,2},{3,4,5},{6,7,8} } ;
	   char charArray[][] = { {'a','b','c'}, {'d','e','f'} } ;
	   double doubleArray[][] = { {0.01, 0.02}, {0.03,0.04}} ;
	   
	   //140페이지 2차원배열
	   double[][] score = {
		   {3.3, 3.4},  //0번째행
		   {3.5, 3.6, 7.8, 6.2, 5.9},  //1번째행
		   {3.7, 4.0},  //2번째행
		   {4.1, 4.2}   //3번째행
	   };
	   //System.out.println("배열가로행 " + score.length);
	   //System.out.println("배열세로열 " + score[1].length);
	   //가로행 4행 , 세로열 2열
	   //가로배열이름.length    세로 배열[행].length
	   for(int year=0; year<score.length; year++) {
		   for(int term=0; term<score[year].length; term++) {
			   System.out.print(score[year][term] + "  ");
		   }//term end
		   System.out.println();
	   }//year end
		  
	   
	}//end
}//class END










