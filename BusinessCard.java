package w14;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class BusinessCard extends JFrame{
	Container c=getContentPane();
	BusinessCard(){
		setTitle("����");
		setSize(300,150);
		Bcard b = new Bcard();
		b.setBackground(Color.lightGray);
		add(b);
		setVisible(true);
	}
	class Bcard extends JPanel{
		ImageIcon image=new ImageIcon("Images/Koala.png");
		Image img=image.getImage();
		public void paint(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.black);
			g.setFont(new Font("����ü",Font.BOLD,20));
			g.drawString("ȫ�浿", 150, 40);
			g.setColor(Color.blue);
			g.setFont(new Font("���ü",Font.BOLD,15));
			g.drawString("ȣ�����б�", 150, 60);
			g.drawString("041-540-0001",150,80);
			g.drawImage(img, 20, 20, 80,80,this);
		}
	}
	public static void main(String[] args) {
		new BusinessCard();
	}
}
