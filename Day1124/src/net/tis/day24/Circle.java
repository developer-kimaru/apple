package net.tis.day24;
public class Circle {
	
	public int radius; //non-static필드
	public String name; //non-static필드
	
	public Circle() {
		radius=1;
		name = " ";
	}//생성자 end
	
	//187페이지 9번 라인
		public Circle(int r, String n) {
			radius=r; name=n; 		
			System.out.println("대표 메뉴는 "+name);
} //생성자 end

	public double getArea() { //non-static필드
		double cal = 3.14*radius*radius;
		return cal;	} //end
	
	public static void main(String Args[]) { //실행하려면 필수 메소드
	//메인 함수 안에서 모든 내용을 전부 기술
	//분리=조각화=컴포넌트=자바에서 함수로 분리, 자바에서 클래스로 분리해서 다시  함수로 분리
		{Circle pizza; //182페이지 객체변수선언=참조변수선언=레퍼런스변수선언
		pizza = new Circle(10, "자바피자"); //객체화=객체생성=인스턴스생성=복사생성
		// pizza.radius = 10; //그냥 radius=10; 하면 에러 발생
		// pizza.name = "피자피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);}
		
		
		
		//184vpdlwl 19번 라인
		Circle donut = new Circle ();
		donut.radius=2;
		donut.name="자바도넛";
		double square = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+square);
		System.out.println("대표 메뉴는 "+donut.name);
	}//main end
} //class end