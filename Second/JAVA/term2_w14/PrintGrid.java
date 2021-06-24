package w14;

import javax.swing.*;
import java.awt.*;
public class PrintGrid extends JFrame{
	PrintGrid(){
		super("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new Grid());
		setSize(300,200);
		setVisible(true);
	}
	class Grid extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int dw = getWidth()/10;
			for(int i=1; i<=9; i++)
				g.drawLine(i*dw,  0, i*dw, getHeight()); // 수직선
			int dh = getHeight()/10;			
			for(int i=1; i<=9; i++)
				g.drawLine(0, i*dh, getWidth(), i*dh); //  수평선 
		}
	}
	public static void main(String[] args) {
		new PrintGrid();
	}
}
