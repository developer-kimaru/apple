package net.tis.day23;
public class Lotto {
	public static void main(String[] args) {
		//372������ Math.random(), Random Ŭ���� r = new Random();
		
		int com [] = new int [6];
		for	(int a = 0; a<com.length; a++)
			{com[a] = (int)(Math.random()*45) + 1;		
			System.out.println("���� = "+com[a]);
			// 1~10������ ���� 6���� �߻��Ϸ���, (int)Math.random()*10
			} //for end
	} // main end
} // class end
