package net.tis.day23;
public class Three { // 88������ ��Ʈ���� & | ^ ~
	public static void main(String[] args) {
		int a = 6 ;
		int b = 4 ;
		// &	and����	�� �� 1�� ������ ��	=true�� �� ����
		// |	or ����	�� �߿� �ϳ��� ����	=true 1�� �� ����
		// ^	ĳ������	���� �� ��			=1 0 / 0 1 ������ 1
		int x = a & b ;
		int y = a | b ;
		int z = a ^ b ;

		System.out.println(a + "&" + b + "=" + x);
		System.out.println(a + "|" + b + "=" + y);
		System.out.println(a + "^" + b + "=" + z);

	} // main end
	
	public void note( ) { //Non-static �޼ҵ�
		// void Ű���尡 ������ ���븸 ��� ����, ���ϰ� ����
		
		System.out.println("note �޼ҵ�");
	} //note end
} // class end