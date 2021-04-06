package net.hb.day18_sample;

public class LastFormat2 {
	public static void main(String[] args) {
		 double mokD = (double)19/3;
	
		 System.out.printf("%f\n", mokD); //소숫점자릿수 지정안하면 6자릿수
		 System.out.printf("%.2f\n", mokD);
		 System.out.println();
		 
		 System.out.printf("%.2f\n",356.789);
		 System.out.printf("%.2f\n",356.781);
		 System.out.println();
		 
		 System.out.printf("%8.2f\n",356.789);
		 System.out.printf("%8.2f\n",356.781);
	}//end 
}//LastFormat2 End









