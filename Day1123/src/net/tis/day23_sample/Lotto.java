package net.tis.day23_sample;

public class Lotto {
	public static void main(String[] args) {
		//372������ Math.random(), RandomŬ���� r = new Random();
		int[] com = new int[6];
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*45) + 1;
			System.out.println("����=" + com[i]);
			//���� 1~45���� ���� ���� 6���߻� 
		}//for end
	} //main end

}//class END
