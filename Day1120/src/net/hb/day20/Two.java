package net.hb.day20;
public class Two { //139������
	public static void main(String[] args) {
	   int intArray[][] = {{0,1,2},{3,4,5},{6,7,8} } ;
	   char charArray[][] = { {'a','b','c'}, {'d','e','f'} } ;
	   double doubleArray[][] = { {0.01, 0.02}, {0.03,0.04}} ;
	   
	   //140������ 2�����迭
	   double[][] score = {
		   {3.3, 3.4},					//0��°��
		   {3.5, 3.6, 7.8, 6.2, 5.9},	//1��°��
		   {3.7, 4.0},				 	//2��°��
		   {4.1, 4.2}	};				//3��°��
	   //System.out.println("�迭������ " + score.length);
	   //System.out.println("�迭���ο� " + score[1].length);
	   //������ 4�� , ���ο� 2��
	   //���ι迭�̸�.length    ���� �迭[��].length
	   for
	   (int year=0; year<score.length; year++)
	   {for(int term=0; term<score[year].length; term++)
	   {System.out.print(score[year][term] + "  ");		} //term end
		System.out.println();   } //year end
	}//end
}//class END










