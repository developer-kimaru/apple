package net.hb.day18;
public class ForTest01 { //for�ݺ��� ����
	public static void main(String[] args) {
		
		int number = 0,	sum = 0 ;
		//���� �ʱ�ȭ ���� ���� �ϸ� 13�� sum=sum+number;���� ���� (sum�� �ʱⰪ�� ���� ������)
		
		for	(int	a=1;	a<6;	a=a+1)
		{	//a�� ������� ���� number ������ ���� ���
			//sum ���� ����ϴ� ���,
			number = number+1;
			System.out.print(number + " ");	}
			System.out.println();
			sum = sum + number;	
			System.out.println("sum = "+ number + sum);	}
}