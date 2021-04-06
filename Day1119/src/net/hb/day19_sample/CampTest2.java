package net.hb.day19_sample;

import java.util.Scanner;

public class CampTest2 { 
	 Scanner sc=new Scanner(System.in); //����sc��ü���� 
	 boolean[] camp = new boolean[5]; //���� camp�迭����
	 int num=0;//input(),output(),map() 
	 
  public static void main(String[] args) {
	  CampTest2 guest = new CampTest2();
	  System.out.println("�Լ����� ķ���迭");
	int sel = 9;
	while(true) {
		try { 
		  sel=guest.menu();
		  if(sel==9) {
			 guest.myExit();
		     break;
		  }
		  
		  switch(sel) {
		    case 1:
		    	guest.input();
		    	guest.map();
		    	break;
		    case 2: //����� ����/���κ�ó��
		    	guest.output();
		    	guest.map();
		    	break;	
		    case 3: //��ü�������
		    	guest.map();
		    	break;
		    default: 
		    	System.out.println("1~3�޴��� �����ϼž� �մϴ�");
		    	break;	
		  }//switch end
		}catch (Exception e) {	}
		
	  
	}//while 
  }//main end
  
  public void myExit() {
	System.out.println("\nķ���忹�����α׷��� �����մϵ�");
	System.exit(1);
  }
  
  public int menu( ) { // id������������ menu()�޼ҵ尡 id�������
	 System.out.print("1.����  2.���  3.����  9.����>>> "); //�ȳ���
	 int id = Integer.parseInt(sc.nextLine());//�������� 
	 return id;
  }//end
  
  public void input( ) {//non-static�޼ҵ�
	  System.out.print("����ķ�ι�ȣ �Է�>>> ");
	    num=Integer.parseInt(sc.nextLine()); //���� 5�Է�
	    if(camp[num-1]==true) {
	    	System.out.println("�̹� ����� ķ���� ����Ҽ� �����ϴ�");
	    }else {
	    	System.out.println("camp["+num+"] ķ���� ���༺��");
	    	camp[num-1]=true; //false��� ��¥true������
	    }
  }//end
  
  public void output( ) {//non-static�޼ҵ�
	  System.out.print("���ķ�ι�ȣ �Է�>>> ");
  	  num=Integer.parseInt(sc.nextLine()); //3�Է��ϸ� 
		    if(camp[num-1]==true) {
		    	System.out.println("camp["+num+"] ķ���� ��Ǽ����߽��ϴ�");
		    	camp[num-1]=false; 
		    }else {
		    	System.out.println("camp["+num+"] ����ִ� ķ�����Դϴ�");
		    } 
  }//end
  
  public void map( ) {//non-static�޼ҵ�
	  for(int i=0; i<camp.length; i++) {
 		 if(camp[i]==true) {
 		   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
 		 }else {
 		   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
 		 }
 	 } //for end 
	  System.out.println(); //�ǹ̾��� ���ΰ���enter
  }//end
  
}// class END







