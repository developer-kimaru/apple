package net.hb.day17;
public class Test01 {
	public static void main(String[] args) {
		int num = 28; //변수 선언과 초기화
		int price = 2500;
		// int price = 0; 에서 price 값을 변경하여 초기화 가능
		System.out.println("숫자 이름 과목");		
		System.out.println("11 김 A");
		System.out.println("22 예슬 B");
		System.out.println();
		System.out.println("숫자 \t 이름 \t 과목");		
		System.out.println("11 \t 김 \t A");
		System.out.println("22 \t 예슬 \t B");
		System.out.println();
		// 한국의 수도는 "서울"입니다.를 출력하고 싶은 경우
		// "서울" << 에서 "을 \"으로 기재.
		// 한국의 수도는 '서울'입니다.를 출력하고 싶은 경우에는 \ 붙여도 무방
		System.out.println("한국의 수도는 \"서울\"입니다");
	}
}