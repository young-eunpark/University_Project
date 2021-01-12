package w14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DragCircle extends JFrame{
	DragCircle(){
		super("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new GraphicCircle());
		setSize(300,300);
		setVisible(true);
	}
	class GraphicCircle extends JPanel {
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		int ovalX=100, ovalY=100;
		public GraphicCircle() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);			
		}
	}
	public static void main(String[] args) {
		new DragCircle();
	}

}
