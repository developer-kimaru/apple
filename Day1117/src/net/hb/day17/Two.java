package net.hb.day17;
public class Two {
	public static void main(String[] args) {
		// int형은 소수점이 없는 정수값을 기억하므로 int age = 29.8 < 에러
		int age = 27; // 변수 선언하면서 값 대입을 초기화시킴. 값 없는 변수를 출력하면 에러
		System.out.println("나이 = "+age);
		
		int nai ; // 변수를 선언만 하고
		nai = 22; // 값을 대입(할당)해도 ok
		System.out.println("나이 = "+nai);
		nai = 26; // 새로운 값을 선언하고
		System.out.println("나이 = "+nai); // 출력을 또 하면 새로운(최종의) 값이 출력됨
		//다중 주석 : 원하는 부분만큼 드래그 -> ctrl+/
		
		int sal = 29;
		System.out.println("sal = " + sal);
		// int sal = 31; //같은 이름으로 변수를 선언하면 에러
		sal = 31; //값을 재대입(할당)하는 것
		System.out.println("sal = " + sal);

	}
}