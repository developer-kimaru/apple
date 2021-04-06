package net.hb.day17;
public class Three { //Java언어 -> jsp, spring, 안드로이드
	public static void main(String[] args) { //이렇게가 한 세트. 하나라도 다른 것으로 변경하면 안 됨
		int kor=0, eng=0, sum=0;
		double ave=0.0; //평균
		String message="합격재시험메세지";
		
		kor=90;
		eng=45;
		// 총점, 평균 구해서 출력
		
		sum=kor+eng;
		ave=(double)sum/2; //sum도 정수형, 나누는 2도 정수형 -> 정수로 인식하여 소수점 반영이 안됨
		//(double)을 통해서 상수로 변경해주어야함
		
		if (ave >= 70) //괄호는 없어도 무방
			message = "축 합격";
		else
			message = "재시험";
		
		System.out.print("결과 = "+message+"\n");
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+ave);
		//System out println : 줄 바꾸기 있음
		//System out print : 줄 바꾸기 없음. 줄 바꾸고 싶은 경우 끝에 "\n"을 붙여줄 것
		//"\t"를 입력하면 탭키를 눌러 간격을 벌린 것과 같은 기능
		//System.out.println() : 공란 /System.out.print() : 오류 발생 
		System.out.print("결과 = "+message+"\t");
		System.out.print("총점 = "+sum+"\t");
		System.out.print("평균 = "+ave+"\t");
	}

}
