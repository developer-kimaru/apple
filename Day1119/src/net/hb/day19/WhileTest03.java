package net.hb.day19;
public class WhileTest03 {
	
	public static void main(String[] args) {
		//switch,		�ݺ��� Ż�� break;
		//switch����x,	�ݺ��� for, while, do~while
		//124������ continue �������
		//119������ while(����:num<10, true) {}
		//while �ݺ������� 1~10 ���
		int kor = 0, eng = 0, sum = 0, num = 0;
		
		while(true)	//���ѷ���
		{	num = num +1;
			if	(num==5)	{continue;	}
			System.out.print(num+" ");
			sum = sum + num;
			if	(num==10)	{break;		}				}
		
		System.out.println(sum);
	}
}