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
			 System.out.print(i+"ȸ �����Է�>>"); //�ȳ���
			 my = Integer.parseInt(sc.nextLine());
			 
			 if( my<0  || my > 100 ) {
				System.out.println("���ڹ����� 1~100���� �����̾�� �մϴ�");
				break; 
			 }
			 
			 ///////�������� ����ó���� �߰��ϼž� �մϴ�
			 if(my>com) {
				 System.out.println(my+"���ں��� ���������Դϴ�");
			 }else if(my<com) {
				System.out.println(my+"���ں��� ū�����Դϴ�");
			 } else if(my==com) {
				 System.out.println(my +"���� ��������ϴ�");
				 break;
			 }else{System.out.println("���ڰ� �ƴմϴ�"); }
			 
			 if(i==5){
				System.out.println("\n5Ƚ���� �ʰ��߽��ϴ�\n������ȸ�� �̿��ϼ���");
				System.out.println("com���䳭�� = " + com);
				break; 
			 }
		// }catch (Exception e) { 	}
	}//while end
		
		sc.close();
	} //main end

}//Game class END
