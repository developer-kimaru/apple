package net.tis.day23;
import java.util.Scanner;
public class Game{
	public static void main(String[] args) {
		//372������ Math.random(), Random Ŭ���� r = new Random();
		
		int com = (int)(Math.random()*100) + 1;
		int a=0, my=0;
		Scanner scanner = new Scanner(System.in);
		
		while	(true)
			{ try {a++;	System.out.print(a+"ȸ ���� �Է� >> ");
		my = Integer.parseInt(scanner.nextLine());
		
		if	(my<0 || my>100)
		{System.out.println("�Է��� ���� ������ 1~100���� �����̾�� �մϴ�."); a=a-1;} // if end

		if	(my>com)
			{System.out.println(my+"���� �۽��ϴ�.");}
		else if (my<com)
			{System.out.println(my+"���� Ů�ϴ�.");}
		else if (my==com)
			{System.out.println("�����Դϴ�."); break;}
		else{System.out.println("���ڰ� �ƴմϴ�.");} //if-else end
		} 	// try end
		
		catch	(Exception e) {System.out.println("������ �Է����ּ���."); a=a-1;};
		
		if	(a==5)
			{System.out.println("5ȸ�� �ʰ��߽��ϴ�.\n���� ��ȸ�� �̿��ϼ���.");
			System.out.println("com���� = " + com+"�Դϴ�.");
			break;} //if end
			} //while end
	
		scanner.close();

	} // main end
} // class end