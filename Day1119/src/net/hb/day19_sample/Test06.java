package net.hb.day19_sample;

public class Test06 {
	public static void main(String[] args) {
		  int money=65430; 
		  int a,b,c,d;
		  
		  System.out.println("�ѱݾ�=" + money);
		  //������� �򿬻�,  ���Կ����� 
		  a=money/10000;
		  money -= a*10000 ;
		  System.out.println("����="+a+"\t�ܾ�="+ money+"��");
		  
		  b=money/1000;
		  money -= b*1000 ;
		  System.out.println("õ��="+b+"\t�ܾ�="+ money+"��");
		  
		  c=money/100;
		  money -= c*100 ;
		  System.out.println("���="+c+"\t�ܾ�="+ money+"��");
		  
		  d=money/10;
		  money -= d*10 ;
		  System.out.println("�ʿ�="+d+"\t�ܾ�="+ money+"��");

	}//main end
}//class END
