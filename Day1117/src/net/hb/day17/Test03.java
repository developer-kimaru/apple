package net.hb.day17;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 76������ ����
		Scanner scanner = new Scanner(System.in);
		// �ݵ�� Ű���忡�� �Է��ϱ� �� �ȳ���
		System.out.print("�̸��Է�>>> ");
		String name = scanner.nextLine();
		//scanner.next();�� ���Ⱑ ���� �ܾ ��� > �迹��
		//scanner.nextLine();�� ���� �ݿ��Ǿ� ��� > �� �� ��
		System.out.println();
		System.out.println("����� " + name + "�Դϴ�");
		scanner.close();
	}
}