package net.hb.day19_sample;

public class Test02 {
	public static void main(String[] args) {
		int su1=5;
		int su2=9;
		int su3=6;
		int temp=0; //�ӽð��� ����=�����=�ִ밪���
		
		if(su1>su2) {temp=su1;} 
		if(su2>su1) {temp=su2;}
		if(su3>temp){temp=su3;}
	
		System.out.println(su1+"  " +su2 + "  " + su3);
		System.out.println("�ִ밪=" + temp);

	}//main end
}//class END
