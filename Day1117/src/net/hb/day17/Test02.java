package net.hb.day17;
public class Test02 { //Ŭ���� �̸�
	public static void starGame() { //�޼ҵ� �̸�		
	}
	public static void main(String[] args) { //�޼ҵ� �̸�
		int age = 28; // �������� = local variable
		final double PI = 3.1415;
		//final�� ���̸� final�� ���� PI ������ ����� ������
		String address = "�ϻ�";
		System.out.println("������ = " + PI);
		System.out.println("���� =" + age);
		System.out.println("�ּ� = " + address);
		System.out.println();
		age = 20;
		// PI = 6.2831;
		address = "������";
		System.out.println("������ = " + PI);
		System.out.println("���� =" + age);
		System.out.println("�ּ� = " + address);
		System.out.println();
	}
}