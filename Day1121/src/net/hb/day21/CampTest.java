package net.hb.day21;
import java.util.Scanner;
public class CampTest {
	public static void main(String[] args) {
		
		System.out.println("1차원배열 캠프 예매");
		Scanner scanner = new Scanner (System.in);

		boolean camp [] =  new boolean [5];
		int sel = 9 , num  = 0;
		
		// 캠핑장 예약상태 확인
		for	(int a=0; a<camp.length; a++)
			{if	(camp[a]==true)
				{System.out.println("■ "+(a+1)+"번째 캠프장은 사용중입니다.");	}
			else
				{System.out.println("□ "+(a+1)+"번째 캠프장은 비어있습니다.");	}	} //for종료
		
		while(true)
			{try
				{System.out.print("1.예약\t2.퇴실\t3.보기\t9종료 >> ");
				sel = Integer.parseInt(scanner.nextLine());
				
				switch(sel)
				{case 1 :
					System.out.print("예약하실 캠핑장 번호를 입력해주세요 >> ");
					num = Integer.parseInt(scanner.nextLine());
					if	(num <1 || num>5)
						{System.out.println(num+"번호는 사용할 수 없습니다.");				}
					if	(camp[num-1]==true)
						{System.out.println("이미 예약된 캠프장은 이용할 수 없습니다.");		}
					else
						{System.out.println("camp ["+num+"]번 캠프장 예약에 성공하였습니다.");
						camp[num-1]=true;											}
					for	(int a=0; a<camp.length; a++)
						{if	(camp[a]==true)
							{System.out.println("■ "+(a+1)+"번째 캠프장은 사용중입니다.");	}
						else
							{System.out.println("□ "+(a+1)+"번째 캠프장은 비어있습니다.");	}
						} break;
						
				case 2 :
					System.out.print("퇴실할 캠핑장 번호를 입력해주세요. >>> ");
					num = Integer.parseInt(scanner.nextLine());
						if	(camp[num-1]==true)
							{System.out.println("camp [" + num + "] 캠프장 퇴실 성공했습니다.");
							camp[num-1]=false;											}
						else
							{System.out.println("camp [" + num + "] 캠프장은 비어있습니다.");	}
						
						for	(int a=0; a<camp.length; a++)
							{if	(camp[a]==true)
								{System.out.println("■ "+(a+1)+"번째 캠프장은 사용중입니다.");	}
							else
								{System.out.println("□ "+(a+1)+"번째 캠프장은 비어있습니다.");	}
							} break;
							
				case 3 :
					for	(int a=0; a<camp.length; a++)
						{if	(camp[a]==true)
							{System.out.println("■ "+(a+1)+"번째 캠프장은 사용중입니다.");		}
						else
							{System.out.println("□ "+(a+1)+"번째 캠프장은 비어있습니다.");		}
						}	break;
						
				default :
					System.out.println("1~3번의 메뉴를 선택하셔야 합니다.");
					break;	}}	catch(Exception e) {	}
					
				if	(sel==9)
					{System.out.println("캠프장 예약 프로그램을 종료합니다.");	break;			}
							}
					
				scanner.close();
}}