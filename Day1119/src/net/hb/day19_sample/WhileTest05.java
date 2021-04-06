package net.hb.day19_sample;

public class WhileTest05 {
	public static void main(String[] args) {
		//while반복문 비교 
		int su=0;
		while(true) {
			su=su+1;
			System.out.print(su + "\t");
			if(su%5==0){ System.out.println();}
			if(su==30){ break ; }
		}
	}
}//class END
