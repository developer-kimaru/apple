package net.hb.day19_sample;

import java.text.DecimalFormat;

public class  Test07 {
  public static void main(String[] args) {
		String name = "ȫ�浿";
		int basepay = 2500000;
		int tax = (int)(basepay * 0.033);
		int pay = basepay - tax;
		DecimalFormat df=new DecimalFormat("##,###");
		System.out.println("***"+name+"�� ���� ***");
		System.out.println("�⺻ : " +df.format(basepay)+"��");
		System.out.println("���� : " +df.format(tax)+"��");
		System.out.println("���� : " +df.format(pay)+"��");
		System.out.println();
		
		System.out.println("�⺻ : " +String.format("%,d",basepay)+"��");
		System.out.println("���� : " +String.format("%,d",tax)+"��");
		System.out.println("���� : " +String.format("%,d",pay)+"��");
		System.out.println();
		
		System.out.printf("�⺻ : %12d��\n", basepay);
		System.out.printf("���� : %12d��\n", tax);
		System.out.printf("���� : %12d��\n", pay);
		System.out.println();
		
		System.out.printf("�⺻ : %d��\n", basepay);
		System.out.printf("���� : %d��\n", tax);
		System.out.printf("���� : %d��\n", pay);
  }
}//class END