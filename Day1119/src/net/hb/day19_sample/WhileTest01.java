package net.hb.day19_sample;

public class WhileTest01 {

	public static void main(String[] args) {
			//119페이지 while(조건){ }
			//while반복문으로 1~10출력
			int su = 0 ;
			while(su<10) {
				su = su + 1 ;
				System.out.print(su + " ");
			}//while end
		
		   System.out.println();
		   System.out.println("----------------------------");
		   int kor=0,eng=0,tot=0;
		   double avg=0.0;
		   String msg="";
		   char grade='F'; //학점표시
		   
		   kor=90;
		   eng=95;

		   tot=kor+eng;
		   avg=(double)tot/2;
		   
		   //합격여부는  평균70점부터 축합격/ 0~69 재시험
		   if(avg>=70) { msg="축합격"; }
		   else { msg="재시험";  }
		   
		   //학점 switch(double타입은 문법에러)제어문 구하기 
		   // 82.7, 84.5  89.1
		   // 82    84    89   (int)
		   // 8     8     8     /10나누기몫 
		   
		   switch((int)avg/10) {
		       case 10: 
		       case 9: 
		    	   grade='A'; break;
		       case 8: 
		    	   grade='B'; break;
		       case 7: 
		    	   grade='C'; break;
		       case 6: 
		    	   grade='D'; break;
		       default:	   
		    	   grade='F'; break; 
		   }//switch end
		   
		   System.out.println("총점=" + tot);
		   System.out.println("평균=" + avg);
		   System.out.println("학점=" + grade);
		   System.out.println("결과=" + msg);
		   System.out.println("----------------------------");
	}//main end

}//WhileTest01 class END





