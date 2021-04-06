package net.hb.day19_sample;

public class Test06 {
	public static void main(String[] args) {
		  int money=65430; 
		  int a,b,c,d;
		  
		  System.out.println("총금액=" + money);
		  //산술연산 몫연산,  대입연산자 
		  a=money/10000;
		  money -= a*10000 ;
		  System.out.println("만원="+a+"\t잔액="+ money+"원");
		  
		  b=money/1000;
		  money -= b*1000 ;
		  System.out.println("천원="+b+"\t잔액="+ money+"원");
		  
		  c=money/100;
		  money -= c*100 ;
		  System.out.println("백원="+c+"\t잔액="+ money+"원");
		  
		  d=money/10;
		  money -= d*10 ;
		  System.out.println("십원="+d+"\t잔액="+ money+"원");

	}//main end
}//class END
