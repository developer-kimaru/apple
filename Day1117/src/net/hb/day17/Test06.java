package net.hb.day17;
public class Test06 {
	public static void main(String[] args) {
		// 85페이지 참고, 비교연산=관계연산. 결과값은 true/false
		int a = 7, b = 2;
		
		boolean ret1 = a>b;
		boolean ret2 = a<b;
		boolean ret3 = a==b;
		boolean ret4 = a>=b;
		boolean ret5 = a<=b;
		boolean ret6 = a!=b;
		
		System.out.println(a + ">" + b + " 결과 : " + ret1);
		System.out.println(a + "<" + b + " 결과 : " + ret2);
		System.out.println(a + "==" + b + " 결과 : " + ret3);
		System.out.println(a + ">=" + b + " 결과 : " + ret4);
		System.out.println(a + "<=" + b + " 결과 : " + ret5);
		System.out.println(a + "!=" + b + " 결과 : " + ret6);
	}
}




