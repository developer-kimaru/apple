package net.hb.day19_sample;

import java.text.DecimalFormat;

public class  Test07 {
  public static void main(String[] args) {
		String name = "홍길동";
		int basepay = 2500000;
		int tax = (int)(basepay * 0.033);
		int pay = basepay - tax;
		DecimalFormat df=new DecimalFormat("##,###");
		System.out.println("***"+name+"의 월급 ***");
		System.out.println("기본 : " +df.format(basepay)+"원");
		System.out.println("세금 : " +df.format(tax)+"원");
		System.out.println("월급 : " +df.format(pay)+"원");
		System.out.println();
		
		System.out.println("기본 : " +String.format("%,d",basepay)+"원");
		System.out.println("세금 : " +String.format("%,d",tax)+"원");
		System.out.println("월급 : " +String.format("%,d",pay)+"원");
		System.out.println();
		
		System.out.printf("기본 : %12d원\n", basepay);
		System.out.printf("세금 : %12d원\n", tax);
		System.out.printf("월급 : %12d원\n", pay);
		System.out.println();
		
		System.out.printf("기본 : %d원\n", basepay);
		System.out.printf("세금 : %d원\n", tax);
		System.out.printf("월급 : %d원\n", pay);
  }
}//class END