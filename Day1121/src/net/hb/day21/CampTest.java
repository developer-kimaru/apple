package net.hb.day21;
import java.util.Scanner;
public class CampTest {
	public static void main(String[] args) {
		
		System.out.println("1�����迭 ķ�� ����");
		Scanner scanner = new Scanner (System.in);

		boolean camp [] =  new boolean [5];
		int sel = 9 , num  = 0;
		
		// ķ���� ������� Ȯ��
		for	(int a=0; a<camp.length; a++)
			{if	(camp[a]==true)
				{System.out.println("�� "+(a+1)+"��° ķ������ ������Դϴ�.");	}
			else
				{System.out.println("�� "+(a+1)+"��° ķ������ ����ֽ��ϴ�.");	}	} //for����
		
		while(true)
			{try
				{System.out.print("1.����\t2.���\t3.����\t9���� >> ");
				sel = Integer.parseInt(scanner.nextLine());
				
				switch(sel)
				{case 1 :
					System.out.print("�����Ͻ� ķ���� ��ȣ�� �Է����ּ��� >> ");
					num = Integer.parseInt(scanner.nextLine());
					if	(num <1 || num>5)
						{System.out.println(num+"��ȣ�� ����� �� �����ϴ�.");				}
					if	(camp[num-1]==true)
						{System.out.println("�̹� ����� ķ������ �̿��� �� �����ϴ�.");		}
					else
						{System.out.println("camp ["+num+"]�� ķ���� ���࿡ �����Ͽ����ϴ�.");
						camp[num-1]=true;											}
					for	(int a=0; a<camp.length; a++)
						{if	(camp[a]==true)
							{System.out.println("�� "+(a+1)+"��° ķ������ ������Դϴ�.");	}
						else
							{System.out.println("�� "+(a+1)+"��° ķ������ ����ֽ��ϴ�.");	}
						} break;
						
				case 2 :
					System.out.print("����� ķ���� ��ȣ�� �Է����ּ���. >>> ");
					num = Integer.parseInt(scanner.nextLine());
						if	(camp[num-1]==true)
							{System.out.println("camp [" + num + "] ķ���� ��� �����߽��ϴ�.");
							camp[num-1]=false;											}
						else
							{System.out.println("camp [" + num + "] ķ������ ����ֽ��ϴ�.");	}
						
						for	(int a=0; a<camp.length; a++)
							{if	(camp[a]==true)
								{System.out.println("�� "+(a+1)+"��° ķ������ ������Դϴ�.");	}
							else
								{System.out.println("�� "+(a+1)+"��° ķ������ ����ֽ��ϴ�.");	}
							} break;
							
				case 3 :
					for	(int a=0; a<camp.length; a++)
						{if	(camp[a]==true)
							{System.out.println("�� "+(a+1)+"��° ķ������ ������Դϴ�.");		}
						else
							{System.out.println("�� "+(a+1)+"��° ķ������ ����ֽ��ϴ�.");		}
						}	break;
						
				default :
					System.out.println("1~3���� �޴��� �����ϼž� �մϴ�.");
					break;	}}	catch(Exception e) {	}
					
				if	(sel==9)
					{System.out.println("ķ���� ���� ���α׷��� �����մϴ�.");	break;			}
							}
					
				scanner.close();
}}