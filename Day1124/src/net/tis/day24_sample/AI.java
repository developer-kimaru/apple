package net.tis.day24_sample;

public class AI { //193~194������ thisŰ����� ����Ŭ������ ����
	//ù��°  ��������, �������� �̸��� �����Ҷ�
	//�ι�°  �Ű�����, �������� �̸��� �����Ҷ� 
	int IQ = 2400; //�������� non-static�����Ҷ� this
	int m = 0;     //��������   non-static�����Ҷ� this
	int total=1000; //��������   non-static�����Ҷ� this
	
	public static void main(String[] args) { 
		System.out.println("AIŬ����  ");
		AI tt = new AI();
		tt.display(); 
		tt.input(82540); //�Ա��� 83540��
		int mypoint = tt.grandTotal();
		System.out.println("���ܾ�=" + mypoint);
	}//main end
	
	public void input(int m) { //non-static�޼ҵ�
		this.m = m ;
	}//end
	
	public int grandTotal( ) { //non-static�޼ҵ�
		total = total + m;
		return total;
	}//end
	
	
	public void display() { //non-static�޼ҵ�
		int IQ = 17;
		System.out.println("AIŬ���� IQ�������� " + IQ); //17IQ�� ���������� ��� ��ɸ�	
		System.out.println("AIŬ���� IQ�������� " + this.IQ); //2400IQ �̹�������,ǥ������
	}//display end
	
}//AI class END



