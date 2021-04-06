package net.hb.day19;
public class foreachEx { // 137페이지 예제 3-9
	enum Week {월, 화, 수, 목, 금, 토, 일}
	public static void main(String args[]) {
		
		int n[] = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
		for (int a : n)
			{System.out.print(a + " ");	sum+=a;}
				System.out.println("총 "+n.length+"개 정수의 합계는 " + sum);
		
		for (String s : names)
			{System.out.print(s +" ");}
				System.out.println();
			
		for	(Week day : Week.values())
			{System.out.print(day+"요일 ");}
				System.out.println();
	}
}
