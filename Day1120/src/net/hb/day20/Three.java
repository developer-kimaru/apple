package net.hb.day20;
public class Three { //return �ܵ����� = Ż��(return ȯ�ް�)
	public static void main(String[] args) {
		int data [] = lotto();
		for(int number:data)
		{System.out.print(number + " ");			}
		System.out.println();
		
		String like = book();
		System.out.println("�����ִ� å ���� = "+like);
		
		System.out.println("�츮�϶�");
		System.out.println("�ݼ�����");
		System.out.println("ȭ������");
		// return ; << ���⿡ ����ϸ� ��������
		System.out.println("���������� 10:38");
		System.out.println("��������� 10:38");
		return;										}
		//�� �������� return'��' ����ϸ� �ǹ̾��� (������ ������ ����)
		public static int[] lotto()
		{ int[] number = {1, 2, 3, 4, 5, 6};
		//return �����Ͱ� number ����ϸ� �޼ҵ� lotto() ���
		return number;								}
		
		public static String book() {
		String book = "����� ";
		return book;				}
}