package net.tis.day24_sample;

public class Book { //189페이지 기술
	public Book(String title) { }//기본생성자=생략가능
	public Book(String t, String writer) { }
	public Book(String name, int year) { }
	
	public static void main(String[] args) {
		//Book littlePrice = new Book("어린왕자", "생텍쥐페리"); //189페이지  16번라인
		//Book loveStory = new Book("춘향전"); //189페이지  17번라인
		Book mt = new Book("몽블랑" , 1994); //189페이지  
	}//end
}//class END
