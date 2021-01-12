package w14;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Olympic extends JFrame{
	Olympic() {
		super("¿À·û±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new Flag());
		setSize(350,250);
		setVisible(true);
	}
	class Flag extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(5));

			g.setColor(Color.BLUE);
			g.drawOval(10, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(100, 10, 100, 100);
			g.setColor(Color.RED);
			g.drawOval(190, 10, 100, 100);
			g.setColor(Color.YELLOW);
			g.drawOval(50, 80, 100, 100);
			g.setColor(Color.GREEN);
			g.drawOval(140, 80, 100, 100);
		}
	}
	public static void main(String[] args) {
		new Olympic();
	}

}
