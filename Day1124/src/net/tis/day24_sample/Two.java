package net.tis.day24_sample;

public class Two {
	public static void main(String[] args) {
		//���� this.note(); staticŰ���尡 ������ this����ϸ� ����
		//���� Two.note(); main�޼ҵ�� static�־ static���� note���ٸ���
		Two ob = new Two() ; //Non-static�޼ҵ������� ���ؼ� ob��ü����
		ob.note();
		System.out.println("main�޼ҵ�");
		System.out.println("main������");
		System.out.println("main������");
	}//end
	
	public double rate(){ //non-static�޼ҵ�
	  double r = 7.8;
	  return r ; 
	}//end
	
	public boolean getConnect( ){ //non-static�޼ҵ�
		boolean ct=true;
		return ct;
	}//end
	
	public int price(){ //non-static�޼ҵ�
		int value=2900;
		return value ;
	}//end
	
	public  String getTitle( ){//non-static�޼ҵ�
	  String msg="�ڷγ�19����";
	  return msg ;
	}//end
	
	public  void note( ){ //non-static�޼ҵ忡���� this��밡��
	   //System.out.println(msg); ����
	   //non-static�޼ҵ忡���� thisŰ���� ��밡��
	   //non-static�޼ҵ忡���� this.��������� ǥ�õ� 
	   //note�޼ҵ带 main���� ȣ��
	   System.out.println(getTitle( )); //�����ذ�
	   String a = this.getTitle();
	   System.out.println(getTitle( )); //�����ذ�
	}//end
	
}//Two class END






