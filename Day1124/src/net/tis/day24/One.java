package net.tis.day24;
public class One {
		public String title = "ȭ���� ���ݼ���";	//�������� =field=�ʵ�=�������
											//non-static �ʵ�=field
		public int qwd=1234;				//non-static �ʵ�=field
		
	public static void main(String[] args) {
		String title = "�����"; 				//��������=local variable=����
		System.out.println("�������� title" + title);	} // end
	
	public One() {
		//�⺻������, ��������, ȣ���� new ������ ()
		//�����ڴ� Ŭ���� �̸��� 100% �����ؾ��ϸ�, void ��� ����, ���ϰ� ����
		//��������=�ʵ�=field������ �ʱ�ȭ
		System.out.println("�⺻������");
		System.out.println("�⺻������ ���� ����");
		One one = new One() ; }
		//�����ڵ� �޼ҵ� ����ȭ, �޼ҵ�� �ݵ�� ȣ���ؾ� ���
		//OneŸ�� one ������ü = new �޸𸮿��� �� First() ������;
		//�⺻������ end
		
	public static void food() { //static �޼ҵ� = Ŭ���� �޼ҵ�
		System.out.println("���ĸ޴� ����");}//end
	
	public void order () { //non-static �޼ҵ� = �Ϲ� �޼ҵ�
		System.out.println("�ֹ�����"); } //end

}//class end