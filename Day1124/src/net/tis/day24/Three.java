package net.tis.day24;
public class Three {
	public static void main(String[] args) {
		// Three.myCal(7, 2); << ���� �߻�
		Three aa = new Three();
		aa.myCal(7, 2);
		aa.myCal(175.0);
	} // end
	
	public void myCal(double data) {
		double quo = data/2;
		System.out.println("myCal �޼ҵ� ��� = "+quo);
		System.out.println("myCal �޼ҵ� ���= "+(data/2));
	} // end
	
	public void myCal(int a, int b) { // non-static �޼ҵ�
		int sum = a+b;
		System.out.println("myCal �޼ҵ� �հ� = "+(a+b));
		System.out.println("myCal �޼ҵ� �հ� = "+sum);
	} //end
} //class Three end