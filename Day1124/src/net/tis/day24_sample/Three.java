package net.tis.day24_sample;

public class Three {
	public static void main(String[] args) {
		Three er = new Three();
		er.myCal(7,2);   //myCal(int,int)
		er.myCal(175.0); //myCal(double) 
		//Three.myCal(7,2);   //���� 229������
		//Three.myCal(175.0); //���� 229������ 
	}//end
	
	//�Լ��̸��ߺ�=�޼ҵ��̸��ߺ�=�����ε�=OverLoding
	public void  myCal(double data) { //Non-static�޼ҵ�=�Ϲݸ޼ҵ�
		double mok = data/2;
		System.out.println("myCal�޼ҵ� ���=" + mok);
		System.out.println("myCal�޼ҵ� ���=" + (data/2) );
	}//end
	
	public void myCal(int a, int b) { //Non-static�޼ҵ�=�Ϲݸ޼ҵ�
		System.out.println("myCal�޼ҵ� �հ�=" + (a+b));
		int hap = a+b ;
		System.out.println("myCal�޼ҵ� �հ�=" + hap);
	}//end
}//Three class END







