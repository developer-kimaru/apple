package net.hb.day17;
public class Two {
	public static void main(String[] args) {
		// int���� �Ҽ����� ���� �������� ����ϹǷ� int age = 29.8 < ����
		int age = 27; // ���� �����ϸ鼭 �� ������ �ʱ�ȭ��Ŵ. �� ���� ������ ����ϸ� ����
		System.out.println("���� = "+age);
		
		int nai ; // ������ ���� �ϰ�
		nai = 22; // ���� ����(�Ҵ�)�ص� ok
		System.out.println("���� = "+nai);
		nai = 26; // ���ο� ���� �����ϰ�
		System.out.println("���� = "+nai); // ����� �� �ϸ� ���ο�(������) ���� ��µ�
		//���� �ּ� : ���ϴ� �κи�ŭ �巡�� -> ctrl+/
		
		int sal = 29;
		System.out.println("sal = " + sal);
		// int sal = 31; //���� �̸����� ������ �����ϸ� ����
		sal = 31; //���� �����(�Ҵ�)�ϴ� ��
		System.out.println("sal = " + sal);

	}
}