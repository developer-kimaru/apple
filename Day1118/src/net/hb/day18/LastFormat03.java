package net.hb.day18;
public class LastFormat03{
	public static void main(String[] args) {
		
		double	quoD=0.0;
		quoD =	(double)19/3;
		
		System.out.println(quoD);
		System.out.printf("%.2f\n", quoD); //3�ڸ��� 3f, 4�ڸ��� 4f, n�ڸ��� nf �̷� ��
		System.out.println();
		
		System.out.printf("%.2f\n", 345.343);
		System.out.printf("%.2f\n", 345.348); //�Ҽ��� 3�ڸ������� �ݿø��Ǿ� ǥ��
		System.out.println();
		
		System.out.printf("%8.2f\n", 345.343);
		System.out.printf("%8.2f\n", 345.348);
		// \n(�ٳѱ��)�� ���� ���� �ٷ� �ٿ��� ������� :: "%8.2f\n" 
	}
}