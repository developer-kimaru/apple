package net.tis.day24;
import java.util.Scanner;
public class SJTest {
	
	public static void main(String[] args) {
		//���� kor, eng, sum ���� double aver ���, String msg, char grade ����


		//���� 1] try~catch ��� ����, scanner Ŭ����, ����/���� Ű���� �Է�
		//���� 2] �հ�, ���, ���� switch, ����� ���׿�������
		
		Scanner sc = new Scanner(System.in);
		
		
		int kor = 0, eng = 0, sum = 0;
		double aver = 0.0;	String msg = "";	char grade = 'a';

		while(true)
		{try {
		System.out.print("���� ������ �Է����ּ���. >>> ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է����ּ���. >>> ");
		eng = sc.nextInt();							} //try end
		
		catch	(Exception e)
		{System.out.println("������ �Է����ּ���.");		} //catch end
		
		break;	} // while end
		
		sum = kor + eng ;
		aver = (double)sum/2;	
		
		switch ((int)aver/10)
		{case 10	:	
		case 9		:	grade = 'A';	break;
		case 8		:	grade = 'B';	break;
		case 7		:	grade = 'C';	break;
		case 6		:	grade = 'D';	break;
		default		: 	grade = 'F';			} //switch end


		msg = aver>60	?	"�հ�"	:	"���հ�";
		
		System.out.println("���� ���� = "+kor);
		System.out.println("���� ���� = "+eng);
		System.out.println("���� = "+sum);
		System.out.println("��� = "+aver);
		System.out.println("�հݿ��� = "+msg);
		System.out.println("���� = "+grade);
		
		sc.close();
		
	} //end
} //class end