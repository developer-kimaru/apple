package net.hb.day18;
public class Example {

	public static void main(String[] args) {
		int age = 24;
		String message = "�޼���";
		char grade = 'A';
		// ���� 15�� �̸� : ����� ��ȣ�� �ʿ� F
		// 15~17�� û�ҳ� : D
		// 18~26�� û�� : C
		// 27~50�� ���� : B
		// 51�� �̻� ��� : A

			if (age<15)
				message = "����� ��ȣ�� �ʿ��մϴ�."; //grade = 'F' �̷��� �ᵵ ��
			else if (age<=17)
				message = "û�ҳ�";
			else if (age<=26)
				message = "û��";
			else if (age<=50)
				message = "����";
			else
				message = "���";
		
			System.out.println("���� = "+age);
			System.out.println(message); //grade�� ���� (grade)�� �����ؾ���
	}
}