package net.hb.day19_sample;

public class Test06_2 {
	public static void main(String[] args) {
		int money = 65430;
		int a, b, c, d;
		System.out.println("money = " + money);
		a = money / 10000;
		money -= a*10000;
		b = money / 1000;
		money -= b*1000;
		c = money / 100;
		money -= c*100;
		d = money / 10;
		money -= d*10;
		System.out.println("���� = " + a);
		System.out.println("õ�� = " + b);
		System.out.println("��� = " + c);
		System.out.println("�ʿ� = " + d);

	}//main end
}//class END
