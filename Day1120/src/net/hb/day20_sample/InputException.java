package net.hb.day20_sample;

import java.util.InputMismatchException;

//156페이지 예외처리 실습
public class InputException {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try { 
				
			}catch (InputMismatchException e) {
				
			}
			
		}//for end

		double avg = 78.9;
		int a = (int)avg ;
		
		String data = "1200"; //String클래스
		//에러 int b = (int)data; 
		int b = Integer.parseInt(data);
		System.out.println(data+98); //120098
		System.out.println(b+98); //1298
	}//main end
}//class END










