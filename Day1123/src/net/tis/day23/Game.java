package net.tis.day23;
import java.util.Scanner;
public class Game{
	public static void main(String[] args) {
		//372페이지 Math.random(), Random 클래스 r = new Random();
		
		int com = (int)(Math.random()*100) + 1;
		int a=0, my=0;
		Scanner scanner = new Scanner(System.in);
		
		while	(true)
			{ try {a++;	System.out.print(a+"회 숫자 입력 >> ");
		my = Integer.parseInt(scanner.nextLine());
		
		if	(my<0 || my>100)
		{System.out.println("입력한 숫자 범위는 1~100사이 숫자이어야 합니다."); a=a-1;} // if end

		if	(my>com)
			{System.out.println(my+"보다 작습니다.");}
		else if (my<com)
			{System.out.println(my+"보다 큽니다.");}
		else if (my==com)
			{System.out.println("정답입니다."); break;}
		else{System.out.println("숫자가 아닙니다.");} //if-else end
		} 	// try end
		
		catch	(Exception e) {System.out.println("정수를 입력해주세요."); a=a-1;};
		
		if	(a==5)
			{System.out.println("5회를 초과했습니다.\n다음 기회를 이용하세요.");
			System.out.println("com난수 = " + com+"입니다.");
			break;} //if end
			} //while end
	
		scanner.close();

	} // main end
} // class end