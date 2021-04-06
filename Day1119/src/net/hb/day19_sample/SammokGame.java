package net.hb.day19_sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class SammokGame extends JFrame implements ActionListener {
	 Container con;
	 BorderLayout bl = new BorderLayout();
	 Label time_lb = new Label("시작버튼을 눌려야 게임시작됩니다");
	 //Label score_lb = new Label("", Label.CENTER);
	 JPanel jp = new JPanel();
	 GridLayout gl = new GridLayout(1,2);
	
	 JPanel jp1 = new JPanel();
	 GridLayout gl1 = new GridLayout(3,3); //3행X3열 가로간격0, 세로간격0
	 JButton jbt [] = new JButton[9];
	 ImageIcon index[ ] = new ImageIcon[9];
	
	 JPanel jp2 = new JPanel();
	 GridLayout gl2 = new GridLayout(1,3,5,5);
	 JButton start_bt = new JButton("시작");
	 JButton next_bt = new JButton("다음");
	 JButton end_bt = new JButton("종료");
	 boolean flag=false;

	int ransu[ ] = new int[9]; //9개배열
	int jumsu[ ] = new int[9]; //9개배열  
	int co;
	int count = 0;
	int maxScore = 0;
	
	
	public SammokGame( ) { } //기본생성자 
	
	public SammokGame(String title){
		this.init( );
		this.my();
		this.start( );
		
		super.setBounds(250, 250, 300, 300);
		super.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 가능
		this.addWindowListener(new WindowAdapter(){ 
		   public void windowClosing(WindowEvent e) { System.exit(0);}
		});
	}//생성자 end

	public void init(){
		con = this.getContentPane();
		con.setLayout(bl);
		con.add("North", jp);
		jp.setLayout(gl); //gl = new GridLayout(1,2);
		jp.add(time_lb);
		//jp.add(score_lb);
		con.add(jp1);
		con.add("South", jp2);
		
		jp1.setLayout(gl1); //gl1 = new GridLayout(3,3); //3행X3열 가로간격0, 세로간격0
		for(int i=0; i<9; ++i){
			jbt[i] = new JButton(i+"버튼");  //JButton jbt [] = new JButton[9];
			jp1.add(jbt[i]); //jbt버튼을 판넬에 추가  
		}
		
		jp2.setLayout(gl2); //gl2 = new GridLayout(1,3,5,5);
		jp2.add(start_bt);
		jp2.add(next_bt);
		jp2.add(end_bt);
		off_button();
		start_bt.setEnabled(true);
		next_bt.setEnabled(false);
	}//end


	public void start(){
		start_bt.addActionListener(this);
		next_bt.addActionListener(this);
		end_bt.addActionListener(this);
		for(int i=0; i<9; ++i){
			jbt[i].addActionListener(this);
		}
	}//end

	public void actionPerformed(ActionEvent e){ //non-static,리턴X,매개 1
		if (e.getSource()==start_bt){ //시작버튼
			on_button( ); //ctrl+마우스왼쪽/복귀 alt+방향키왼쪽
			time_lb.setText(""); //시작버튼을 누르세요 안내메세지 삭제
		}else if (e.getSource() == next_bt){ //다음버튼
		  off_button();
		  time_lb.setText("시작버튼을 눌려야 게임시작됩니다"); //시작버튼을 누르세요 안내메세지 표시
		}else if (e.getSource() == end_bt){
			System.out.println("삼목게임 프로그램을 종료합니다");
			System.exit(0);
		}
		
		for(int i=0; i<9; ++i){
			if (e.getSource() == jbt[i]){
				 if(flag==false) {
						 if(index[i] != null) { continue;  }
						 else {
					   index[i] = new ImageIcon("image/x.gif"); 
					   jbt[i].setIcon(index[i]);
					    flag=true;
					    jumsu[i]=7;
					    game( );
					   }
				 }else {
						 if(index[i] != null) { continue;  }
						 else {
						 index[i] = new ImageIcon("image/y.gif"); 
					   jbt[i].setIcon(index[i]);
					   flag=false;
					   jumsu[i]=8;
					   game( );
						 }
				 }
			}
		}//for i end
	}//end

	public void game( ) { //게임결과
		 if(jumsu[0]==7 && jumsu[4]==7 && jumsu[8]==7) {
			 JOptionPane.showMessageDialog(this,"인형캐릭터 하트하트 승리하였습니다 ");
			 imageclear();
		 }else if(jumsu[2]==7 && jumsu[4]==7 && jumsu[6]==7) {
			 JOptionPane.showMessageDialog(this,"인형캐릭터 하트하트 승리하였습니다 ");
			 imageclear();
		 }else if(jumsu[0]==8 && jumsu[4]==8 && jumsu[8]==8) {
			 JOptionPane.showMessageDialog(this,"공부토깽이토끼  승리하였습니다 ");
			 imageclear();
		 }else if(jumsu[2]==8 && jumsu[4]==8 && jumsu[6]==8) {
			 JOptionPane.showMessageDialog(this,"공부토깽이토끼  승리하였습니다 ");
			 imageclear();
		 }else { }
		 
		 //for반복문으로 가로 승리 
		 for(int a=0; a<=6; a=a+3) { //가로
			  if(jumsu[a]==7 && jumsu[a+1]==7 && jumsu[a+2]==7) {
				 JOptionPane.showMessageDialog(this,"인형캐릭터 하트하트 승리하였습니다 ");
				 imageclear();
			  }else if(jumsu[a]==8 && jumsu[a+1]==8 && jumsu[a+2]==8) {
				 JOptionPane.showMessageDialog(this,"공부토깽이토끼  승리하였습니다 ");
				 imageclear();
			  } 
		 }
		 
		 for(int b=0; b<3; b=b+1) { //세로 
			  if(jumsu[b]==7 && jumsu[b+3]==7 && jumsu[b+6]==7) {
					 JOptionPane.showMessageDialog(this,"인형캐릭터 하트하트 승리하였습니다 ");
					 imageclear();
				 }else if(jumsu[b]==8 && jumsu[b+3]==8 && jumsu[b+6]==8) {
					 JOptionPane.showMessageDialog(this,"공부토깽이토끼  승리하였습니다 ");
					 imageclear();
				 } 
		 }//for end
	}//game end
	
	
	public void imageclear(){
		for(int i=0; i<9; ++i){
		 	 jbt[i].setText(""); 
			 jbt[i].setIcon(null);
			 jumsu[i] = 0;
			 ransu[i] = 0; //9개배열
			 jumsu[i] = 0; //9개배열  
		}//i 출력
	}//imageclear end
	
	public void off_button(){
		count = 0;
		for(int i=0; i<9; ++i){
			jbt[i].setEnabled(false); //버튼비활성화
		}
		start_bt.setEnabled(true);
		next_bt.setEnabled(false);
	}//end

	public void on_button(){  //non-static메소드, 리턴X, 매개인자X
		for(int i=0; i<9; ++i){
			jbt[i].setEnabled(true); //0~8버튼 활성화=>클릭할때 그림이미지 
		}
		start_bt.setEnabled(false); //시작버튼은 비활성화
		next_bt.setEnabled(true); //다음버튼 활성화
		this.end_bt.setEnabled(true); //종료버튼은 활성화/비활성화
	}//end
	
	
	public void my(){
		for(int i=0; i<9; ++i){
			jbt[i].setText(i +" "); 
		}//i 출력
	}//my end
	
	public static void main(String[] args) {
		SammokGame ng=new SammokGame("삼목게임");
	}//main end
	
}//SammokGame class END



