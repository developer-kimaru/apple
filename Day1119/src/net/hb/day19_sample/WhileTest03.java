package net.hb.day19_sample;

public class WhileTest03 {

	public static void main(String[] args) {
		     //switch, 반복문 탈출 break;
	         //switch적용X, for,while,do~while반복문복귀 continue
		     //124페이지 continue보조제어문
			 //119페이지 while(su<10){ }
		     //119페이지 while(true){ }
			 //while반복문으로 1~10출력
			int su = 0, hap=0 ;
			while(true) { //무한루프 
				su = su + 1 ;
				if(su==5){ continue; }
				System.out.print(su + " ");
				hap = hap + su ;
				if (su==10){break;}
			}//while end
			System.out.println("합계=" + hap);		  
	}//main end
}//class END





