package net.tis.day24;
public class AI { 	//193~194������ this Ű����
					//thisŰ����� ���� Ŭ������ ����, static������ ���� ����
					//1. ��������, �������� �̸��� ������ ��
					//2. �Ű�����, �������� �̸��� ������ ��
		int IQ = 2400; //�ʵ� ��������, IQ �����͸� display�� ���
		int m = 0;
		int total = 1000; //��������, non-static ������ �� this
		
	public static void main(String[] args) {
		// System.out.println("AIŬ���� IQ�������� "+ this.IQ);	<< �̰� ����
		// static������ ���� ����
		System.out.println("AIŬ���� ");
		// System.out.println("AIŬ���� "+IQ);
		// main�Լ����� display() ȣ��
		AI tis = new AI();
		tis.display();
		tis.input(540); //540�� �Ա�
		int mypoint = tis.grandTotal();
		System.out.println("���ܾ� = "+mypoint);
	} //main end
	
	public void input(int m) {
		this.m = m;
	} //non-static�޼ҵ�, end
	
	public int grandTotal() { //non-static�޼ҵ�, end
		total = total + m ;
		return total;
	} //end
	
public void display() { //non-static�޼ҵ�
	int IQ = 17; //
	System.out.println("AIŬ���� IQ�������� "+ this.IQ);
	System.out.println("AIŬ���� IQ�������� "+ IQ);
	} //display end

}//AI class end