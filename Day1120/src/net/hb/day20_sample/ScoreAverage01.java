package net.hb.day20_sample;


public class ScoreAverage01 {
	public static void main(String[] args) {	   
	   //140������ 2�����迭
	   double[][] score = {
		   {3.3, 3.4},  //0��°��
		   {3.5, 3.6, 7.8, 6.2, 5.9},  //1��°��
		   {3.7, 4.0},  //2��°��
		   {4.1, 4.2}   //3��°��
	   };

	   for(int year=0; year<score.length; year++) {
		   for(int term=0; term<score[year].length; term++) {
			   System.out.print(score[year][term] + " ");
		   }//term end
		   System.out.println();//������� ���ΰ����ϸ� ���� ������ ¯
	   }//year end
		  
	   
	}//end
}//class END










