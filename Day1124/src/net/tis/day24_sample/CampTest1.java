package net.tis.day24_sample;

import java.util.Scanner;

public class CampTest1 {
  public CampTest1( ) {  }//�⺻������end
  
  public CampTest1(String place) {
	 System.out.println(place);
  }//������ end
	
  public CampTest1(String ss, int year) {
	  System.out.println(ss +"  " + year +"�� ����");
  }//������ end
  
  public static void main(String[] args) {
	  //CampTest1 ct= new CampTest1("�δ��佺Ʈ ķ����");
	  //CampTest1 ct= new CampTest1("�δ��佺Ʈ ķ����", 1997);
	  //System.out.println("�����㸶�� ķ����");
	 Scanner sc=new Scanner(System.in);
	 boolean[] camp = new boolean[5]; 
	 int sel=9, num=0;
	 
	 //ķ���� �������Ȯ�� 
	 for(int i=0; i<camp.length; i++) {
		 if(camp[i]==true) {
		   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
		 }else {
		   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
		 }
	 } //for end

	while(true) {
		try {
		  System.out.print("\n1.����  2.���  3.����  9.���� : ");
		  sel = Integer.parseInt(sc.nextLine());
		  
		   if(sel==9) {
			 System.out.println("ķ���忹�����α׷��� �����մϵ�");
			 break;
		   }
		   
		  switch(sel) {
		    case 1: 
			    System.out.print("����ķ�ι�ȣ �Է�>>> ");
			    num=Integer.parseInt(sc.nextLine()); //���� 5�Է�
			    if(num <1 || num >5) { System.out.println(num +"��ȣ�� ����Ҽ� �����ϴ�"); }
			    if(camp[num-1]==true) {
			    	System.out.println("�̹� ����� ķ���� ����Ҽ� �����ϴ�");
			    }else {
			    	System.out.println("camp["+num+"] ķ���� ���༺��");
			    	camp[num-1]=true; //false��� ��¥true������
			    }
			    
			    for(int i=0; i<camp.length; i++) {
					 if(camp[i]==true) {
					   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
					 }else {
					   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
					 }
				 } //for end
		     break;
		    	
		    case 2: //����� ����/���κ�ó��
		    	System.out.print("���ķ�ι�ȣ �Է�>>> ");
		    	num=Integer.parseInt(sc.nextLine()); //3�Է��ϸ� 
				    if(camp[num-1]==true) {
				    	System.out.println("camp["+num+"] ķ���� ��Ǽ����߽��ϴ�");
				    	camp[num-1]=false; 
				    }else {
				    	System.out.println("camp["+num+"] ����ִ� ķ�����Դϴ�");
				    }
				    
				    for(int i=0; i<camp.length; i++) {
						 if(camp[i]==true) {
						   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
						 }else {
						   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
						 }
					 } //for end    
		        break;	
		    case 3: //��ü�������
		    	 for(int i=0; i<camp.length; i++) {
		    		 if(camp[i]==true) {
		    		   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
		    		 }else {
		    		   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
		    		 }
		    	 } //for end
		    	break;
		    default: 
		    	System.out.println("1~3�޴��� �����ϼž� �մϴ�");
		    	break;	
		  }//switch end
		}catch (Exception e) {	}
	}//while 
	
	sc.close();
  }//end
}//class END