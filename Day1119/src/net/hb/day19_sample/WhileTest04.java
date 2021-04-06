package net.hb.day19_sample;

public class WhileTest04 {
	public static void main(String[] args) {
		//do~while반복문, while반복문 비교 
		int su=0, tot=0;
		while(su<10) {
			su=su+1;
			System.out.print(su + " ");
			tot = tot + su;
		};
		System.out.println("합계=" + tot);
	}
}//class END
