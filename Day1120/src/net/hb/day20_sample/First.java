package net.hb.day20_sample;

public class First {
	public static void main(String[] args) {
		//배열의 초기화, new키워드는 메모리heap영역에 로드
		//heap영역은 실행중에 로드, 비사용일때 소거
		//배열은 크기를 지정하면 기본초기값 자동으로 할당 
		String city[] = new String[5];  //null
		boolean[] camp = new boolean[5]; //false
		int[] su = new int[5]; //0
		double[] rate = new double[5];  //0.0
		char[] ck = new char[5]; //표시가없음
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






