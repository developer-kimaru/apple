package net.tis.day23_sample;

public class Lotto {
	public static void main(String[] args) {
		//372페이지 Math.random(), Random클래스 r = new Random();
		int[] com = new int[6];
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*45) + 1;
			System.out.println("난수=" + com[i]);
			//문제 1~45사이 정수 숫자 6개발생 
		}//for end
	} //main end

}//class END
