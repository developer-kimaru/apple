package net.hb.day19;
public class TestArray02 {

	enum Week {��, ȭ, ��, ��, ��, ��, ��}

	public static void main(String[] args) {

		int[] number = {1,2,4,8,16,32} ;
		for (int k : number) //136������ for~each �ݺ���
			{System.out.print(k+" ");}
		
		System.out.println();
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		
		for(String s:names) {System.out.print(s+" ");}
		System.out.println();
		
		for(Week day : Week.values())
		{System.out.print(day + "���� ");}
		
	}
}