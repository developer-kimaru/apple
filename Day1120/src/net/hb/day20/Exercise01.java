package net.hb.day20;
public class Exercise01 { // 140페이지 예제3-10
	public static void main(String[] args) {

		double	score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double	sum = 0.0;
		for	(int year = 0; year<score.length; year++)
			for	(int term=0; term<score[year].length; term++)
				sum	+= score[year][term];
		
			int a = score.length;
			int b = score[0].length;
			System.out.println("4년 전체 평균은 "+ sum/(a*b));
	}
}