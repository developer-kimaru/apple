package net.tis.day24;
public class Circle {
	
	public int radius; //non-static�ʵ�
	public String name; //non-static�ʵ�
	
	public Circle() {
		radius=1;
		name = " ";
	}//������ end
	
	//187������ 9�� ����
		public Circle(int r, String n) {
			radius=r; name=n; 		
			System.out.println("��ǥ �޴��� "+name);
} //������ end

	public double getArea() { //non-static�ʵ�
		double cal = 3.14*radius*radius;
		return cal;	} //end
	
	public static void main(String Args[]) { //�����Ϸ��� �ʼ� �޼ҵ�
	//���� �Լ� �ȿ��� ��� ������ ���� ���
	//�и�=����ȭ=������Ʈ=�ڹٿ��� �Լ��� �и�, �ڹٿ��� Ŭ������ �и��ؼ� �ٽ�  �Լ��� �и�
		{Circle pizza; //182������ ��ü��������=������������=���۷�����������
		pizza = new Circle(10, "�ڹ�����"); //��üȭ=��ü����=�ν��Ͻ�����=�������
		// pizza.radius = 10; //�׳� radius=10; �ϸ� ���� �߻�
		// pizza.name = "��������";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);}
		
		
		
		//184vpdlwl 19�� ����
		Circle donut = new Circle ();
		donut.radius=2;
		donut.name="�ڹٵ���";
		double square = donut.getArea();
		System.out.println(donut.name+"�� ������ "+square);
		System.out.println("��ǥ �޴��� "+donut.name);
	}//main end
} //class end