package w14;

import javax.swing.*;
import java.awt.*;
public class ThreeColor extends JFrame{
	ThreeColor(){
		setTitle("삼원색 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new JComponent() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.RED);
				g.fillArc(10, 10, 250, 250, 90, 120); 
				g.setColor(Color.BLUE);
				g.fillArc(10, 10, 250, 250, 210, 120);
			    g.setColor(Color.YELLOW);
				g.fillArc(10, 10, 250, 250, 330, 120); 
			}
		});
		setSize(300,320);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ThreeColor();
	}
}
