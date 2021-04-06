package net.hb.day20_sample;


public class ScoreAverage02 {
	public static void main(String[] args) {	   
	   //140페이지 2차원배열
	   double[][] score = {
		   {3.3, 3.4},  //0번째행
		   {3.5, 3.6, 7.8, 5.9},  //1번째행
		   {3.7, 4.0},  //2번째행
		   {4.1, 4.2}   //3번째행
	   };

	   for(int a=0; a<score.length; a++) { //a대신 row
		   for(int b=0; b<score[a].length; b++) {  //b대신 column
			   System.out.print(score[a][b] + " ");
		   }//b end
		   System.out.println();
	   }//a end
		  
	}//end
}//class END










