package net.hb.day20_sample;


public class ScoreAverage02 {
	public static void main(String[] args) {	   
	   //140������ 2�����迭
	   double[][] score = {
		   {3.3, 3.4},  //0��°��
		   {3.5, 3.6, 7.8, 5.9},  //1��°��
		   {3.7, 4.0},  //2��°��
		   {4.1, 4.2}   //3��°��
	   };

	   for(int a=0; a<score.length; a++) { //a��� row
		   for(int b=0; b<score[a].length; b++) {  //b��� column
			   System.out.print(score[a][b] + " ");
		   }//b end
		   System.out.println();
	   }//a end
		  
	}//end
}//class END










