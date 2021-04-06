package net.tis.day23;
public class Lotto {
	public static void main(String[] args) {
		//372페이지 Math.random(), Random 클래스 r = new Random();
		
		int com [] = new int [6];
		for	(int a = 0; a<com.length; a++)
			{com[a] = (int)(Math.random()*45) + 1;		
			System.out.println("난수 = "+com[a]);
			// 1~10사이의 정수 6개를 발생하려면, (int)Math.random()*10
			} //for end
	} // main end
} // class end
