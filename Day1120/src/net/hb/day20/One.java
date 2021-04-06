package net.hb.day20;
public class One {
	public static void main(String[] args) {
		//배열의 초기화, new 키워드는 heap영역에 로드
		//heap영역은 실행중에 로드, 사용하지 않을 때는 소거됨
		
		String city []	= new String[5];	//null
		boolean camp [] = new boolean[5];	//false
		int number []	= new int[5];		//0
		double rate []	= new double[5];	//0.0
		char ck []		= new char[5];		//표시없음(공백)
		byte bt[]		= new byte[5];
		
		for	(int cnt=0; cnt<5; cnt++)
			//{System.out.println(city[cnt]+" ");}
			//{System.out.println(camp[cnt]+" ");}
			//{System.out.println(number[cnt]+" ");}
			//{System.out.println(rate[cnt]+" ");}
			//{System.out.println(double[cnt]+" ");}
			//{System.out.println(ck[cnt]+" ");}
			{System.out.println(bt[cnt]+" ");}
	}
}
