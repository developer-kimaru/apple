package net.tis.day24;
public class Two {
	public Two() {} //�⺻ ������=���� ����, new Ű���� ������ ������ ���
	
	public static void main(String[] args) {
		//this.note();	<< static Ű���尡 ���� �� this ��� �Ұ�
		//Two.note();	<< main �޼ҵ�� static�� �־ static���� note ��� �Ұ�
		Two aa = new Two ();	aa.note(); //non-static �޼ҵ� ������ ���� aa��ü ����
		System.out.println("main �޼ҵ�");
		System.out.println("main ������");
		System.out.println("main ������");
	} // end
	
	public double rate ()	{ //non-static �޼ҵ�
		double r = 7.8;		return r;}
	
	public boolean getConnect() {
		boolean ct = true;	return ct;}
	
	public int price() {
		int value = 2900;	return value;}
	
	public String getTitle() {
		String title = "��� ����";	return title;
		}	//end, return�� �ָ� getTitle()�� "��� ����"�� �����
	
	public void note() { //non-static �޼ҵ忡���� this ��� ����
		// System.out.println(title); << ����
		// non-static �޼ҵ忡���� this Ű���� ��� ����
		// non-static �޼ҵ忡���� this.���� ����� ǥ�õ�
		// note �޼ҵ带 main���� ȣ��
		System.out.println(getTitle());
		String a = this.getTitle();
		System.out.println(getTitle());
		} //end
	
} //Two class end