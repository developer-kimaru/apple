package net.tis.day23_sample;

import java.util.Scanner; 

public class Game {
	public static void main(String[] args) {
		int com = (int)(Math.random()*100) + 1;
		
		int i=0, my=0;
		Scanner sc = new Scanner(System.in);
		
	while(true) {
		//try {
			 i=i+1;
			 System.out.print(i+"회 숫자입력>>"); //안내문
			 my = Integer.parseInt(sc.nextLine());
			 
			 if( my<0  || my > 100 ) {
				System.out.println("숫자범위는 1~100사이 숫자이어야 합니다");
				break; 
			 }
			 
			 ///////여러분이 예외처리를 추가하셔야 합니다
			 if(my>com) {
				 System.out.println(my+"숫자보다 적은숫자입니다");
			 }else if(my<com) {
				System.out.println(my+"숫자보다 큰숫자입니다");
			 } else if(my==com) {
				 System.out.println(my +"숫자 빙고정답니다");
				 break;
			 }else{System.out.println("숫자가 아닙니다"); }
			 
			 if(i==5){
				System.out.println("\n5횟수를 초과했습니다\n다음기회에 이용하세요");
				System.out.println("com정답난수 = " + com);
				break; 
			 }
		// }catch (Exception e) { 	}
	}//while end
		
		sc.close();
	} //main end

}//Game class END
