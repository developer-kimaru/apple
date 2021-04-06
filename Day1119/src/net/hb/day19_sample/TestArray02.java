package net.hb.day19_sample;

public class TestArray02 {
	enum Week { 월요일,화요일,수요일,목요일,금요일 }
	
	public static void main(String[] args) {
		int[] su = { 37, 45, 7, 14, 30, 19 } ;
		//136페이지 for~each반복문
		for(int k : su){ System.out.print(k + " ");	}
		System.out.println();
		
		String names[] = { "사과","체리", "딸기", "포도", "단감" } ;
		for(String s:names) { System.out.print(s + " ");}
		System.out.println();
		
		for(Week day: Week.values()) {
			System.out.print(day +"  ");
		}
	}
}//class END








