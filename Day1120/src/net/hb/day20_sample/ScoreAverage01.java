package net.hb.day20_sample;


public class ScoreAverage01 {
	public static void main(String[] args) {	   
	   //140페이지 2차원배열
	   double[][] score = {
		   {3.3, 3.4},  //0번째행
		   {3.5, 3.6, 7.8, 6.2, 5.9},  //1번째행
		   {3.7, 4.0},  //2번째행
		   {4.1, 4.2}   //3번째행
	   };

	   for(int year=0; year<score.length; year++) {
		   for(int term=0; term<score[year].length; term++) {
			   System.out.print(score[year][term] + " ");
		   }//term end
		   System.out.println();//행단위로 라인개행하면 좋죠 가독성 짱
	   }//year end
		  
	   
	}//end
}//class END










