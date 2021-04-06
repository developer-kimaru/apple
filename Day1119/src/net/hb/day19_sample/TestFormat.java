package net.hb.day19_sample;

import java.text.DecimalFormat;

public class  TestFormat {
  public static void main(String[] args) {
		String name = "ȫ�浿";
		int basepay = 2500000;
		int tax = (int)(basepay * 0.033);
		int pay = basepay - tax;
  }//end
  
   public static String toNumFormat(int num) {
	  DecimalFormat df = new DecimalFormat("#,###");
	  return df.format(num);
	 }
}//class END