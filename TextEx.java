package w11;

import javax.swing.*;

import w11.MovingText.MyKeyListener;
import w11.MovingText.MyMouseListener;

import java.awt.*;
import java.awt.event.*;
public class TextEx extends JFrame{
	JPanel pnl=new JPanel();
	JLabel la=new JLabel("Hello");
	JLabel lb=new JLabel("x,y");
	final int UNIT=10;
	TextEx()
	{
		  setTitle("KeyEvent Test");
		  add(pnl,BorderLayout.CENTER);
		  add(lb,BorderLayout.SOUTH);
		  pnl.setLayout(null); 
		  pnl.addKeyListener(new MyKeyListener());
		  pnl.addMouseMotionListener(new MyMouseListener()); 
		  la.setLocation(250,150); 
		  la.setSize(100,100); 
		  Font f= new Font("Serif",Font.BOLD,25);
		  la.setForeground(Color.RED);
		  la.setFont(f);
		  pnl.add(la); 
		  
		  setSize(600,500); 
		  setVisible(true);
		  pnl.requestFocus();
	}
	class MyMouseListener extends MouseAdapter implements MouseMotionListener{
		  public void mousePressed(MouseEvent e){ 
			  int x = e.getX();
			  int y = e.getY();
			  la.setLocation(x, y); 
			  lb.setText(la.getX()+","+la.getY());
			  if(x>=600 || y>=500) {
				  la.setLocation(250, 150);
				  lb.setText(la.getX()+","+la.getY());
			  }
		  }
		  public void mouseDragged(MouseEvent e){
			  int x = e.getX();
			  int y = e.getY();
			  la.setLocation(x, y); 
			  lb.setText(la.getX()+","+la.getY());
			  if(x>=600 || y>=500) {
				  la.setLocation(250, 150);
				  lb.setText(la.getX()+","+la.getY());
			  }
		  }
	 }
	class MyKeyListener extends KeyAdapter {
	      public void keyPressed(KeyEvent e) {  
	    	  int keyCode = e.getKeyCode();
		         switch (keyCode) {
		          case KeyEvent.VK_UP:
		        	  la.setLocation(la.getX(),la.getY() - UNIT);
		        	  lb.setText(la.getX()+","+la.getY());
		              break;
		          case KeyEvent.VK_DOWN:
		              la.setLocation(la.getX(), la.getY() + UNIT);
		              lb.setText(la.getX()+","+la.getY());
		              break;
		          case KeyEvent.VK_LEFT:
		              la.setLocation(la.getX() - UNIT,la.getY());
		              lb.setText(la.getX()+","+la.getY());
		              break;
		          case KeyEvent.VK_RIGHT:
		              la.setLocation(la.getX() + UNIT, la.getY());
		              lb.setText(la.getX()+","+la.getY());
		              break;
		          }
	       }
	      public void keyReleased() {}
	}
	public static void main(String[] args)
	{
		new TextEx();
	}
}
