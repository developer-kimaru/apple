package net.hb.day19_sample;

public class TestArray02 {
	enum Week { ������,ȭ����,������,�����,�ݿ��� }
	
	public static void main(String[] args) {
		int[] su = { 37, 45, 7, 14, 30, 19 } ;
		//136������ for~each�ݺ���
		for(int k : su){ System.out.print(k + " ");	}
		System.out.println();
		
		String names[] = { "���","ü��", "����", "����", "�ܰ�" } ;
		for(String s:names) { System.out.print(s + " ");}
		System.out.println();
		
		for(Week day: Week.values()) {
			System.out.print(day +"  ");
		}
	}
}//class END








