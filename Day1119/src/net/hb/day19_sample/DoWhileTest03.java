package net.hb.day19_sample;

public class DoWhileTest03 {
	public static void main(String[] args) {
		//121페이지참고 do~while
		int su=22, tot=5;
		do {
			su=su+1;
			System.out.print(su + " ");
			tot = tot + su;
		}while(su<10) ;
		System.out.println("합계=" + tot);
	}
}//class END
