package net.tis.day24_sample;

import java.util.Scanner;

public class SJTest {
	public static void main(String[] args) {
	  // kor,eng,tot����, double avg���, String msg, char grade����
	  // ���� 1] try~catch������, ScannerŬ����,  ����,���� Ű�����Է� 	
      // ���� 2] �հ�,���,����ó�� switch,����� ���׿��� 
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
	  System.out.println("\n����=" + kor);
	  System.out.println("����=" + eng);
	  System.out.println("����=" + tot);
	  sc.close(); //�Ǹ��������忡 ���
	}//end
}//class END


/*
package net.tis.day24;

import java.util.Scanner;

public class SJTest {
	public static void main(String[] args) {
	  // kor,eng,tot����, double avg���, String msg, char grade����
	  // ���� 1] try~catch������, ScannerŬ����,  ����,���� Ű�����Է� 	
      // ���� 2] �հ�,���,����ó�� switch,����� ���׿��� 
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
	  System.out.println("\n����=" + kor);
	  System.out.println("����=" + eng);
	  System.out.println("����=" + tot);
	  sc.close(); //�Ǹ��������忡 ���
	}//end
}//class END
*/






