package net.tis.day24_sample;

public class AI { //193~194페이지 this키워드는 현재클래스를 접근
	//첫번째  지역변수, 전역변수 이름이 동일할때
	//두번째  매개인자, 전역변수 이름이 동일할때 
	int IQ = 2400; //전역변수 non-static접근할때 this
	int m = 0;     //전역변수   non-static접근할때 this
	int total=1000; //전역변수   non-static접근할때 this
	
	public static void main(String[] args) { 
		System.out.println("AI클래스  ");
		AI tt = new AI();
		tt.display(); 
		tt.input(82540); //입금을 83540원
		int mypoint = tt.grandTotal();
		System.out.println("총잔액=" + mypoint);
	}//main end
	
	public void input(int m) { //non-static메소드
		this.m = m ;
	}//end
	
	public int grandTotal( ) { //non-static메소드
		total = total + m;
		return total;
	}//end
	
	
	public void display() { //non-static메소드
		int IQ = 17;
		System.out.println("AI클래스 IQ지역변수 " + IQ); //17IQ라서 전진앞으로 고고 기능만	
		System.out.println("AI클래스 IQ전역변수 " + this.IQ); //2400IQ 이미지감식,표정관리
	}//display end
	
}//AI class END



