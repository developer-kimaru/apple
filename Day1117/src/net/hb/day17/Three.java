package net.hb.day17;
public class Three { //Java��� -> jsp, spring, �ȵ���̵�
	public static void main(String[] args) { //�̷��԰� �� ��Ʈ. �ϳ��� �ٸ� ������ �����ϸ� �� ��
		int kor=0, eng=0, sum=0;
		double ave=0.0; //���
		String message="�հ������޼���";
		
		kor=90;
		eng=45;
		// ����, ��� ���ؼ� ���
		
		sum=kor+eng;
		ave=(double)sum/2; //sum�� ������, ������ 2�� ������ -> ������ �ν��Ͽ� �Ҽ��� �ݿ��� �ȵ�
		//(double)�� ���ؼ� ����� �������־����
		
		if (ave >= 70) //��ȣ�� ��� ����
			message = "�� �հ�";
		else
			message = "�����";
		
		System.out.print("��� = "+message+"\n");
		System.out.println("���� = "+sum);
		System.out.println("��� = "+ave);
		//System out println : �� �ٲٱ� ����
		//System out print : �� �ٲٱ� ����. �� �ٲٰ� ���� ��� ���� "\n"�� �ٿ��� ��
		//"\t"�� �Է��ϸ� ��Ű�� ���� ������ ���� �Ͱ� ���� ���
		//System.out.println() : ���� /System.out.print() : ���� �߻� 
		System.out.print("��� = "+message+"\t");
		System.out.print("���� = "+sum+"\t");
		System.out.print("��� = "+ave+"\t");
	}

}
