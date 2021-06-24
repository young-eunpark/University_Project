package w14;

import javax.swing.*;
import java.awt.*;
public class ButtonImage extends JFrame{
	ButtonImage(){
		super("이미지 그리기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new ShowImage());
		setSize(300,300);
		setVisible(true);
	}
	class ShowImage extends JPanel{
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		public ShowImage() {
			setLayout(new FlowLayout());
			add(new JButton("Show"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new ButtonImage();
	}
}
