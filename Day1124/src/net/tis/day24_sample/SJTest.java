package net.tis.day24_sample;

import java.util.Scanner;

public class SJTest {
	public static void main(String[] args) {
	  // kor,eng,tot변수, double avg평균, String msg, char grade변수
	  // 문제 1] try~catch사용권장, Scanner클래스,  국어,영어 키보드입력 	
      // 문제 2] 합계,평균,학점처리 switch,결과는 삼항연산 
	  Scanner sc = new Scanner(System.in);
	  int kor=0,eng=0,tot=0;
	  double avg=0.0;
	  String msg="";
	  char grade='F';
	 
	  System.out.print("kor input>>> ");
	  kor = sc.nextInt(); 
	  System.out.print("eng input>>> ");
	  eng = sc.nextInt();
	 
	  tot = kor + eng;
	  System.out.println("\n국어=" + kor);
	  System.out.println("영어=" + eng);
	  System.out.println("총점=" + tot);
	  sc.close(); //맨마지막문장에 기술
	}//end
}//class END


/*
package net.tis.day24;

import java.util.Scanner;

public class SJTest {
	public static void main(String[] args) {
	  // kor,eng,tot변수, double avg평균, String msg, char grade변수
	  // 문제 1] try~catch사용권장, Scanner클래스,  국어,영어 키보드입력 	
      // 문제 2] 합계,평균,학점처리 switch,결과는 삼항연산 
	  Scanner sc = new Scanner(System.in);
	  int kor=0,eng=0,tot=0;
	  double avg=0.0;
	  String msg="";
	  char grade='F';
	 
	 while(true) {
		  try {
		   System.out.print("kor input>>> ");
		    kor = Integer.parseInt(sc.nextLine());  //sc.nextInt(); 
		  System.out.print("eng input>>> ");
		    eng = Integer.parseInt(sc.nextLine()); //sc.nextInt();
		  }catch (Exception e) { continue; }
		  break;
	 }//while
	 
	  tot = kor + eng;
	  System.out.println("\n국어=" + kor);
	  System.out.println("영어=" + eng);
	  System.out.println("총점=" + tot);
	  sc.close(); //맨마지막문장에 기술
	}//end
}//class END
*/






