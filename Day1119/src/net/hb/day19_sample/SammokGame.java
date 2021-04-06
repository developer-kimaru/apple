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
	 Label time_lb = new Label("���۹�ư�� ������ ���ӽ��۵˴ϴ�");
	 //Label score_lb = new Label("", Label.CENTER);
	 JPanel jp = new JPanel();
	 GridLayout gl = new GridLayout(1,2);
	
	 JPanel jp1 = new JPanel();
	 GridLayout gl1 = new GridLayout(3,3); //3��X3�� ���ΰ���0, ���ΰ���0
	 JButton jbt [] = new JButton[9];
	 ImageIcon index[ ] = new ImageIcon[9];
	
	 JPanel jp2 = new JPanel();
	 GridLayout gl2 = new GridLayout(1,3,5,5);
	 JButton start_bt = new JButton("����");
	 JButton next_bt = new JButton("����");
	 JButton end_bt = new JButton("����");
	 boolean flag=false;

	int ransu[ ] = new int[9]; //9���迭
	int jumsu[ ] = new int[9]; //9���迭  
	int co;
	int count = 0;
	int maxScore = 0;
	
	
	public SammokGame( ) { } //�⺻������ 
	
	public SammokGame(String title){
		this.init( );
		this.my();
		this.start( );
		
		super.setBounds(250, 250, 300, 300);
		super.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ����
		this.addWindowListener(new WindowAdapter(){ 
		   public void windowClosing(WindowEvent e) { System.exit(0);}
		});
	}//������ end

	public void init(){
		con = this.getContentPane();
		con.setLayout(bl);
		con.add("North", jp);
		jp.setLayout(gl); //gl = new GridLayout(1,2);
		jp.add(time_lb);
		//jp.add(score_lb);
		con.add(jp1);
		con.add("South", jp2);
		
		jp1.setLayout(gl1); //gl1 = new GridLayout(3,3); //3��X3�� ���ΰ���0, ���ΰ���0
		for(int i=0; i<9; ++i){
			jbt[i] = new JButton(i+"��ư");  //JButton jbt [] = new JButton[9];
			jp1.add(jbt[i]); //jbt��ư�� �ǳڿ� �߰�  
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

	public void actionPerformed(ActionEvent e){ //non-static,����X,�Ű� 1
		if (e.getSource()==start_bt){ //���۹�ư
			on_button( ); //ctrl+���콺����/���� alt+����Ű����
			time_lb.setText(""); //���۹�ư�� �������� �ȳ��޼��� ����
		}else if (e.getSource() == next_bt){ //������ư
		  off_button();
		  time_lb.setText("���۹�ư�� ������ ���ӽ��۵˴ϴ�"); //���۹�ư�� �������� �ȳ��޼��� ǥ��
		}else if (e.getSource() == end_bt){
			System.out.println("������ ���α׷��� �����մϴ�");
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

	public void game( ) { //���Ӱ��
		 if(jumsu[0]==7 && jumsu[4]==7 && jumsu[8]==7) {
			 JOptionPane.showMessageDialog(this,"����ĳ���� ��Ʈ��Ʈ �¸��Ͽ����ϴ� ");
			 imageclear();
		 }else if(jumsu[2]==7 && jumsu[4]==7 && jumsu[6]==7) {
			 JOptionPane.showMessageDialog(this,"����ĳ���� ��Ʈ��Ʈ �¸��Ͽ����ϴ� ");
			 imageclear();
		 }else if(jumsu[0]==8 && jumsu[4]==8 && jumsu[8]==8) {
			 JOptionPane.showMessageDialog(this,"�����䲤���䳢  �¸��Ͽ����ϴ� ");
			 imageclear();
		 }else if(jumsu[2]==8 && jumsu[4]==8 && jumsu[6]==8) {
			 JOptionPane.showMessageDialog(this,"�����䲤���䳢  �¸��Ͽ����ϴ� ");
			 imageclear();
		 }else { }
		 
		 //for�ݺ������� ���� �¸� 
		 for(int a=0; a<=6; a=a+3) { //����
			  if(jumsu[a]==7 && jumsu[a+1]==7 && jumsu[a+2]==7) {
				 JOptionPane.showMessageDialog(this,"����ĳ���� ��Ʈ��Ʈ �¸��Ͽ����ϴ� ");
				 imageclear();
			  }else if(jumsu[a]==8 && jumsu[a+1]==8 && jumsu[a+2]==8) {
				 JOptionPane.showMessageDialog(this,"�����䲤���䳢  �¸��Ͽ����ϴ� ");
				 imageclear();
			  } 
		 }
		 
		 for(int b=0; b<3; b=b+1) { //���� 
			  if(jumsu[b]==7 && jumsu[b+3]==7 && jumsu[b+6]==7) {
					 JOptionPane.showMessageDialog(this,"����ĳ���� ��Ʈ��Ʈ �¸��Ͽ����ϴ� ");
					 imageclear();
				 }else if(jumsu[b]==8 && jumsu[b+3]==8 && jumsu[b+6]==8) {
					 JOptionPane.showMessageDialog(this,"�����䲤���䳢  �¸��Ͽ����ϴ� ");
					 imageclear();
				 } 
		 }//for end
	}//game end
	
	
	public void imageclear(){
		for(int i=0; i<9; ++i){
		 	 jbt[i].setText(""); 
			 jbt[i].setIcon(null);
			 jumsu[i] = 0;
			 ransu[i] = 0; //9���迭
			 jumsu[i] = 0; //9���迭  
		}//i ���
	}//imageclear end
	
	public void off_button(){
		count = 0;
		for(int i=0; i<9; ++i){
			jbt[i].setEnabled(false); //��ư��Ȱ��ȭ
		}
		start_bt.setEnabled(true);
		next_bt.setEnabled(false);
	}//end

	public void on_button(){  //non-static�޼ҵ�, ����X, �Ű�����X
		for(int i=0; i<9; ++i){
			jbt[i].setEnabled(true); //0~8��ư Ȱ��ȭ=>Ŭ���Ҷ� �׸��̹��� 
		}
		start_bt.setEnabled(false); //���۹�ư�� ��Ȱ��ȭ
		next_bt.setEnabled(true); //������ư Ȱ��ȭ
		this.end_bt.setEnabled(true); //�����ư�� Ȱ��ȭ/��Ȱ��ȭ
	}//end
	
	
	public void my(){
		for(int i=0; i<9; ++i){
			jbt[i].setText(i +" "); 
		}//i ���
	}//my end
	
	public static void main(String[] args) {
		SammokGame ng=new SammokGame("������");
	}//main end
	
}//SammokGame class END



