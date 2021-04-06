package net.hb.day19;
public class TestArray02 {

	enum Week {월, 화, 수, 목, 금, 토, 일}

	public static void main(String[] args) {

		int[] number = {1,2,4,8,16,32} ;
		for (int k : number) //136페이지 for~each 반복문
			{System.out.print(k+" ");}
		
		System.out.println();
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		
		for(String s:names) {System.out.print(s+" ");}
		System.out.println();
		
		for(Week day : Week.values())
		{System.out.print(day + "요일 ");}
		
	}
}