package net.hb.day18;
public class ForTest02 { //for�ݺ��� ����
	public static void main(String[] args) {
		
		int num = 0,	sum = 0,	pro = 1; //���� ������ �ʱⰪ�� 1�� �ִ� ���� ����
		for(int	b=0;	b<5;	b++)			{
			num++; //num++ = num+1
			System.out.print(num+"  ");
			sum = sum + num ;
			pro = pro * num;					}
		
		System.out.println();
		System.out.println("����� = " + sum);
		System.out.println("����� = " + pro);
		
	}
}