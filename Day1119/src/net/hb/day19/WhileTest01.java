package net.hb.day19;
public class WhileTest01 {
	
	public static void main(String[] args) {
		//119 ������ while(����) {}
		//while �ݺ������� 1~10 ���
		int kor = 0, eng = 1, sum = 2, num = 0;
		
		while(num<10)
			{num = num +1; System.out.print(num+" ");	}

		double aver = 0.0;
		String message = "�հݿ���";
		char grade = 'A';
		
		kor = 90 ;				eng = 75 ;
		sum = kor + eng;		aver = (double)sum/2;
		
		//�հݿ��� : ���� 60������, ��� 70������ �հ� / else �����
		if	(aver>=70)
			{	if (kor>=60 && eng>=60)	message = "�հ�";	
			 	else message = "���հ�";					}
		else message = "���հ�";
			
		//���� switch (doubleŸ���� ��������) ��� ���ϱ�
		//82.7,	84.5,	89.1
		//82,	84,		89		>> int��
		//8,	8,		8		>> /10 ��
		switch((int)aver/10)
			{	case 10	:	grade='A';	break;
				case 9	:	grade='B';	break;
				case 8	:	grade='C';	break;
				case 7	:	grade='D';	break;	
				default	:	grade='F';	break;	}
		// double Ÿ���� ���������� ���Ƿ� int������ ����
		
		System.out.println("���� = "+sum);
		System.out.println("��� = "+aver);
		System.out.println("���� = "+grade);
		System.out.println("��� = "+message);
	}
}