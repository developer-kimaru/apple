package net.hb.day17;
public class Starcraft {

	public static void main(String[] args) { //main은 1개
		System.out.println("스타크래프트");
	}
	class Terran { //Starcraft$Terran.class 생성, Terran.java는 생성 안 됨.
	}
	
	class Zerg { //Starcraft$zerg.class 생성, Zerg.java는 생성 안 됨.
	}
}

	class Maplestory { //Maplestory.class 생성, Maplestory.java는 생성 안 됨. main은 붙이지 않음
		public void pinkbean() {
			System.out.println("핑크빈");
		}
	}