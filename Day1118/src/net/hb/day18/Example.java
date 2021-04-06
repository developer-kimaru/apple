package net.hb.day18;
public class Example {

	public static void main(String[] args) {
		int age = 24;
		String message = "메세지";
		char grade = 'A';
		// 조건 15세 미만 : 어른들의 보호가 필요 F
		// 15~17세 청소년 : D
		// 18~26세 청년 : C
		// 27~50세 성인 : B
		// 51세 이상 장년 : A

			if (age<15)
				message = "어른들의 보호가 필요합니다."; //grade = 'F' 이렇게 써도 됨
			else if (age<=17)
				message = "청소년";
			else if (age<=26)
				message = "청년";
			else if (age<=50)
				message = "성인";
			else
				message = "장년";
		
			System.out.println("나이 = "+age);
			System.out.println(message); //grade를 쓰면 (grade)로 변경해야함
	}
}