package net.hb.day20_sample;

public class First {
	public static void main(String[] args) {
		//�迭�� �ʱ�ȭ, newŰ����� �޸�heap������ �ε�
		//heap������ �����߿� �ε�, �����϶� �Ұ�
		//�迭�� ũ�⸦ �����ϸ� �⺻�ʱⰪ �ڵ����� �Ҵ� 
		String city[] = new String[5];  //null
		boolean[] camp = new boolean[5]; //false
		int[] su = new int[5]; //0
		double[] rate = new double[5];  //0.0
		char[] ck = new char[5]; //ǥ�ð�����
		byte[] bt = new byte[5];  //0
		
		for( int cnt=0; cnt<5; cnt=cnt+1) {
			//System.out.print(city[cnt] + " ");
			//System.out.print(camp[cnt] + " ");
			//System.out.print(su[cnt] + " ");
			//System.out.print(rate[cnt] + " ");
			//System.out.print(ck[cnt] + " ");
			System.out.print(bt[cnt] + " ");
		}

	}
}//class END  






