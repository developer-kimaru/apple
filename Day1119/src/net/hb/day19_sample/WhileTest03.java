package net.hb.day19_sample;

public class WhileTest03 {

	public static void main(String[] args) {
		     //switch, �ݺ��� Ż�� break;
	         //switch����X, for,while,do~while�ݺ������� continue
		     //124������ continue�������
			 //119������ while(su<10){ }
		     //119������ while(true){ }
			 //while�ݺ������� 1~10���
			int su = 0, hap=0 ;
			while(true) { //���ѷ��� 
				su = su + 1 ;
				if(su==5){ continue; }
				System.out.print(su + " ");
				hap = hap + su ;
				if (su==10){break;}
			}//while end
			System.out.println("�հ�=" + hap);		  
	}//main end
}//class END





