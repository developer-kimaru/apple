package net.hb.day18_sample;

public class LastFormat {
	public static void main(String[] args) {
		 int a=19, b=3;
		 int mokC=0;
		 double mokD=0.0;
		 mokC = a/b;
		 mokD = (double)a/b;
		 //System.out.printf("%d\n", mokC);
		 //System.out.println(mokC);
		
		 System.out.printf("%f\n", mokD);
		 System.out.printf("%.2f\n", mokD);
		 System.out.println();
		 
		 System.out.printf("%.2f\n",356.789);
		 System.out.printf("%.2f\n",356.781);
		 System.out.println();
		 
		 System.out.printf("%8.2f\n",356.789);
		 System.out.printf("%8.2f\n",356.781);
	}//end 
}//LastFormat End









