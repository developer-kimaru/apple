package net.hb.day18;
public class ForTest03 { //for�ݺ��� ����
	public static void main(String[] args) {
		
		int number = 0,	sum = 0,	proTotal = 1; //���� ������ �ʱⰪ�� 1�� �ִ� ���� ����
		for(int	b=0;	b<5;	b = b+1)			{
			number = number +1 ; //= number++
			System.out.print(number+"  ");
			//sum = sum + number;
			sum += number ;
			proTotal = proTotal * number;					}
		System.out.println("����� = " + sum);
		System.out.println("����� = " + proTotal);
	}
}