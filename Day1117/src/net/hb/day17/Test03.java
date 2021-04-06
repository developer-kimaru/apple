package net.hb.day17;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 76페이지 참고
		Scanner scanner = new Scanner(System.in);
		// 반드시 키보드에서 입력하기 전 안내문
		System.out.print("이름입력>>> ");
		String name = scanner.nextLine();
		//scanner.next();은 띄어쓰기가 없는 단어만 출력 > 김예슬
		//scanner.nextLine();은 띄어쓰기 반영되어 출력 > 김 예 슬
		System.out.println();
		System.out.println("당신은 " + name + "입니다");
		scanner.close();
	}
}