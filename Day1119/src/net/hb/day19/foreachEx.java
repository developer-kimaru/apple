package net.hb.day19;
public class foreachEx { // 137������ ���� 3-9
	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	public static void main(String args[]) {
		
		int n[] = {1, 2, 3, 4, 5};
		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		int sum = 0;
		
		for (int a : n)
			{System.out.print(a + " ");	sum+=a;}
				System.out.println("�� "+n.length+"�� ������ �հ�� " + sum);
		
		for (String s : names)
			{System.out.print(s +" ");}
				System.out.println();
			
		for	(Week day : Week.values())
			{System.out.print(day+"���� ");}
				System.out.println();
	}
}
