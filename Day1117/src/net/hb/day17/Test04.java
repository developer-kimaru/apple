package net.hb.day17;
public class Test04 {
	public static void main(String[] args) {
		// 83페이지 참고
		// ++, -- 단항연산, 증감연산 1씩 증가, 1씩 감소
		int a = 7, b = 7;
		int sum = 0, total = 0;
		sum = (++a) +5; //++a < 7+1
		total = (b++) +5; //b++ < 7
		
		System.out.println("a="+a+"\t sum=" + sum);
		System.out.println("b="+b+"\t total=" + total);
		System.out.println();

		// 변수 a, b, sum, total 초기화
		a = 0; b = 0; sum = 0; total = 0;

		a = 7; b = 7;
		sum = 0; total = 0;
		sum = (--a) +5; //++a < 7+1
		total = (b--) +5; //b++ < 7
		
		System.out.println("a="+a+"\t sum=" + sum);
		System.out.println("b="+b+"\t total=" + total);

}
}