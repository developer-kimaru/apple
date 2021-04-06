package net.tis.day24;

public class Board { 	//Board=getter메소드/setter메소드
						//Board 클래스는 한강다리
						//Board클래스는 ~~~.xml, ~~~.jsp의 연결을 도와주는 다리 역할
	public String reply ;
	public String like ;
	public String title ;
	public String writer ;
	public int cnt ;
	public java.util.Date wdate ;
	public double point ;
	
	public String getReply(){return reply;}
	public void setReply(String reply) {this.reply = reply;}
	public String getLike() {return like;}
	public void setLike(String like) {this.like = like;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public int getCnt() {return cnt;}
	public void setCnt(int cnt) {this.cnt = cnt;}
	public java.util.Date getWdate() {return wdate;}
	public void setWdate(java.util.Date wdate) {this.wdate = wdate;}
	public double getPoint() {return point;}
	public void setPoint(double point) {this.point = point;}
	
} //Board end